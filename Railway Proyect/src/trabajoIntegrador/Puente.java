package trabajoIntegrador;

public class Puente implements Conexion{
	double longitud;
	Estacion conexionUno, conexionCero;
	Caracteristica c;
	
	public Puente (double l, Estacion e1, Estacion e2) {
		conexionUno = e1;
		conexionCero = e2;
		longitud = l;
		
	}
	
	public Puente (double l) 
	{
		longitud = l;
	}
	
	public Puente(Caracteristica ca) 
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
		System.out.println("Yendo por puente");
	}

	@Override
	public void vuelta(Tren t) {
		conexionCero.ida(t);
		System.out.println("Volviendo por puente");
	}
	public void levantar() {
		System.out.println("Levantando puente");
	}
	public void bajar() {
		System.out.println("Bajando puente");
	}


}
