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
public class jugadaPoker {
    private mazo mazo;
    private ArrayList<jugador> jugadores;
    private ArrayList<Carta> cartasComunes;
    
    public jugadaPoker (mazo mazo, ArrayList<jugador> jugadores, ArrayList<Carta> cartasComunes){
        this.mazo = mazo;
        this.jugadores = jugadores;
        this.cartasComunes = cartasComunes;
    }

    public mazo getMazo() {
        return mazo;
    }

    public void setMazo(mazo mazo) {
        this.mazo = mazo;
    }

    public ArrayList<jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Carta> getCartasComunes() {
        return cartasComunes;
    }

    public void setCartasComunes(ArrayList<Carta> cartasComunes) {
        this.cartasComunes = cartasComunes;
    }

    
    /*void repartirCartas(){
        for(int i=0;i<=2;i++){
            Carta carta = mazo.getCartas();
            jugadores.recibirCarta();
        }
    }*/
    
}
