package lista2segundaparte;

public class Disciplina {

    public String nome;

    public String descricao;

    public Disciplina(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String toStringDisciplina() {
        return "Nome da Disciplina: " + this.nome + "   Descrição da Disciplina: " + this.descricao;
    }

}
