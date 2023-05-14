package escola.academico.dominio.aluno;

import escola.shared.dominio.evento.Evento;
import escola.shared.dominio.evento.Ouvinte;
import escola.shared.dominio.evento.TipoDeEvento;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado extends Ouvinte {

    @Override
    public void reageAo(Evento evento){
        String momentoFormatado = evento.momento().format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
        );
        System.out.println(String.format(
                "Aluno com CPF %s matriculado em: %s"
                , ((AlunoMatriculado)evento).getCpfAluno()
                , momentoFormatado
        ));
    }

    @Override
    public void processa(Evento evento) {
        super.processa(evento);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
    }
}
