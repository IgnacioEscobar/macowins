package macowins;

import java.time.LocalDate;
import java.util.ArrayList;

public class RepositorioVentas{
	private ArrayList<Venta> ventas;
	
	public RepositorioVentas() {
		this.ventas = new ArrayList<Venta>();
	}

	public void registrarVenta(Venta venta) {
		ventas.add(venta);
	}
	public Float gananciasDelDia(LocalDate fecha) {
		return ventas.stream()
					 .filter(venta -> venta.getFecha().equals(fecha))
					 .map(venta -> venta.importeTotal())
					 .reduce(0f, Float::sum);
	}

}
