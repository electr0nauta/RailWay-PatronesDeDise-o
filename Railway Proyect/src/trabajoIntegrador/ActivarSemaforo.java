package trabajoIntegrador;

public class ActivarSemaforo extends CaracteristicaDecorator {

public ActivarSemaforo(Caracteristica c) {
		super(c);
		
	}

@Override
public void pasaElTren(){

System.out.println("Activando los semáforos");
super.pasaElTren();

}

}
