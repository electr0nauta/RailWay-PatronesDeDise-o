package trabajoIntegrador;

import java.util.ArrayList;

public class MaquinistaRobot extends Maquinista {

public MaquinistaRobot(String Nombre) {
		super(Nombre);
		
	}

ExpresionAbstracta expresion;

public void interpretar(ArrayList<String> prog){

expresion = ExpresionAbstracta.interpretar(prog, 0);

}

public void ejecutar(){


expresion.ejecutar(ContextoLocomotora locomotora);

}

@Override
public Maquinista clonar() {
	
	return this;
}

}
