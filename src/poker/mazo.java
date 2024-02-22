/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package poker;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author AlumnoT
 */
public class mazo {
    
    /*
    se declara el atributo cartas como arraylist
    */
    private ArrayList<Carta> cartas = new ArrayList();
    
    /*
    se crea el constructor para la clase mazo y se inicializa el propio mazo
    */
    public mazo(ArrayList cartas){
        this.cartas = cartas;
        inicializarMazo();
    }
    
    /*
    se crean los getter y setter de la clase para el atributo cartas
    */
    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    
    /*
    metodo inicializar mazo:
    en este metodo estamos creando las arrays palos y valores como String 
    e incluyendole en el caso de los palos el unicode de los simbolos de la
    baraja inglesa y en el caso de los valores todos los valores desde el 2
    hasta el 10 y luego las letras corresponientes (J, Q, K, A)
    
    luego se usa un bucle for each para asignar al arraylist carta todos los
    valores de la baraja
    */
    public void inicializarMazo(){
        String[] palos = {"\u2665", "\u2666", "\u2660", "\u2663"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        
        for (String palo : palos) {
            for (String valor : valores) {
                cartas.add(new Carta(palo, valor));
            }
        }
    }
    
    /*
    se usa el collections.shuffle para barajar las cartas
    */
    public void barajar() {
        Collections.shuffle(cartas);
    }
    
    /*
    mediante un bucle for each se crea el metodo mostrarBaraja para poder 
    imprimir por pantalla la baraja de cartas
    */
    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta.imprimir());
        }
    }
    
    
}
