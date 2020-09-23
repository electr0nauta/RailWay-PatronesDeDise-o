package trabajoIntegrador;

public class MotorApagado extends EstadoDelMotor {

public MotorApagado(Motor m) {
		super(m);
		
	}

@Override
public void acelerar(){

	System.out.println("El motor esta apagado, no sucedio nada");

}

@Override
public void encender() {
	motor.cambiarEstado(new MarchaPuntoMuerto(motor));
	System.out.println("El motor ahora esta en punto muerto");
}

@Override
public void apagar() {
	System.out.println("El motor ya estaba apagado, no sucedio nada");
}

@Override
public void desacelerar() {
	System.out.println("El motor esta apagado, no sucedio nada");
	
}

@Override
public void frenar() {
	System.out.println("El motor esta apagado, no sucedio nada");
	
}

@Override
public void arreglar() {
	System.out.println("El motor esta apagado, no sucedio nada");
	
}

}
