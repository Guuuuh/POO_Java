/* 1. Implemente uma classe em Java chamada Carro. Nessa classe,
a. implemente atributos relacionados a carros, como ano, modelo e entre
outros.
b. implemente um método para cálculo do IPVA do carro (valor do veículo
* taxa).
c. implemente um método que verifica se o IPVA do carro não precisa ser
mais pago (acima de 20 anos do seu ano de fabricação).

2. Implemente uma classe chamada Moto com os mesmos requisitos apresentados
na questão 1.
3. Na classe principal, instancie pelo menos 3 carros e 2 motos. Após isso, utilize os
métodos criados para verificar o valor do IPVA e se deve ser pago ou não. */

package lista.De.Exercicio;

public class MainListaDeExercicio {

    public static void main(String[] args) {

        Carro fiesta = new Carro(2014, "Ford Fiesta Sedan 1.0", 34.513, "GHJ3241");

        Carro bora = new Carro(2001, "Volkswagen Bora 2.0", 18.442, "ALH2965");

        Carro cruze = new Carro(2016, "Chevrolet Hatch 1.6", 75.930, "ACE4188");

        Moto yes = new Moto(2008, "Suzuki Yes 125", 4.433, "KJU6565");

        Moto cg = new Moto(1988, "Honda CG 125", 2.286, "OPP0812");

        Moto hornet = new Moto(2014, "Honda Cb 600f hornet", 39.532, "UTC9702");

        System.out.println("Fiesta : ");

        System.out.println(fiesta.toCalcularIpva());

        System.out.println(fiesta.toVerificarIpva());

        System.out.println("");

        System.out.println("Bora: ");

        System.out.println(bora.toCalcularIpva());

        System.out.println(bora.toVerificarIpva());

        System.out.println("");

        System.out.println("Cruze: ");

        System.out.println(cruze.toCalcularIpva());

        System.out.println(cruze.toVerificarIpva());

        System.out.println("");

        System.out.println("Suzuki Yes: ");

        System.out.println(yes.toCalcularIpva());

        System.out.println(yes.toVerificarIpva());

        System.out.println("");

        System.out.println("Honda CG: ");

        System.out.println(cg.toCalcularIpva());

        System.out.println(cg.toVerificarIpva());

        System.out.println("");

        System.out.println("CB Hornet: ");

        System.out.println(hornet.toCalcularIpva());

        System.out.println(hornet.toVerificarIpva());

        System.out.println("");
    }

}
