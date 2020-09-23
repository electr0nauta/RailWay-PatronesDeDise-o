package trabajoIntegrador;

public class ApagarLucesTunel implements Orden {

	Tunel tunel;

	public ApagarLucesTunel(Tunel t){

		tunel = t;

	}

	public void ejecutar(){
		tunel.apagar();

	}

}
