package trabajoIntegrador;

public class Via implements Conexion {
	
	double longitud;
	Estacion conexionUno, conexionCero;
	Caracteristica c;
	
	public Via (double l, Estacion e1, Estacion e2) {
		conexionUno = e1;
		conexionCero = e2;
		longitud = l;
		
	}
	public Via (double l) 
	{
		longitud = l;
	}
	
	public Via(Caracteristica ca) 
	{
		c = ca;
	}
	
	public void setCaracteristica(Caracteristica ca) 
	{
		c = ca;
	}
	
	@Override
	public void ida(Tren t) 
	{
		conexionUno.ida(t);
		System.out.println("Yendo por via");
		c.pasaElTren();
	}

	@Override
	public void vuelta(Tren t) {
		conexionCero.ida(t);
		System.out.println("Volviendo por via");
		c.pasaElTren();
	}

}
