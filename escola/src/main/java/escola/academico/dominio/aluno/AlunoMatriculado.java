package escola.academico.dominio.aluno;

import escola.academico.dominio.Evento;

import java.time.LocalDateTime;

public class AlunoMatriculado implements Evento {

    private final CPF cpfAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpfAluno) {
        this.cpfAluno = cpfAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return null;
    }

    public CPF getCpfAluno() {
        return cpfAluno;
    }

    public LocalDateTime getMomento() {
        return momento;
    }
}
