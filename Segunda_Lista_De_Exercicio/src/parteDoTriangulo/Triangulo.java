package parteDoTriangulo;

public class Triangulo {

    public int lado1;

    public int base;

    public int lado2;

    public int altura;

    public int area;

    public int perimetro;

    public Triangulo(int lado1, int base, int lado2, int altura) {
        this.lado1 = lado1;
        this.base = base;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public int toAreaTriangulo() {
        System.out.println("A Área do triâgunlo inserido é : ");
        area = (base * altura) / 2;
        return area;
    }

    public int toPerimetroTriangulo() {
        System.out.println("O Perímetro do triângulo inserido é: ");
        perimetro = lado1 + base + lado2;
        return perimetro;

    }

}
