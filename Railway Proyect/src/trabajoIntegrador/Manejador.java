package trabajoIntegrador;

public abstract class Manejador {

	Manejador sucesor = null;

	public Manejador(Manejador s){

		sucesor = s;

	}
	boolean cargarCombustible() {
		if(sucesor != null)

			return sucesor.cargarCombustible();

			else

			return false;
	}
	boolean arreglarDesperfectoEnLocomotora() {
		if(sucesor != null)

			return sucesor.arreglarDesperfectoEnLocomotora();

			else

			return false;
	}
	boolean arreglarDesperfectoEnVagon() {
		if(sucesor != null)

			return sucesor.arreglarDesperfectoEnVagon();

			else

			return false;
	}
	boolean controlarDisturbios() {
		if(sucesor != null)

			return sucesor.controlarDisturbios();

			else

			return false;
	}
	boolean ubicarPasajeros() {
		if(sucesor != null)

			return sucesor.ubicarPasajeros();

			else

			return false;
	}
	boolean decidirSegunElClima() {
		if(sucesor != null)

			return sucesor.decidirSegunElClima();

			else

			return false;
	}


}
