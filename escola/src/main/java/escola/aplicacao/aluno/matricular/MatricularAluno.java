package escola.aplicacao.aluno.matricular;

import escola.dominio.aluno.Aluno;
import escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio){
        this.repositorio = repositorio;
    }

    public void executa(MatricularAlunoDTO dados){
        Aluno alunoNovo = dados.criarAluno();
        repositorio.matricular(alunoNovo);
    }
}
