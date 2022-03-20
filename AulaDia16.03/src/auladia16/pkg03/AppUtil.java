package auladia16.pkg03;

import enums.OpcoesMenu;
import utils.FisicaUtil;
import utils.StringUtil;

public class AppUtil {

    public static void main(String[] args) {
        String teste = "essa eh . . . uma f++rase.de.teste";
        String print = StringUtil.removeCaracteresEspeciais(teste);

        System.out.println(print);
        
        double valor = 10.52;
        
        String valor1 = "R$ 88,88";
        
        System.out.println(StringUtil.converteValorFormatado(valor , "R$"));
        
        System.out.println(StringUtil.converteValor(valor1));
        
        double peso = FisicaUtil.calculaPeso(100, "marte");
        
        System.out.println(peso);
        
        for(OpcoesMenu opMenu : OpcoesMenu.values()) {
            System.out.println(opMenu);
        }
        
        OpcoesMenu op = OpcoesMenu.IMPRIMIR;
        System.out.println(op.getValor());
    }

}
