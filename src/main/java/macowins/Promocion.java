package macowins;

public class Promocion implements Estado {
	private Float bonificacion;
	
	public Promocion(Float bonificacion) {
		super();
		this.bonificacion = bonificacion;
	}

	public Float getBonificacion() {
		return bonificacion;
	}
	public void setBonificacion(Float bonificacion) {
		this.bonificacion = bonificacion;
	}

	@Override
	public Float ajustarPrecio(Float precioBase) {
		return precioBase - bonificacion;
	}

}
