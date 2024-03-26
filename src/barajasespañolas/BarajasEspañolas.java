
package barajasespañolas;

import java.util.Scanner;


public class BarajasEspañolas {


    public static void main(String[] args) {

        Barajas ba=new Barajas();
        ba.cargar();
        ba.mostrar();
        System.out.println("***********");
        System.out.println("-Barajando-");
        System.out.println("***********");
        ba.barajar();
        ba.mostrar();
        
        System.out.println("cuantas cartas quiere:");
        Scanner leer=new Scanner(System.in);
        int cant=leer.nextInt();
        ba.darCartas(cant);
        ba.cartaMonton();
        System.out.println("Cartas disponible en el maso "+ba.cartasDisponibles(cant));
        
        System.out.println("Bajara");
        ba.mostrarBaraja();
        System.out.println("++++++++");
        for(Carta ca:ba.getDesMaso()){
            System.out.println(ca);
        }
    }
    
}
