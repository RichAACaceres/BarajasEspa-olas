/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barajasespañolas;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Usuario
 */
public class Barajas {
    private ArrayList<Carta> maso= new ArrayList ();
    private ArrayList<Carta> desMaso= new ArrayList();
    private int sigCartIndex=0;

    public Barajas() {
    }

    public ArrayList<Carta> getMaso() {
        return maso;
    }

    public void setMaso(ArrayList<Carta> maso) {
        this.maso = maso;
    }

    public ArrayList<Carta> getDesMaso() {
        return desMaso;
    }

    public void setDesMaso(ArrayList<Carta> desMaso) {
        this.desMaso = desMaso;
    }

    public int getSigCartIndex() {
        return sigCartIndex;
    }

    public void setSigCartIndex(int sigCartIndex) {
        this.sigCartIndex = sigCartIndex;
    }
    
    
    
    
    public void cargar(){
        String p;
        int n=0;
        int nCar;
        while (n<=40) {
            for (int i = 1; i <= 10; i++) {
                if (i==8 || i==9){
                    nCar=i+3;
                }else nCar=i;
                if(n<=10){
                    p="Oro";
                }else if(n>10 && n<=20){
                    p="Basto";
                }else if(n>20 && n<=30){
                    p="Espada";
                }else p="Copa";
                
                Carta carta=new Carta(nCar,p);
                maso.add(carta);
            }
            n=n+11;
        }
    }
    public void mostrar(){
        for(Carta ca: maso){
            System.out.println(ca);
        }//System.out.println(" ");
    }
    
    public void barajar(){
        Collections.shuffle(maso);
    }
    //• siguienteCarta(): devuelve la siguiente carta que está en la 
    //baraja, cuando no haya más o se haya llegado al final, se indica
    //al usuario que no hay más cartas.
    public Carta siguienteCarta(){
        if(this.sigCartIndex<maso.size()){
            return maso.remove(this.sigCartIndex);
            
        }else{
            System.out.println("No hay mas cartas en el maso");
            return null;
        }
        
    }
    
    public int cartasDisponibles(int n){
        
        return  (40-n);
        
        //System.out.println("Cartas disponibles= "+dispo+" cartas");
    }
    
    //• darCartas(): dado un número de cartas que nos pidan, le 
    //devolveremos ese número de cartas. En caso de que haya menos 
    //cartas que las pedidas, no devolveremos nada, pero debemos 
    //indicárselo al usuario.
    public void darCartas(int n){
        for (int i = 1; i <= n; i++) {
            Carta siguiente=siguienteCarta();
            //System.out.println(" "+this.sigCartIndex);
            if(siguiente!=null){
                desMaso.add(siguiente);
                //System.out.println(siguiente);
            }else{
                System.out.println("No hay cartas en el Maso");
                break;
            }
        }
    }
    
    public void cartaMonton(){
        if(desMaso.get(0)==null){
            System.out.println("No salio nimguna carta");
            
        }else{
            int c=0;
            for(Carta ca: desMaso){
            System.out.println(ca);
                //System.out.println(c++);
        }
        
        }
    }
    
    public void mostrarBaraja(){
        int cont=1;
        for(Carta ca: maso){
            if(ca!=null){
            System.out.println(cont+" "+ca);
            cont++;
            }
        }
    }
    
}
