package macowins;

public class Liquidacion implements Estado {
	@Override
	public Float ajustarPrecio(Float precioBase) {
		return precioBase * 0.5f;
	}

}
