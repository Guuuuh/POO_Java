package parteDoTriangulo;

public class Triangulo {

    public int lado1;

    public int base;

    public int lado2;

    public int altura;

    public double area;

    public int perimetro;

    public Triangulo(int lado1, int base, int lado2, int altura) {
        this.lado1 = lado1;
        this.base = base;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public double toAreaTriangulo() {
        System.out.println("A Área do triâgunlo inserido é : ");
        area = (this.base * this.altura) / 2;
        return area;
    }

    public int toPerimetroTriangulo(/* Usar o parametro quando algum valor for vir de fora da classe, como por exemplo o usuário inserir um valor */) {
        System.out.println("O Perímetro do triângulo inserido é: ");
        perimetro = this.lado1 + this.base + this.lado2;
        return perimetro;

    }
}
