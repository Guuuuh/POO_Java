package Segunda_aula;

public class Segunda_aula {
    
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.codigo = 813;
        p1.nome = "Marilene";
        p1.cpf = "12345678911";
        p1.idade = 126;
        
        System.out.println("Marilene é maior de idade ? " + p1.verficiaMaiorDeIdade());
        
        Pessoa p2 = new Pessoa(51, "Paulo", "12345678911", 17);
        
        System.out.println("Soma das idades: " + (p1.idade + p2.idade));
        
        System.out.println("Paulo é maior de idade ? " + p2.verficiaMaiorDeIdade());
    }
}
