package macowins;

import java.time.LocalDate;
import java.util.List;

public class VentaEnEfectivo extends Venta{
	public VentaEnEfectivo(LocalDate fecha, List<ItemDeVenta> items) {
		super(fecha, items);
	}
	public VentaEnEfectivo( List<ItemDeVenta> items) {
		super(items);
	}
	
	public Float importeTotal() {
		return adicion();
	}

}
