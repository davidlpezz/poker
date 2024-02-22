/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poker;

/**
 *
 * @author AlumnoT
 */
public class Carta {

    private String palo;
    private String valor;
    
    public Carta(String palo, String valor){
        this.palo = palo;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    String imprimir(){
        return valor + palo;
    }
    
    int getValorNumerico(){
        switch(valor){
            case "A":
                return 14;
            case "K":
                return 13;
            case "Q":
                return 12;
            case "J":
                return 11;
            default:
                return Integer.parseInt(valor);
                
        }
    }
    
    
}
