package escola.academico.matricular;

import escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import escola.academico.aplicacao.aluno.matricular.MatricularAlunoDTO;
import escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import escola.shared.dominio.evento.PublicadorDeEventos;
import escola.academico.dominio.aluno.Aluno;
import escola.shared.dominio.CPF;
import escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		// MOCK -> Mockito
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());

		MatricularAluno useCase = new MatricularAluno(repositorio,publicador);
		
		MatricularAlunoDTO dados = new MatricularAlunoDTO(
				"Fulano", 
				"123.456.789-00", 
				"fulano@email.com");
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(
				new CPF("123.456.789-00"));
		
		assertEquals("Fulano", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf().getNumero());
		assertEquals("fulano@email.com", encontrado.getEmail());
	}

}
