package trabajoIntegrador;

public class EncenderLucesTunel implements Orden {

	Tunel tunel;

	public EncenderLucesTunel(Tunel t){

		tunel = t;

	}

	public void ejecutar(){
		tunel.encender();

	}

}
