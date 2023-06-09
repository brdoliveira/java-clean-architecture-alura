package escola.academico.dominio.aluno;

import escola.shared.dominio.CPF;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    // ENTIDADE
    private CPF cpf;
    private String nome;
    private Email email;

    private List<Telefone> telefones = new ArrayList<>();

    private String senha;

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String nome){
        if(telefones.size() == 2){
            throw new IllegalArgumentException(("Numero maximo de telefone atingido!"));
        }
        this.telefones.add(
                new Telefone(ddd,nome)
        );
    }

    public CPF getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
