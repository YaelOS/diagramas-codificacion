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
public class Agenda {
    private String nombreCont;
    private String telefono;
    private String correoE;
    private String direccion;

    public Agenda(String nombreCont, String telefono, String correoE, String direccion) {
        this.nombreCont = nombreCont;
        this.telefono = telefono;
        this.correoE = correoE;
        this.direccion = direccion;
    }

    public String getNombreCont() {
        return nombreCont;
    }

    public void setNombreCont(String nombreCont) {
        this.nombreCont = nombreCont;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void llamar(String telefono){
        System.out.println("Llamando a: "+getNombreCont());
    }
    
    public void mensajeEnviar(String telefono){
        System.out.println("Su mensaje ha sido enviado satisfactoriamente. _U_");
    }
    
    public void borrar(){
        System.out.println("El contacto ha sido removido de la agenda. :,v");
    }
    
    public void guardar(String nombreCont){
        System.out.println("El contacto: "+getNombreCont()+" se ha guardado.:U");
    }

    @Override
    public String toString() {
        return "Agenda{" + "nombreCont=" + nombreCont + ", telefono=" + telefono + ", correoE=" + correoE + ", direccion=" + direccion + '}';
    }
    
    public void elegir(){
        int opcC;
        Scanner entradaC=new Scanner(System.in);
        System.out.println("\t¿Que desea hacer con el objeto?");
        do{
           opcC=0;
           System.out.println("\tMenu Agenda\n1.Mostrar atributos.\n2.Modificar valores.\n3.Llamar.\n4.Enviar mensaje."
                   + "5.Borrar.\n6.Guardar.\n7.Salir.");
           opcC=entradaC.nextInt();
           switch(opcC){
               case 1:
                   System.out.println(toString());
                   break;
               case 2:
                   System.out.println("Ingrese el nombre del contacto: ");
                   setNombreCont(entradaC.next());
                   System.out.println("Ingrese el número de telefono: ");
                   setTelefono(entradaC.next());
                   System.out.println("Ingrese el correo electronico: ");
                   setCorreoE(entradaC.next());
                   System.out.println("Ingrese la direccion del contacto: ");
                   setDireccion(entradaC.next());
                   System.out.println(toString());
                   break;
               case 3:
                   llamar(getTelefono());
                   break;
               case 4:
                   mensajeEnviar(getTelefono());
                   break;
                case 5:
                   borrar();
                   break;
                case 6:
                   guardar(getNombreCont());
                   break;
                case 7:
                   System.out.println("Regresando al menu de objetos... =3");
                   break;     
               default:
                   System.out.println("Esa opcion no existe. :v");
           }
        }while(opcC!=7);
    }
}
