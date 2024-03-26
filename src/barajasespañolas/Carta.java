/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barajasespañolas;

/**
 *
 * @author Usuario
 */
public class Carta {
    private int numCart;
    private String palo;

    public Carta(int numCart, String palo) {
        this.numCart = numCart;
        this.palo = palo;
    }

    public int getNumCart() {
        return numCart;
    }

    public void setNumCart(int numCart) {
        this.numCart = numCart;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numCart=" + numCart + ", palo=" + palo + '}';
    }
    
    
    
}
