package Segunda_aula;

public class Pessoa {
    
    /* Atributos */
    
    public int codigo;
    public String nome;
    public String cpf;
    public int idade;
    
    public Pessoa () {}
    
    /* Alt + Shift + F -- Identa Auto */
    public Pessoa (int codigo, String nome, String cpf, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    public String verficiaMaiorDeIdade () {
        if(this.idade >= 18) {
            return /*true "boolean"*/ "Verdadeiro" ;
        } 
        
        return /*false "boolean"*/ "Falso";
        
    }
}
