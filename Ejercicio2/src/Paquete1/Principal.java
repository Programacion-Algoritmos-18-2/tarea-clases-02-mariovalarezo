/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

/**
 *
 * @author Mario
 */
class Principal {

    public static void main(String[] args) {
        Precio p = new Precio();
        System.out.println(p.euros);
        p.euros = 10.1;
        System.out.println(p.euros);

    }
}
