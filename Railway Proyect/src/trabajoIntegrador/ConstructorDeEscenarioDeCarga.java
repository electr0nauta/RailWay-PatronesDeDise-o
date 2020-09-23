package trabajoIntegrador;

public class ConstructorDeEscenarioDeCarga extends ConstructorDeEscenarioAbstracto {

	@Override
	public Estacion construirEstacion(String nombre) {
		FabricaDeEstacion fabrica = new FabricaDeEstacionDeCarga();
		Estacion e = fabrica.crearEstacion();
		e.asignarNombre(nombre);
		return e;
	}

	@Override
	public Via construirVia(double l, Estacion e1, Estacion e2) {

		return new Via(l, e1, e2);

		}

	@Override
	public ViaDoble construirViaDoble(double l, Estacion e1, Estacion e2) {

		return new ViaDoble(l, e1, e2);

		}

	@Override
	public Puente construirPuente(double l, Estacion e1, Estacion e2) {
		return new Puente(l, e1, e2);
	}

	@Override
	public Tunel construirTunel(double l, Estacion e1, Estacion e2) {
		// TODO Auto-generated method stub
		return new Tunel(l, e1, e2);
	}

	@Override
	public TramoDeVia construirTramoDeVia(Estacion e1, Estacion e2) {
		// TODO Auto-generated method stub
		return new TramoDeVia(e1, e2);
	}

}
