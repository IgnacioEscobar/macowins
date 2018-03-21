package macowins;

import java.time.LocalDate;
import java.util.List;

public class VentaConTarjeta extends Venta{
	private Float coeficiente = 0.2f;
	private Integer cantidadCuotas;
	
	public VentaConTarjeta(LocalDate fecha, Integer cantidadCuotas, List<ItemDeVenta> items) {
		super(fecha, items);
		this.cantidadCuotas = cantidadCuotas;
	}
	public VentaConTarjeta(Integer cantidadCuotas, List<ItemDeVenta> items) {
		super(items);
		this.cantidadCuotas = cantidadCuotas;
	}
	
	public Float importeTotal() {
		return adicion() + recargo();
	}
	private Float recargo() {
		Float recargoDePrendas = getItems().stream()
										   .map(item -> item.importe() * 0.1f)
										   .reduce(0f, Float::sum);
		return cantidadCuotas * coeficiente + recargoDePrendas;
	}	
}
