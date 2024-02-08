package Pila;

public class Taco {
    private int id;
    private String NombreTaco;
    private Taco next;

    public Taco(int id, String NombreTaco) {
        this.id = id;
        this.NombreTaco = NombreTaco;
        this.next = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreTaco() {
        return NombreTaco;
    }

    public void setNombreTaco(String NombreTaco) {
        this.NombreTaco = NombreTaco;
    }

    public Taco getNext() {
        return next;
    }

    public void setNext(Taco next) {
        this.next = next;
    }
    
    
}
