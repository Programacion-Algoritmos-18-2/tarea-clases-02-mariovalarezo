package Paquete3;
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
    public Precio(){
        agregar(30.2);
    }
    
    public Precio(double y){
        agregar(y);
    }

}

class Principal {

    public static void main(String[] args) {
        Precio p = new Precio();
        Precio n = new Precio(25.9);
        /*System.out.println(p.euros);
        p.euros = 10.1;
        System.out.println(p.euros);
        
         p.agregar(20.2);*/
        
         System.out.println(p.obtener());
         System.out.println(n.obtener());

    }

}
