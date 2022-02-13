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
public class Televisor {
    private String color;
    private String marca;
    private float pulgadas;
    private float peso;

    public Televisor(String color, String marca, float pulgadas, float peso) {
        this.color = color;
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Televisor{" + "color=" + color + ", marca=" + marca + ", pulgadas=" + pulgadas + ", peso=" + peso + '}';
    }
    
    public void encender(){
        System.out.println("La televisión se ha encendido. 0w0");
    }
    
    public void apagar(){
        System.out.println("La televisión se ha apagado. -.-");
    }
    
    public void comprar(){
        System.out.println("La compra ha sido exitosa. :D");
    }
    public void elegir(){
        int opcC;
        Scanner entradaC=new Scanner(System.in);
        System.out.println("\t¿Que desea hacer con el objeto?");
        do{
           opcC=0;
           System.out.println("\tMenu televisor\n1.Mostrar atributos.\n2.Modificar valores.\n3.Encender.\n4.Apagar"
                   + "\n5.Compar.\n6.Salir");
           opcC=entradaC.nextInt();
           switch(opcC){
               case 1:
                   System.out.println(toString());
                   break;
               case 2:
                   System.out.println("Ingrese el color de la television");
                   setColor(entradaC.next());
                   System.out.println("Ingrese la marca de la television");
                   setMarca(entradaC.next());
                   System.out.println("Ingrese las pulgadas de la television");
                   setPulgadas(entradaC.nextFloat());
                   System.out.println("Ingrese el peso de la television");
                   setPeso(entradaC.nextFloat());
                   System.out.println(toString());
                   break;
               case 3:
                   encender();
                   break;
               case 4:
                   apagar();
                   break;
               case 5:
                   comprar();
                   break;
               case 6:
                   System.out.println("Regresando al menu de objetos.. :3");
                   break;
               default:
                   System.out.println("Esa opcion no existe. :v");
           }
        }while(opcC!=6);
    }
}
