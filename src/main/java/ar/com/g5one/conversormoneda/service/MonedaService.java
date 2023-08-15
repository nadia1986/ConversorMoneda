
package ar.com.g5one.conversormoneda.service;

import javax.swing.JOptionPane;

/**
 *
 * @author nadia
 */
public class MonedaService {
    
    
    
       public void convertirMoneda(double monto, int opcion) {
        switch (opcion) {
            case 0:
                pesosADolar(monto);
                break;
            case 1:
                pesosEuros(monto);
                break;
            case 2:
                pesosLibras(monto);
            case 3:
                pesosYenJapones(monto);
            case 4:
                pesosWonSulCoreano(monto);
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
    
    public void pesosADolar(Double monto){
        Double monedaDolar= monto/349.79;
        monedaDolar = (double) Math.round(monedaDolar *100d)/100;
         JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dólares");
    }
    
    public void pesosEuros(Double monto){
        Double moneda= monto/388.22;
         moneda = (double) Math.round(moneda *100d)/100;
         JOptionPane.showMessageDialog(null, "Tienes $ " +moneda+ " Euros");
    }
    
     public void pesosLibras(Double monto){
        Double moneda= monto/445.43;
         moneda = (double) Math.round(moneda *100d)/100;
         JOptionPane.showMessageDialog(null, "Tienes $ " +moneda+ " Libras Esterlinas");
    }
      public void pesosYenJapones(Double monto){
        Double moneda= monto/2.41;
         moneda = (double) Math.round(moneda *100d)/100;
         JOptionPane.showMessageDialog(null, "Tienes $ " +moneda+ " Yenes");
    }
       public void pesosWonSulCoreano(Double monto){
        Double moneda= monto/0.26;
         moneda = (double) Math.round(moneda *100d)/100;
         JOptionPane.showMessageDialog(null, "Tienes $ " +moneda+ " Won Sul Coreano");
    }
}
