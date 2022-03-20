package utils;

public class FisicaUtil {

    private static final double GRAVIDADE_TERRA = 9.8;
    private static final double GRAVIDADE_MARTE = 3.7;
    private static final double GRAVIDADE_VENUS = 8.8;

    public static double calculaPeso(double massa, String local) {
        if (local.equals("terra")) {
            return massa * GRAVIDADE_TERRA;
        } else if (local.equals("marte")) {
            return massa * GRAVIDADE_MARTE;
        } else if (local.equals("venus")) {
            return massa * GRAVIDADE_VENUS;
        } else {
            System.out.println("Planeta não Identificado");
            return 0.0;
        }
    }
    
    public static double calculaVelocidadeMedia(double deslocamento, double tempo) {
        return deslocamento / tempo;
    }

}