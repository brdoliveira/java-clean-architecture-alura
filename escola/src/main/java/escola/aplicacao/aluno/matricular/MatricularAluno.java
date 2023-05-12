package escola.aplicacao.aluno.matricular;

import escola.dominio.PublicadorDeEventos;
import escola.dominio.aluno.Aluno;
import escola.dominio.aluno.AlunoMatriculado;
import escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorio;
    private final PublicadorDeEventos publicador;


    public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador){
        this.repositorio = repositorio;
        this.publicador = publicador;
    }

    public void executa(MatricularAlunoDTO dados){
        Aluno alunoNovo = dados.criarAluno();
        repositorio.matricular(alunoNovo);

        AlunoMatriculado evento = new AlunoMatriculado(alunoNovo.getCpf());
        publicador.publicar(evento);
    }
}
