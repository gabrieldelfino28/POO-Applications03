package controller;

import javax.swing.*;

public class ImpostoSaoPaulo implements IImpostoStrategy{

    @Override
    public void calcImposto() {
        double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Informe a área total do lote: ")) * 10;
        int numQuartos = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de quartos: ")) * 2;
        double impostoTotal = areaTotal + numQuartos;
        System.out.println("Imposto total a pagar: " + String.format("%.2f", impostoTotal) + " R$ de São Paulo.");
    }
}
