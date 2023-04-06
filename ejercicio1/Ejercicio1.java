/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author gonza
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto fideo=new Producto(10,"tallarin",230,23);
        System.out.println(fideo.getCodigo());
        System.out.println(fideo.getDescripcion());
        System.out.println(fideo.getPrecio());
        System.out.println(fideo.getStock());
        


    }
    
}
