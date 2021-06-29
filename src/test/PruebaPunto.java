
package test;

import dominio.Punto;
import java.util.Random;
import java.util.Scanner;

public class PruebaPunto {
   static Scanner datos=new Scanner(System.in);
    public static void main(String[] args){
      System.out.println("Cuantas coordenadas desea saber: ");
        int mov = datos.nextInt();
        Punto [] pto  = new Punto [mov];
        System.out.println("Los movimientos son: ");
        coordenadaSalida(pto);
    }
    public static void coordenadaSalida(Punto pto[]){
        Random random=new Random();
        int x=0;
        int y=0;
        int punto=0;
        double distotal=0;
        System.out.println("Las coordenadas en el punto inicial es: "+punto+","+punto);
        for(int i=0; i<pto.length;i++){
        x=(random.nextInt(20)-10);
        y=(random.nextInt(20)-10);
        pto[i]= new Punto(x,y);
        System.out.println("La coordenada N°"+(i+1)+" : "+x+ ","+y);
           double distancia=0;
           distancia=Math.sqrt(x*x+y*y);
           distotal+=distancia;
        System.out.println("La distancia del punto N°"+i+" Al punto N°"+(i+1)+" Es: "+distancia);
        }
        System.out.println("La Distancia total recorrida es: "+distotal);
      }
    }
