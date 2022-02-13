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
public class TelefonoCelular {
    private String marca;
    private float costo;
    private boolean giroscopio;
    private String tamanio;
    private String sistemaOperativo;

    public TelefonoCelular(String marca, float costo, boolean giroscopio, String tamanio, String sistemaOperativo) {
        this.marca = marca;
        this.costo = costo;
        this.giroscopio = giroscopio;
        this.tamanio = tamanio;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public boolean isGiroscopio() {
        return giroscopio;
    }

    public void setGiroscopio(boolean giroscopio) {
        this.giroscopio = giroscopio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    public void comprar(float costo){
        System.out.println("Se ha pagado el total de: "+getCosto()+". :D");
    }
    public void reproducirMusica(){
        System.out.println("Esta reproduciendo musica,  relajese. U.U");
    }

    @Override
    public String toString() {
        return "TelefonoCelular{" + "marca=" + marca + ", costo=" + costo + ", giroscopio=" + giroscopio + ", tamanio=" + tamanio + ", sistemaOperativo=" + sistemaOperativo + '}';
    }
    
     public void elegir(){
        int opcC;
        Scanner entradaC=new Scanner(System.in);
        System.out.println("\t¿Que desea hacer con el objeto?");
        do{
           opcC=0;
           System.out.println("\tMenu telefono celular\n1.Mostrar atributos.\n2.Modificar valores.\n3.Comprar.\n"
                   + "4.Reproducir música.\n5.Salir.");
           opcC=entradaC.nextInt();
           switch(opcC){
               case 1:
                   System.out.println(toString());
                   break;
               case 2:
                   System.out.println("Ingrese la marca del telefono: ");
                   setMarca(entradaC.next());
                   System.out.println("Ingrese el precio del telefono: ");
                   setCosto(entradaC.nextFloat());
                   System.out.println("¿Tiene giroscopio el telefono? true/false");
                   setGiroscopio(entradaC.nextBoolean());
                   System.out.println("Ingrese el tamaño del telefono: ");
                   setTamanio(entradaC.next());
                   System.out.println("Ingrese el sistema operativo del celular: ");
                   setSistemaOperativo(entradaC.next());
                   System.out.println(toString());
                   break;
               case 3:
                   comprar(getCosto());
                   break;
               case 4:
                   reproducirMusica();
                   break;
               case 5:
                   System.out.println("Regresando al menu de objetos... =3");
                   break;
               default:
                   System.out.println("Esa opcion no existe. :v");
                   break;
           }
        }while(opcC!=5);
    }
}
