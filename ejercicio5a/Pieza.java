/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5a;

/**
 *
 * @author gonza
 */
public class Pieza {
    
    private String nombre;
    private String color;
    private String movimiento;
    private String posinicial;
    private int cantpasos;

    public Pieza(String nombre,String color,String movimiento,String posinicial,int cantpasos) {
        this.nombre=nombre;
        this.color=color;
        this.movimiento=movimiento;
        this.posinicial=posinicial;
        this.cantpasos=cantpasos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public String getPosinicial() {
        return posinicial;
    }

    public void setPosinicial(String posinicial) {
        this.posinicial = posinicial;
    }

    public int getCantpasos() {
        return cantpasos;
    }

    public void setCantpasos(int cantpasos) {
        this.cantpasos = cantpasos;
    }
    
}



