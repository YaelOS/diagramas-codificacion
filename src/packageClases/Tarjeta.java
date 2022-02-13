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
public class Tarjeta {
    private float cantidadD;
    private String nombreBanco;
    private String tipoTarjeta;
    private String fechaRetiro;

    public Tarjeta(float cantidadD, String nombreBanco, String tipoTarjeta, String fechaRetiro) {
        this.cantidadD = cantidadD;
        this.nombreBanco = nombreBanco;
        this.tipoTarjeta = tipoTarjeta;
        this.fechaRetiro = fechaRetiro;
    }

    public float getCantidadD() {
        return cantidadD;
    }

    public void setCantidadD(float cantidadD) {
        this.cantidadD = cantidadD;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(String fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }
    
    public float retirar(float retiro){    
        return retiro;
    }
    
    public void depositar(float deposito){
        System.out.println("El deposito de: "+deposito+" se ha realizado con éxito.");
    }
    
    public void cancelarTarjeta(){
        
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "cantidadD=" + cantidadD + ", nombreBanco=" + nombreBanco + ", tipoTarjeta=" + tipoTarjeta + ", fechaRetiro=" + fechaRetiro + '}';
    }
    
    public void elegir(){
        int opcC;
        Scanner entradaC=new Scanner(System.in);
        System.out.println("\t¿Que desea hacer con el objeto?");
        do{
           opcC=0;
           System.out.println("\tMenu tarjeta\n1.Mostrar atributos.\n2.Modificar valores.\n3.Retirar.\n4.Depositar."
                   + "\n5.Cancelar tarjeta.\b6.Salir.");
           opcC=entradaC.nextInt();
           switch(opcC){
               case 1:
                   System.out.println(toString());
                   break;
               case 2:
                   System.out.println("Ingrese la cantidad de dinero de la tarjeta: ");
                   setCantidadD(entradaC.nextFloat());
                   System.out.println("Ingrese a que banco pertenece la tarjeta: ");
                   setNombreBanco(entradaC.next());
                   System.out.println("¿Que tipo de tarjeta es?: ");
                   setTipoTarjeta(entradaC.next());
                   System.out.println("Ingrese la fecha de retiro: ");
                   setFechaRetiro(entradaC.next());
                   System.out.println(toString());
                   break;
               case 3:
                   System.out.println("Ingrese el dinero a retitar: ");entradaC.nextFloat();
                   retirar(entradaC.nextFloat());
                   break;
               case 4:
                   System.out.println("Ingrese el dinero a depositar: ");
                   depositar(entradaC.nextFloat());
                   break;
               case 5:
                   System.out.println("Se ha canelado la tarjeta satisfactoriamente: _w_");
                   break;
               case 6:
                   System.out.println("Regresando al menu de objetos... =3");
                   break;
               default:
                   System.out.println("Esa opcion no existe. :v");
                   break;
           }
        }while(opcC!=6);
    }
}
