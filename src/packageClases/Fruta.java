/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageClases;

import java.util.Scanner;

/**
 *
 * @author Yael OS
 */
public class Fruta {
    private String color;
    private float peso;
    private String sabor;
    private float precioKilo;
    private String mesTemporada;
    private float azucares;

    public Fruta(String color, float peso, String sabor, float precioKilo, String mesTemporada, float azucares) {
        this.color = color;
        this.peso = peso;
        this.sabor = sabor;
        this.precioKilo = precioKilo;
        this.mesTemporada = mesTemporada;
        this.azucares = azucares;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public float getPrecioKilo() {
        return precioKilo;
    }

    public void setPrecioKilo(float precioKilo) {
        this.precioKilo = precioKilo;
    }

    public String getMesTemporada() {
        return mesTemporada;
    }

    public void setMesTemporada(String mesTemporada) {
        this.mesTemporada = mesTemporada;
    }

    public float getAzucares() {
        return azucares;
    }

    public void setAzucares(float azucares) {
        this.azucares = azucares;
    }
    
    public void comprar(float kilos){
        System.out.println("El precio es: "+(getPrecioKilo()*kilos));
    }

    @Override
    public String toString() {
        return "Fruta{" + "color=" + color + ", peso=" + peso + ", sabor=" + sabor + ", precioKilo=" + precioKilo + ", mesTemporada=" + mesTemporada + ", azucares=" + azucares + '}';
    }
    public void elegir(){
        int opcC;
        Scanner entradaC=new Scanner(System.in);
        System.out.println("\t¿Que desea hacer con el objeto?");
        //do{
           opcC=0;
           System.out.println("\tMenu fruta\n1.Mostrar atributos.\n2.Modificar valores.\n3.Comprar.\n4.Salir");
           opcC=entradaC.nextInt();
           switch(opcC){
               case 1:
                   System.out.println(toString());
                   break;
               case 2:
                   System.out.println("Ingrese el color de la manzana");
                   setColor(entradaC.next());
                   System.out.println("Ingrese el peso de la manzanas");
                   setPeso(entradaC.nextFloat());
                   System.out.println("Ingrese el sabor de la manzana");
                   setSabor(entradaC.next());
                   System.out.println("Ingrese el precio del kilo de la manzana");
                   setPrecioKilo(entradaC.nextFloat());
                   System.out.println("Ingrese el mes de temporada de la manzana");
                   setMesTemporada(entradaC.next());
                   System.out.println("Ingrese el contenido de azucares de la manzana");
                   setAzucares(entradaC.nextFloat());
                   System.out.println(toString());
                   break;
               case 3:
                   comprar(getPeso());
                   break;
               case 4:
                   System.out.println("Regresando al menu de objetos.. =3");
                   break;
               default:
                   System.out.println("Esa opcion no existe. :v");
           }
       // }while(opcC!=4);
    }
}
