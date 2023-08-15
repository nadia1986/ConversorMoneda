/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.g5one.conversormoneda.controller;

import ar.com.g5one.conversormoneda.service.TemperaturaService;

/**
 *
 * @author nadia
 */
public class TemperaturaController {
    private final TemperaturaService service;

    public TemperaturaController() {
        this.service= new TemperaturaService();
    }
    
     public void Convertir(Double valor,int opcion){
        this.service.convertirTemperatura(valor, opcion);
    }
    
    
    
}
