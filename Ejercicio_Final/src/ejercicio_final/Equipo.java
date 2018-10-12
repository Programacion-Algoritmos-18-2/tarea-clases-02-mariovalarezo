/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_final;


public class Equipo {

    private String nombre, ciudad;
    private int num_jugadores;
/**
 * Obtiene el valor de variable nombre
 * @return 
 */
    public String obtener_nombre() {

        return nombre;
    }
/**
 * Obtiene el valor de la variable num_jugadores
 * @return 
 */
    public int obtener_juadores() {

        return num_jugadores;
    }
/**
 * Obtiene el valir de la variable nombre
 * @return 
 */
    public String obtener_ciudad() {

        return ciudad;
    }
/**
 * Recibe un valor y lo asigna a num_jugadores
 * @param y el parametro
 */
    public void agregar_jugadores(int y) {
        num_jugadores = y;

    }
/**
 * Recibe un valor y lo asigna a nombre
 * @param x el parametro 
 */
    public void agregar_nombre(String x) {
        nombre = x;

    }
/**
 * Recibe un valor y lo asigna a ciudad
 * @param z el parametro
 */
    public void agregar_ciudad(String z) {
        ciudad = z;

    }
/**
 * Constructor vacio por defecto
 */
    public Equipo() {

    }
/**
 * Construccion que recibe un String
 * @param x 
 */
    public Equipo(String x) {
        agregar_nombre(x);

    }
/**
 * Construccion que recibe un String y un int
 * @param x 
 */
    public Equipo(String x, int y) {
        agregar_nombre(x);
        agregar_jugadores(y);
    }
/**
 * Construccion que recibe un String , un int y un String
 * @param x 
 */
    public Equipo(String x, int y, String z) {
        agregar_nombre(x);
        agregar_jugadores(y);
        agregar_ciudad(z);

    }

}
/**
 * Clasa para la creacion de objetos 
 * @author Mario
 */
class Principal {

    public static void main(String[] args) {
        Equipo e = new Equipo();
        System.out.println("Nombre: " + e.obtener_nombre() + "\t" + "Jugadores: " + e.obtener_juadores() + "\t" + "Ciudad: " + e.obtener_ciudad() + "\t");
        Equipo e2 = new Equipo("Liga de Loja");
        e2.agregar_jugadores(20);
        e2.agregar_ciudad("Loja");
        System.out.println("Nombre: " + e.obtener_nombre() + "\t" + "Jugadores: " + e.obtener_juadores() + "\t" + "Ciudad: " + e.obtener_ciudad() + "\t");
        Equipo e3 = new Equipo("Liga de Loja", 20);
        e3.agregar_ciudad("Loja");
        System.out.println("Nombre: " + e.obtener_nombre() + "\t" + "Jugadores: " + e.obtener_juadores() + "\t" + "Ciudad: " + e.obtener_ciudad() + "\t");
        Equipo e4 = new Equipo("Liga de Loja", 20, "Loja");
        System.out.println("Nombre: " + e.obtener_nombre() + "\t" + "Jugadores: " + e.obtener_juadores() + "\t" + "Ciudad: " + e.obtener_ciudad() + "\t");
    }

}
