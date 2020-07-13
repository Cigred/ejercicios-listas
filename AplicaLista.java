package ejercicio;
import ejerciciolista.*;
import java.util.Scanner;
public class AplicaLista {
 static Scanner teclado=new Scanner(System.in);
    public static Lista lista=new Lista();
    static Nodo nodo;
    
    public static void main (String args[]){
    MenuNodo();
}

    static void MenuNodo(){
        int opcion; 
        
        do{
            System.out.println("========================");
            System.out.println("\nMenú de Opciones");
            System.out.println("===========================");
            System.out.println("[1] Insertar nombre");
            System.out.println("[2] Mostrar los Elementos");
            System.out.println("[3] Eliminar Lista");
            System.out.println("[4] Buscar datos");
            System.out.println("=============================");
            System.out.println("[0] Salir");
            
            System.out.print("\nIngrese una Opción: ");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1 : 
                     ingreso();
                    break;
                case 2 : 
                    lista.listar();
                    break;
                case 3 : 
                    lista.Eliminarlista();
                    break; 
                case 4 : 
                //lista.buscar(nombre);
                    break;    
                    
                case 0 : 
                    System.out.println("Saliendo del sistema....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese Opción Correcta....");
                    System.out.println("\n");
            }
        } while (opcion!=0);
    }
    
    static void ingreso(){
       System.out.println("Ingrese nombre: ");
       teclado.nextLine();
       String nom=teclado.nextLine();
       System.out.println("Ingrese codigo: ");
       String cod=teclado.nextLine();
       System.out.println("Ingrese nota: ");
       int nota=teclado.nextInt();
       lista.agregarInicio(nom, cod, nota);
    }
}

