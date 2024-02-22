/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poker;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class jugador {
    /*
    se declaran los atributos nombre y mano
    */
    private String nombre;
    private ArrayList<Carta> mano;
    
    /*
    se realiza el constructor de la clase jugador
    */
    public jugador (String nom, ArrayList<Carta> mano){
        this.nombre = nom;
        this.mano = mano;
    }
    
    /*
    se realizan los getter
    */
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }
    
    /*
    se crea el metodo recibir carta en el que se agrega una carta al arraylist
    de la mano del jugador
    */
    void recibirCarta(Carta carta){
        mano.add(carta);
    }
    
    /*
    se utiliza un bucle for each para mostrar la mano del jugador usando el 
    metodo imprimir que fue implementado en la clase Carta
    */
    void mostrarMano(){
        for(Carta carta : mano){
            System.out.println(carta.imprimir());
        }
    }
    
}
