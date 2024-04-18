package controller;

import javax.swing.*;

public class ImpostoBeloHorizonte implements IImpostoStrategy{
    @Override
    public void calcImposto() {
        double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Informe a área total do lote: ")) * 7;
        int numComodo = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de cômodos: ")) * 4;
        double impostoTotal = areaTotal + numComodo;
        System.out.println("Imposto total a pagar: " + String.format("%.2f", impostoTotal) + " R$ de Belo Horizonte.");
    }
}
