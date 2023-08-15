package ar.com.g5one.conversormoneda.service;

import javax.swing.JOptionPane;

/**
 *
 * @author nadia
 */
public class MonedaService {

    public void convertirMoneda(double monto, int opcion) {
        if (monto > 0) {
            switch (opcion) {
                case 0:
                    pesosADolar(monto);
                    break;
                case 1:
                    pesosEuros(monto);
                    break;
                case 2:
                    pesosLibras(monto);
                    break;
                case 3:
                    pesosYenJapones(monto);
                    break;
                case 4:
                    pesosWonSulCoreano(monto);
                    break;
                case 5:
                    dolarPesos(monto);
                    break;
                case 6:
                    eurosPesos(monto);
                    break;
                case 7:
                    librasPesos(monto);
                    break;
                case 8:
                    jenJaponesPesos(monto);
                    break;
                case 9:
                    wonSulCoreanoPesos(monto);
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(null, "EL MONTO A CONVERTIR TIENE QUE SER MAYOR A 0");
        }
    }

    public void pesosADolar(Double monto) {
        Double monedaDolar = monto / 349.79;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dólares");
    }

    public void pesosEuros(Double monto) {
        Double moneda = monto / 388.22;
        moneda = (double) Math.round(moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Euros");
    }

    public void pesosLibras(Double monto) {
        Double moneda = monto / 445.43;
        moneda = (double) Math.round(moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Libras Esterlinas");
    }

    public void pesosYenJapones(Double monto) {
        Double moneda = monto / 2.40;
        moneda = (double) Math.round(moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Yenes");
    }

    public void pesosWonSulCoreano(Double monto) {
        Double moneda = monto / 0.26;
        moneda = (double) Math.round(moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Won Sul Coreano");
    }

    public void dolarPesos(Double monto) {
        Double moneda = monto * 349.79;
        moneda = (double) Math.round(moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " pesos");
    }

    public void eurosPesos(Double monto) {
        Double moneda = monto * 388.22;
        moneda = (double) Math.round(moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " pesos");
    }

    public void librasPesos(Double monto) {
        Double moneda = monto * 445.43;
        moneda = (double) Math.round(moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " pesos");
    }

    public void jenJaponesPesos(Double monto) {
        Double moneda = monto * 2.40;
        moneda = (double) Math.round(moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + "pesos");
    }

    public void wonSulCoreanoPesos(Double monto) {
        Double moneda = monto * 0.26;
        moneda = (double) Math.round(moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " pesos");
    }

}
