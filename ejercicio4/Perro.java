/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author gonza
 */
public class Perro {
    public String nombre;
    public String raza;
    public double peso;
    public int edad;
    public Perro(String nombre,String raza,double peso,int edad){
        this.nombre=nombre;
        this.raza=raza;
        this.peso=peso;
        this.edad=edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     public void mostrarInfo(){
    System.out.println(getNombre());
        System.out.println(getRaza());
        System.out.println(getPeso());
        System.out.println(getEdad());


    }
    
    
    
}
