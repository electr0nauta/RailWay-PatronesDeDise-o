package trabajoIntegrador;

public class BajarPuente implements Orden {

	Puente puente;

	public BajarPuente(Puente p){

		puente = p;

	}

	public void ejecutar(){
		puente.bajar();

	}

}
