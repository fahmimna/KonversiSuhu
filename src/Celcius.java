/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Celcius {
    double toFahrenheit(){
        //°F = °C × 1,8 + 32
        return (konversiSuhu.SuhuAwal*1.8+32);
    }
    double toReamur(){
        //°Ré = °C × 0,8
        return (konversiSuhu.SuhuAwal*0.8);
    }
    double toKelvin(){
        //K = °C + 273,15
        return (konversiSuhu.SuhuAwal+273.15);
    }
}
