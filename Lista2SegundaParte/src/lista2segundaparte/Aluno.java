package lista2segundaparte;

public class Aluno {

    public String nome;

    public String cpf;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String toStringAluno() {
        return "Nome do Aluno: " + this.nome + "   Cpf: " + this.cpf;
    }

}
