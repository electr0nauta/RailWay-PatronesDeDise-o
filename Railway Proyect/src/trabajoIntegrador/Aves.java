package trabajoIntegrador;

public class Aves extends CaracteristicaDecorator {

public Aves(Caracteristica c) {
		super(c);
		
	}

@Override
public void pasaElTren(){

System.out.println("Las aves salen espantadas");
super.pasaElTren();

}

}
