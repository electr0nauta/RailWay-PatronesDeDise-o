package trabajoIntegrador;

public abstract class ConstructorDeEscenarioAbstracto 
{

	protected RedFerroviaria rf;
	public void construirRedFerroviara(){
		rf = RedFerroviaria.getInstance();
		
	}
	
	public RedFerroviaria obtenerRedFerroviaria(){
		
		return rf;
		
	}
	
	public abstract Estacion construirEstacion(String nombre);
	
	public abstract Via construirVia(double l, Estacion e1, Estacion e2);
	public abstract ViaDoble construirViaDoble(double l, Estacion e1, Estacion e2);
	public abstract Puente construirPuente(double l, Estacion e1, Estacion e2);
	public abstract Tunel construirTunel(double l, Estacion e1, Estacion e2);
	public abstract TramoDeVia construirTramoDeVia(Estacion e1, Estacion e2);
	//public abstract Puente construirPuente();
}
