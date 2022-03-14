package lista2segundaparte;

public class Instituição {

    public static void main(String[] args) {
        
        Aluno alunox = new Aluno ("Everton", "12345678900");
        
        Aluno alunoz = new Aluno ("Nianderson", "98765432100");
        
        Disciplina geografia = new Disciplina ("Geografia", "Aulas Sobre Globalização");
        
        Disciplina biologia = new Disciplina ("Biologia", "Aulas Sobre o Reino Animal");
        
        System.out.println(alunox.toStringAluno());
        System.out.println(alunoz.toStringAluno());
        
        System.out.println(geografia.toStringDisciplina());
        System.out.println(biologia.toStringDisciplina());

    }

}
