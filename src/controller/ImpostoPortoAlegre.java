package controller;

import javax.swing.*;

public class ImpostoPortoAlegre implements IImpostoStrategy {

    @Override
    public void calcImposto() {
        int decision = JOptionPane.showConfirmDialog(null, "O lote possuí garagem?");
        if (decision == 0) {
            double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Informe a área total do lote: ")) * 7.5;
            double numComodo = Integer.parseInt(JOptionPane.showInputDialog("Informe a área total da garagem: ")) * 2.5;
            double impostoTotal = areaTotal + numComodo;
            System.out.println("Imposto total a pagar: " + String.format("%.2f", impostoTotal) + " R$ de Porto Alegre.");
        } else if (decision == 1){
            double impostoTotal = Double.parseDouble(JOptionPane.showInputDialog("Informe a área total do lote: ")) * 8;
            System.out.println("Imposto total a pagar: " + String.format("%.2f", impostoTotal) + " R$ de Porto Alegre.");
        }else {
            JOptionPane.showMessageDialog(null, "Informe se possuí garagem ou não!");
            calcImposto();
        }
    }
}
