package lista2segundaparte;

public class Matricula {

    public Aluno aluno;

    public Disciplina disciplina;

    public String status;

    public boolean alteraAluno(Aluno aluno) {
        if (status != "finalizada") {
            System.out.println("Alteração de aluno realizada com sucesso");
            this.aluno = aluno;
            return true;
        }
        System.out.println("Não é possivel alterar as informações desse aluno, matrícula consta como finalizada");
        return false;

    }

    public boolean alteraDisciplina(Disciplina disciplina) {
        if (status != "finalizada") {
            System.out.println("Alteração de disciplina realizada com sucesso");
            this.disciplina = disciplina;
            return true;
        }
        System.out.println("Não é possivel alterar a disciplina, matrícula consta como finalizada");
        return false;

    }
    
    public String toStringMatricula() {
        return this.aluno.toStringAluno() + this.disciplina.toStringDisciplina();
    }
}
