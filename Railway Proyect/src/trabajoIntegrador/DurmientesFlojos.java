package trabajoIntegrador;

public class DurmientesFlojos extends CaracteristicaDecorator {

public DurmientesFlojos(Caracteristica c) {
		super(c);
		
	}

@Override
public void pasaElTren(){

System.out.println("Los durmientes flojos hacen mucho ruido");
super.pasaElTren();

}

}