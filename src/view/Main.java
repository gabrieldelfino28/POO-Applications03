package view;

import controller.*;

public class Main {

    public static void main(String[] args) {
        IImpostoStrategy iSP = new ImpostoSaoPaulo();
        IImpostoStrategy iBH = new ImpostoBeloHorizonte();
        IImpostoStrategy iPA = new ImpostoPortoAlegre();
        IImpostoStrategy iCA = new ImpostoCuritiba();
        try {
            iSP.calcImposto();
            iBH.calcImposto();
            iPA.calcImposto();
            iCA.calcImposto();
        }catch (NumberFormatException e) {
            System.err.println("Valor inválido tente novamente");
            main(args); // ;)
        }catch (NullPointerException e) {
            System.exit(0);
        }
    }
}
