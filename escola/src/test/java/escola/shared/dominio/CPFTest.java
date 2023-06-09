package escola.shared.dominio;

import escola.shared.dominio.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CPFTest {

    @Test
    void naoDeveriaCriarCPFComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("1234567-8900"));
    }

    @Test
    void deveriaPermitirCriarCPFComNumeroValido() {
        String numero = "123.456.789-00";
        CPF cpf = new CPF(numero);
        assertEquals(numero, cpf.getNumero());
    }

}