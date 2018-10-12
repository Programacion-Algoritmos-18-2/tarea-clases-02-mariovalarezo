package Paquete2;



/**
 *
 * @author Mario
 */
public class Precio {

   private double euros;

    public double obtener() {

        return euros;
    }

    public void agregar(double x) {
        euros = x;

    }

}

class Principal {

    public static void main(String[] args) {
        Precio p = new Precio();
        /*System.out.println(p.euros);
        p.euros = 10.1;
        System.out.println(p.euros);
        */
         p.agregar(20.2);
         System.out.println(p.obtener());

    }

}
