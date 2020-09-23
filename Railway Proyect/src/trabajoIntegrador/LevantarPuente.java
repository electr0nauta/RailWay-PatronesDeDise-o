package trabajoIntegrador;

public class LevantarPuente implements Orden {

	Puente puente;

	public LevantarPuente(Puente p){

		puente = p;

	}

	public void ejecutar(){
		puente.levantar();

	}

}
