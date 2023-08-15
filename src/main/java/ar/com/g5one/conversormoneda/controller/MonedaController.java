package ar.com.g5one.conversormoneda.controller;

import ar.com.g5one.conversormoneda.service.MonedaService;

/**
 *
 * @author nadia
 */
public class MonedaController {

    private final MonedaService monedaService;

    public MonedaController() {

        this.monedaService = new MonedaService();
    }

    
    public void Convertir(Double monto,int opcion){
        this.monedaService.convertirMoneda(monto, opcion);
    }
    
   
}
