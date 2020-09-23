package trabajoIntegrador;
import java.util.ArrayList;

public class RedFerroviaria {
	
	private ArrayList<Tren> trenes = new ArrayList<Tren>();
	private ArrayList<Estacion> estaciones = new ArrayList<Estacion>();
	static RedFerroviaria unicaRed = null;	
	
	private RedFerroviaria(){

	}
	
	public static RedFerroviaria getInstance(){

		if(unicaRed == null)

		unicaRed = new RedFerroviaria();

		return unicaRed;

		}
	
	
	public void agregarTren(Tren t){
		trenes.add(t);
		
	}
	public void agregarEstacion(Estacion e){
		estaciones.add(e);
		
	}
	public void asignarTrenAEstacion(Tren t, EstacionReal e)
	{
		e.asignarTren(t);
	}
}
