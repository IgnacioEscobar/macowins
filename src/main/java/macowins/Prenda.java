package macowins;

public class Prenda {
	private String tipo;
	private Float precioBase;
	private Estado estado;
	
	public Prenda(String tipo, Float precioBase, Estado estado) {
		this.tipo = tipo;
		this.precioBase = precioBase;
		this.estado = estado;
	}
	public Prenda(String tipo, Float precioBase) {
		this.tipo = tipo;
		this.precioBase = precioBase;
		this.estado = new Nueva();
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Float getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(Float precioBase) {
		this.precioBase = precioBase;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public Float precio(){
		return this.estado.ajustarPrecio(precioBase);
	};
}
