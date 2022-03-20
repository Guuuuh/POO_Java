package utils;

public class StringUtil {

    public static String removeCaracteresEspeciais(String string) {
        return string.replaceAll("[.\\+\\-´,*^@]", "");
    }

    public static String converteValorFormatado(double valor, String moeda) {
        String valorFormatado = String.valueOf(valor);
        return moeda + valorFormatado.replace(".", ",");
    }

    public static double converteValor(String valorFormatado) {
        return Double.parseDouble(valorFormatado.replace("R$", "")
                                                .replace(",", "."));
    }
}