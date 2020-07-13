package ejercicio;

import ejerciciolista.*;
import java.util.Scanner;

public class Lista {
  private Nodo inicio;
    private int tamanio;
    int tope;
     Nodo [] nodos;
    Nodo per = new Nodo();
static Scanner teclado = new Scanner(System.in);
    public Lista() {
        inicio=null;
        tamanio=0;
        tope = 0;
    }
    public boolean esVacia(){
        return inicio==null;
    }
    //que paso? para que ingrese el nombre
     public void agregarInicio(String nombre , String  codigo , int nota){
        Nodo nuevo= new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setCodigo(codigo);
        nuevo.setNota(nota);
        if(esVacia()){//inicio==null
            inicio=nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
        }
        tamanio++;
    }
    public void listar(){
        if(!esVacia()){
            Nodo aux = inicio;
            while(aux!=null){
                System.out.print("[ " +aux.getNombre()+" ]"+"[ "+aux.getCodigo()+" ]"+"[ "+ aux.getNota()+ " ]"+"\n");
               aux = aux.getSiguiente();
               
            }
        }else{
            System.out.println("La lista esta vacia....");
        }}
     public void Eliminarlista(){    
    inicio= null;
    System.out.println( "Eliminacion correcta");  
     }
//   public boolean buscar(String nombre){
  //      Nodo aux = inicio; 
    //    boolean encontrado = false;      
      //  while(aux != null && encontrado != true){
        //    if (nombre == aux.getNombre()){
            //    encontrado = true;
          //  }
          //  else{
            //    aux = aux.getSiguiente();
         //   }
       // }
    //    return encontrado;
   // }
   
   }
   