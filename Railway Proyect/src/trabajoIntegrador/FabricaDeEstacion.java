package trabajoIntegrador;

public abstract class FabricaDeEstacion {
	public static Estacion crearEstacion(int cualEstacion){
		FabricaDeEstacion fabricaDeEstaciones = null;
		switch(cualEstacion){
		case 1: fabricaDeEstaciones = new FabricaDeEstacionDePasajeros();break;
		case 2: fabricaDeEstaciones = new FabricaDeEstacionHistorica(); break;
		case 3: fabricaDeEstaciones = new FabricaDeEstacionDeCarga(); break;
		}
		return fabricaDeEstaciones.crearEstacion();
	}
	public abstract Estacion crearEstacion();
}