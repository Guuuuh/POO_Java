/* 4. Implemente uma classe chamada Triangulo que tenha 4 atributos: três lados e uma
altura. Após isso, implemente
a. um método que retorne a área do triângulo e
b. um método que retorne o perímetro do triângulo.
5. Na classe principal, instancie um triângulo e teste os métodos criados. */
package parteDoTriangulo;

public class MainTriangulo {

    public static void main(String[] args) {

        Triangulo triangulo1 = new Triangulo(5, 5, 5, 8);

        Triangulo triangulo2 = new Triangulo(80, 92, 80, 120);

        System.out.println(triangulo1.toPerimetroTriangulo());

        System.out.println(triangulo1.toAreaTriangulo());

        System.out.println(triangulo2.toPerimetroTriangulo());

        System.out.println(triangulo2.toAreaTriangulo());

    }

}
