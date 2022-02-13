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
public class Main {
    public static void main(String[] args) {
        int opc=0;
        Scanner teclado=new Scanner (System.in);
        Fruta manzana=new Fruta("Rojo", 15.2f, "Dulce", 20.0f, "Junio", 22.5f);
        Televisor smartTv3200= new Televisor("Blanco", "LG", 25.2f, 3.5f);
        Alimento pescado=new Alimento("Salado", "Pescado",2.5f, 0.0f, 65.0f);
        TelefonoCelular motoOneFusion=new TelefonoCelular("Motorola", 6500.0f, true, "Grande", "Android");
        Tarjeta miTarjeta=new Tarjeta(2350.50f, "Banco", "Debito", "12/10/2021");
        Agenda agenda1=new Agenda("Cesar", "77148630", "cesar48@hotmail.com", "Adolfo Lopez Mateos No.10");
        
        do{
            System.out.println("Menu Objetos.\nEscoja el tipo de objeto.\n"
                    + "1.Fruta\n2.Televisor\n3.Alimento\n4.Telefono celular\n5.Tarjeta\n6.Agenda\n7.Salir");
            opc=teclado.nextInt();
            switch(opc){
                case 1:
                    System.out.println("*********************************");
                    manzana.elegir();
                    break;
                case 2:
                    System.out.println("*********************************");
                    smartTv3200.elegir();
                    break;
                case 3:
                    System.out.println("*********************************");
                    pescado.elegir();
                    break;
                case 4:
                    System.out.println("*********************************");
                    motoOneFusion.elegir();
                    break;
                case 5:
                    System.out.println("*********************************");
                    miTarjeta.elegir();
                    break;
                case 6:
                    System.out.println("*********************************");
                    agenda1.elegir();
                    break;
                case 7:
                    System.out.println("*********************************");
                    System.out.println("Vuelva pronto UwU");
            }//Fin de switch principal
        }while(opc!=7);
    }
}
