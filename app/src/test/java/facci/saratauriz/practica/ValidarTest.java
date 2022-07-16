package facci.saratauriz.practica;


import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class ValidarTest {

    @Test
    public void validarCampo_True() {
        Validar validar = new Validar();
        assertTrue(validar.validarCampo("Nombre"));
    }
    @Test
    public void validarLargo_True() {
        Validar validar = new Validar();
        assertTrue(validar.validarLargo("Nomb"));
    }
    @Test
    public void validarlargo_True() {
        Validar validar = new Validar();
        assertTrue(validar.validarlargo("Nombre3rferf"));
    }

}
