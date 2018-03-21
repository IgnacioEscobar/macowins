package macowins;

public class ItemDeVenta {
	private Prenda prenda;
	private Integer cantidad;
	
	public Prenda getPrenda() {
		return prenda;
	}
	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public Float importe(){
		return prenda.precio() * cantidad;
	}
}
