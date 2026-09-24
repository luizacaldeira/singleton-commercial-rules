import org.example.RegrasComerciais;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegrasComerciaisTest {

    @Test
    public void deveRetornarDescontoMaximo() {
        RegrasComerciais.getInstance().setDescontoMaximo(15.0);
        assertEquals(15.0, RegrasComerciais.getInstance().getDescontoMaximo());
    }

    @Test
    public void deveRetornarSegmentoAtivo() {
        RegrasComerciais.getInstance().setSegmentoAtivo("B2B");
        assertEquals("B2B", RegrasComerciais.getInstance().getSegmentoAtivo());
    }

}