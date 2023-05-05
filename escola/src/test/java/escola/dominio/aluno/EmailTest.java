package escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));
        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));
        assertThrows(IllegalArgumentException.class,
                () -> new Email("email invalido"));
    }

    @Test
    void deveriaCriarEmailsComEnderecosValido() {
        Email email = new Email("bruno@gmail.com");
        assertEquals(email.getEndereco(),"bruno@gmail.com");
    }

}
