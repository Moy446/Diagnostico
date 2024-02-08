
package Pila;

public class pila {
    static public Taco pila;
    
    public pila() {
        this.pila = null;
    }
    public static void push (int id, String nombre){
        Taco nuevo = new Taco(id, nombre);
        if (pila == null) {
            pila  = nuevo;
        }else{
            Taco aux = pila;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(nuevo);
        }        
    }
    public static String recorrerPila(){
        Taco aux = pila;
        String valores = "";
        if (pila == null) {
            valores += "la pila esta vacia";
        }else{
            while (aux != null){
                valores+= "----------------------------------------------\n";
                valores+= "ID Taco: "+aux.getId()+"\n";
                valores+= "Nombre taco: "+aux.getNombreTaco()+"\n";
                
                aux = aux.getNext();
            }
        }
        return valores;
    }
    public static String pop(){
        Taco aux = pila;
        String valores = "";
        if (pila == null) {
            valores = "la pila esta vacia";
        }else{
            if (aux.getNext()== null) {
                pila = null;
            }else{
                pila = aux.getNext();
            }
            valores = "se elimino el registro: "+aux.getId();
        }
        return valores;
    }
}
