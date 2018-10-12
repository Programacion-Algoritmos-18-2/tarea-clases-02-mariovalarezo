/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2.pkg1;

/**
 *
 * @author Mario
 */
public class Precio {

    double euros;

    public double obtener() {

        return 0;
    }

    public void agregar(double x) {

    }

}

class Principal {

    public static void main(String[] args) {
        Precio p = new Precio();
        System.out.println(p.euros);
        p.euros = 10.1;
        System.out.println(p.euros);

    }

}
