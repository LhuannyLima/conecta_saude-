package padroes_de_projeto.app;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import base.Paciente;
import java.time.LocalDate;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Teste so para verificar o build
     */
    @Test
    public void instanciarPaciente() {
        Paciente paciente = new Paciente(
            67,
            "joao",
            "(71) 93944-2983",
            4948098,
            LocalDate.now(),
            7952798,
            false
        );
        assertFalse(paciente.getAcompanhante());
    }
}
