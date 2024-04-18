package controller;

import javax.swing.*;

public class ImpostoCuritiba implements IImpostoStrategy {
    @Override
    public void calcImposto() {
        double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Informe a área total do lote: ")) * 5;
        int idadeMovel = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do movel: "));
        double impostoTotal = 0;
        if (idadeMovel > 50) {
            impostoTotal = areaTotal + (idadeMovel * 3);
        }else if (idadeMovel < 20) {
            impostoTotal = areaTotal + (idadeMovel * 5);
        }else if (idadeMovel > 20 && idadeMovel < 50) {
            impostoTotal = areaTotal + (idadeMovel * 2.5);
        }
        System.out.println("Imposto total a pagar: " + String.format("%.2f", impostoTotal) + " R$ de Curitiba.");
    }
}
