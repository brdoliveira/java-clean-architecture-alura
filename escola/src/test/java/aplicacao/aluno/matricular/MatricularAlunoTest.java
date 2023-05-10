package aplicacao.aluno.matricular;

import escola.aplicacao.aluno.matricular.MatricularAluno;
import escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import escola.dominio.aluno.Aluno;
import escola.dominio.aluno.CPF;
import escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatricularAlunoTest {

    @Test
    void alunoDeverisaSerPersistido(){
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDTO dados = new MatricularAlunoDTO(
                "Fulano",
                "123.456.789-00",
                "fulano@email.com"
        );
        useCase.executa(dados);

        Aluno alunoEncontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));
        Assertions.assertEquals("Fulano",alunoEncontrado.getNome());
        Assertions.assertEquals("123.456.789-00",alunoEncontrado.getCpf());
        Assertions.assertEquals("fulano@email.com",alunoEncontrado.getEmail());
    }
}
