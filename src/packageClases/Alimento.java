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
public class Alimento {
    private String sabor;
    private String nombre;
    private float grasas;
    private float azucares;
    private float precioKilo;

    public Alimento(String sabor, String nombre, float grasas, float azucares, float precioKilo) {
        this.sabor = sabor;
        this.nombre = nombre;
        this.grasas = grasas;
        this.azucares = azucares;
        this.precioKilo = precioKilo;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getGrasas() {
        return grasas;
    }

    public void setGrasas(float grasas) {
        this.grasas = grasas;
    }

    public float getAzucares() {
        return azucares;
    }

    public void setAzucares(float azucares) {
        this.azucares = azucares;
    }

    public float getPrecioKilo() {
        return precioKilo;
    }

    public void setPrecioKilo(float precioKilo) {
        this.precioKilo = precioKilo;
    }
    
    public void comprar(float kilos){
        System.out.println("El total es: "+(getPrecioKilo()*kilos));
    }
    
    public void nombreReceta(){
        if(getNombre()=="manzana" || getNombre()=="Manzana")
            System.out.println("Manzanas con crema. UwU");
        else if(getNombre()=="pescado" || getNombre()=="Pescado")
            System.out.println("Caldo de pescado. :3");
        else
            System.out.println("No hay receta para ese alimento. UnU");
    }

    @Override
    public String toString() {
        return "Alimento{" + "sabor=" + sabor + ", nombre=" + nombre + ", grasas=" + grasas + ", azucares=" + azucares + ", precioKilo=" + precioKilo + '}';
    }
    
    public void elegir(){
        int opcC;
        Scanner entradaC=new Scanner(System.in);
        System.out.println("\t¿Que desea hacer con el objeto?");
        do{
           opcC=0;
           System.out.println("\tMenu alimento\n1.Mostrar atributos.\n2.Modificar valores.\n3.Comprar.\n4.Receta.\n"
                   + "5.Salr.");
           opcC=entradaC.nextInt();
           switch(opcC){
               case 1:
                   System.out.println(toString());
                   break;
               case 2:
                   System.out.println("Ingrese el sabor del alimento: ");
                   setSabor(entradaC.next());
                   System.out.println("Ingrese el nombre del alimento: ");
                   setNombre(entradaC.next());
                   System.out.println("Ingrese las grasas del alimento: ");
                   setGrasas(entradaC.nextFloat());
                   System.out.println("Ingrese las azucares del alimento: ");
                   setAzucares(entradaC.nextFloat());
                   System.out.println("Ingrese del precio por  kilo del: "+getNombre());
                   setPrecioKilo(entradaC.nextFloat());
                   System.out.println(toString());
                   break;
               case 3:
                   System.out.println("Ingrese los kilos que lleva de: "+getNombre());
                   comprar(entradaC.nextFloat());
                   break;
               case 4:
                   nombreReceta();
                   break;
               case 5:
                   System.out.println("Regresando al menu de objetos.. =3");
                   break;
               default:
                   System.out.println("Esa opcion no existe. :v");
           }
        }while(opcC!=5);
    }
}
