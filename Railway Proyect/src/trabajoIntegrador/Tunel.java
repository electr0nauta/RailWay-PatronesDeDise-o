package trabajoIntegrador;

public class Tunel implements Conexion{
	double longitud;
	Estacion conexionUno, conexionCero;
	Caracteristica c;
	
	public Tunel (double l, Estacion e1, Estacion e2) {
		conexionUno = e1;
		conexionCero = e2;
		longitud = l;
		
	}
	
	public Tunel (double l) 
	{
		longitud = l;
	}
	
	public Tunel(Caracteristica ca) 
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
		System.out.println("Yendo por tunel");
	}

	@Override
	public void vuelta(Tren t) {
		conexionCero.ida(t);
		System.out.println("Volviendo por tunel");
	}

	public void encender() {
		System.out.println("Luces del tunel encendidas");
	}
	
	public void apagar() {
		System.out.println("Luces del tunel apagadas");
	}


}
