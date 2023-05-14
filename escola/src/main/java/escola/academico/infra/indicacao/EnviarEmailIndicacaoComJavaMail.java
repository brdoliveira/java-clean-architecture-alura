package escola.academico.infra.indicacao;


import escola.academico.aplicacao.indicacao.EnviarEmailIndicacao;
import escola.academico.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
