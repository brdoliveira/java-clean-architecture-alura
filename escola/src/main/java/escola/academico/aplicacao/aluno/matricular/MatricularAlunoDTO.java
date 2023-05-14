package escola.academico.aplicacao.aluno.matricular;

import escola.academico.dominio.aluno.CPF;
import escola.academico.dominio.aluno.Email;
import escola.academico.dominio.aluno.Aluno;

public class MatricularAlunoDTO {
    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno() {
        return new Aluno(
                new CPF(this.cpfAluno),
                nomeAluno,
                new Email(this.emailAluno)
        );
    }
}
