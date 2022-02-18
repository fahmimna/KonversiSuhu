/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.*;
public class konversiSuhu {
    static double SuhuAwal, SuhuEdit;
    static int opsi;
   
    public static void main(String[] args){
        Celcius fromCelcius = new Celcius();
        double Fahrenheit, Kelvin, Reamur;
        Scanner input = new Scanner(System.in);
        
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println(" Input Data\n ----------");
        System.out.print(" Suhu dalam Celcius  : ");
        SuhuAwal=input.nextDouble();
         
        do{
        System.out.println("\n\tOPSI");
        System.out.println(" [1] Lihat Data");
        System.out.println(" [2] Edit Data");
        System.out.println(" [3] Exit");
        System.out.print(" Pilih  : ");
        opsi = input.nextInt();
        
        if(opsi==1){
            Reamur = fromCelcius.toReamur();
            Fahrenheit = fromCelcius.toFahrenheit();
            Kelvin = fromCelcius.toKelvin();
            System.out.println("\n Suhu dalam Celcius = "+SuhuAwal+"°C");
            System.out.println(" Dalam Fahrenheit   = "+Fahrenheit+"°F");
            System.out.println(" Dalam Kelvin       = "+Kelvin+"K");
            System.out.println(" Dalam Reamur       = "+Reamur+"°R");
            if (SuhuAwal <= 0){
              System.out.print(" Kondisi Air Beku\n");  
            }
                else if (SuhuAwal >= 100){
                System.out.print(" Kondisi Air Mendidih\n");  
                }
                    else{
                    System.out.print(" Kondisi Air Normal\n");  
                    }
        }
            else if(opsi==2){
                System.out.println(" Input Data\n ----------");
                System.out.print(" Suhu dalam Celcius  : ");
                SuhuEdit=input.nextDouble();
                SuhuAwal=SuhuEdit;
            }
                else if(opsi==3){
                System.exit(0);
                }
                    else{
                        System.out.println(" Opsi tidak tersedia !");
                    }
        }while(opsi!=3);
    }
}