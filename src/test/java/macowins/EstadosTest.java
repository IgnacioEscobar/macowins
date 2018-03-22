package macowins;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EstadosTest {
	private Prenda prenda;
	
	@Before
    public void setUpClass() {
	    // Creo una prenda arbitraria para realizar las pruebas
	    // Un saco de $5000
	    prenda = new Prenda("Saco", 5000f);
    }

	@Test
	public void prendaNuevaTest() {
	    // Luego de asignar un estado de Nuevo
	    // Se espera que el precio esperado sea de $500 (Igual al precio base)
	    Float precioEsperado = 5000f;
	    assertEquals("ERROR - el precio final de la prenda no es igual a 5000", prenda.precio(), precioEsperado);
	}
	
   @Test
    public void prendaPromocionTest() {
       //Luego de asignar un estado de Promocion con una bonificacion de $400
       Estado estadoPromocion = new Promocion(400f);
       prenda.setEstado(estadoPromocion);
       // Se espera que el precio esperado sea de $4600 ($5000 - $400)
       Float precioEsperado = 4600f;
       assertEquals("ERROR - el precio final de la prenda no es igual a 4600", prenda.precio(), precioEsperado);
    }
   
    @Test
    public void prendaLiquidacionTest() {
        //Luego de asignar un estado de Liquidacion
        Estado estadoLiquidacion = new Liquidacion();
        prenda.setEstado(estadoLiquidacion);
        // Se espera que el precio esperado sea de $2500 ($5000 * 0.5)
        Float precioEsperado = 2500f;
        assertEquals("ERROR - el precio final de la prenda no es igual a 2500", prenda.precio(), precioEsperado);
    }

}
