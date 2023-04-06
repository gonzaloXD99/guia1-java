/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author gonza
 */
public class Jugador {
    private String nombre;
    public int puntaje;
    private String nacionalidad;
    private int edad;
    //constructor vacio
    public Jugador(){}
    public Jugador(String nombre,int puntaje,String nacionalidad, int edad){
        this.nombre=nombre;
        this.puntaje=puntaje;
        this.nacionalidad=nacionalidad;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrarAtributos(){
        System.out.println("\n El jugador "+nombre+" de nacionalidad "+nacionalidad+" tiene "+edad+" años y lleva "+puntaje+" puntos acumulados");
    }
}
