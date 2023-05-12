package escola.dominio;

import escola.dominio.aluno.AlunoMatriculado;

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
    protected boolean deveProcessaar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
