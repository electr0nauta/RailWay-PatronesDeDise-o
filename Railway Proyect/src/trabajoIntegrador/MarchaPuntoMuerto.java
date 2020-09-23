package trabajoIntegrador;

public class MarchaPuntoMuerto extends EstadoDelMotor {

public MarchaPuntoMuerto(Motor m) {
		super(m);
		
	}

@Override
public void acelerar(){
System.out.println("Nos ponemos en marcha...");

motor.cambiarEstado(new MarchaLenta(motor));
System.out.println("El motor ahora esta en marcha lenta");		


}

@Override
public void encender() {
	System.out.println("No sucedio nada");	
}

@Override
public void apagar() {
	motor.cambiarEstado(new MotorApagado(motor));
	System.out.println("Se apagó el motor");
}

@Override
public void desacelerar() {
	System.out.println("No sucedio nada");	
}

@Override
public void frenar() {
	System.out.println("No sucedio nada");	
}

@Override
public void arreglar() {
	System.out.println("No sucedio nada");	
}

}
