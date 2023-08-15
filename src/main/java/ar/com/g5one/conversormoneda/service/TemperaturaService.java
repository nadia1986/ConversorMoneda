/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.g5one.conversormoneda.service;

import javax.swing.JOptionPane;

/**
 *
 * @author nadia
 */
public class TemperaturaService {
    
    
    
     public void convertirTemperatura(double valor, int opcion) {
        switch (opcion) {
            case 0:
                convertirCelciusAFarenheit(valor);
                break;
            case 1:
                convertirCelciusAKelvin(valor);
                break;
            case 2:
                convertirFarenheitACelcius(valor);
                break;
            case 3:
                convertirKelvinACelcius(valor);
                break;
            case 4:
                convertirKelvinAFarenheit(valor);
                break;
            
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    public double convertirCelciusAFarenheit(double valor) {
        double farenheit = valor * 1.8 + 32;
        farenheit = (double) Math.round(farenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, +valor + " Grados Celcius son " + farenheit + " Grados Farenheit ");
        return farenheit;
    }

    public void convertirCelciusAKelvin(double valor) {
        double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, +valor + " Grados Celcius son " + kelvin + " Kelvin");
    }

    public void convertirFarenheitACelcius(double valor) {
        double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius * 100d) / 100;
        JOptionPane.showMessageDialog(null, +valor + " Grados Farenheit son " + celcius + " Celcius");
    }

    public double convertirKelvinACelcius(double valor) {
        double kelvinCelcius = valor - 273.15;
        kelvinCelcius = (double) Math.round(kelvinCelcius * 100d) / 100;
        JOptionPane.showMessageDialog(null, +valor + " Kelvin son " + kelvinCelcius + " Celcius");
        return kelvinCelcius;
    }

    public void convertirKelvinAFarenheit(double valor) {
        double kelvinFarenheit = convertirKelvinACelcius(valor);
        kelvinFarenheit = convertirCelciusAFarenheit(kelvinFarenheit);
        kelvinFarenheit = (double) Math.round(kelvinFarenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, +valor + " Kelvin son " + kelvinFarenheit + " Celcius");
    }

}
