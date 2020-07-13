package ejercicio;

import ejerciciolista.*;

public class Nodo {
    private String nombre;
    private int nota;
    private String codigo;
   private Nodo siguiente;
   
public Nodo(Nodo siguiente,String nombre , String codigo , int nota){
    this. siguiente = siguiente;
    this.nombre = nombre;
    this.codigo = codigo ;
    this.nota = nota;
}

    public Nodo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //aqui te tiene que retornar un Nodo
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
       this.codigo = codigo;
    
    
  
}}