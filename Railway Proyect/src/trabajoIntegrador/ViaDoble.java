package trabajoIntegrador;

public class ViaDoble implements Conexion {
	double longitud;
	Estacion conexionUno, conexionCero;
	Caracteristica c;
	
	
	public ViaDoble (double l, Estacion e1, Estacion e2) {
		conexionUno = e1;
		conexionCero = e2;
		longitud = l;
		
	}
	public ViaDoble (double l) 
	{
		longitud = l;
	}

	public ViaDoble(Caracteristica ca) 
	{
		c = ca;
	}
	
	public void setCaracteristica(Caracteristica ca) 
	{
		c = ca;
	}

	@Override
	public void ida(Tren t) {
		conexionUno.ida(t);
		System.out.println("Yendo por via doble");
		
	}


	@Override
	public void vuelta(Tren t) {
		conexionUno.ida(t);
		System.out.println("Volviendo por via doble");
	}

}
