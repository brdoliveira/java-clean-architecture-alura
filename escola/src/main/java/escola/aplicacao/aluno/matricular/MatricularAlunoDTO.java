package escola.aplicacao.aluno.matricular;

import escola.dominio.aluno.Aluno;
import escola.dominio.aluno.CPF;
import escola.dominio.aluno.Email;

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
