 package macowins;

import java.time.LocalDate;
import java.util.List;

abstract public class Venta {
	private List<ItemDeVenta> items;
	private LocalDate         fecha;
	
	public Venta(LocalDate fecha, List<ItemDeVenta> items) {
		this.items = items;
		this.fecha = fecha;
	}
	public Venta(List<ItemDeVenta> items) {
		this.items = items;
		this.fecha = LocalDate.now();
	}

	public List<ItemDeVenta> getItems() {
		return items;
	}
	public void setItems(List<ItemDeVenta> items) {
		this.items = items;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	

	public Float adicion(){
		return getItems().stream()
				 .map(item -> item.importe())
				 .reduce(0f, Float::sum);
	}
	public abstract Float importeTotal();
}
