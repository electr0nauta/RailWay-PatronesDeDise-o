package trabajoIntegrador;

public class ActivarBarrera extends CaracteristicaDecorator {

public ActivarBarrera(Caracteristica c) {
		super(c);
		
	}

@Override
public void pasaElTren(){

System.out.println("Activando la barrera");
super.pasaElTren();

}

}