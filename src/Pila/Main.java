package Pila;

import java.util.Scanner;

public class Main {
    static private pila pila;
    static int num=0;
    
    
    
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        while(num!=4){
            
            num = 0;
            System.out.println("Elije una cosa del menu\n1.Agergar Taco\n2.Ver tacos\n3.Eliminar Taco\n4.Salir");
            num = sc.nextInt();
            switch (num){
                case 1:{
                    int id =0;
                    String nombre="";
                    System.out.println("Dijite el id del taco");
                    id=sc.nextInt();
                    System.out.println("Dijite el nombre del taco");
                    sc.nextLine();
                    nombre = sc.nextLine();
                    pila.push(id, nombre);
                    break;
                }
                case 2:{
                    String result;
                    result = pila.recorrerPila();
                    System.out.println(result);
                    break;
                }
                case 3:{
                    String result;
                    result = pila.pop();
                    System.out.println(result);
                    break;
                }
                case 4:{
                    System.exit(0);
                }
                default:{
                    System.out.println("no se que elejiste atte: yo mariana");
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        menu();
    }
}
