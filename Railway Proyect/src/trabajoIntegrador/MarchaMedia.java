package trabajoIntegrador;

public class MarchaMedia extends EstadoDelMotor{

	public MarchaMedia(Motor m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		motor.cambiarEstado(new MarchaATodaMaquina(motor));
		System.out.println("El motor ahora esta a toda maquina");		

	}

	@Override
	public void encender() {
		System.out.println("No sucedio nada");		
	}

	@Override
	public void apagar() {
		System.out.println("No sucedio nada");		
		
	}

	@Override
	public void desacelerar() {
		motor.cambiarEstado(new MarchaLenta(motor));
		System.out.println("El motor ahora esta en marcha lenta");		

	}

	@Override
	public void frenar() {
		motor.cambiarEstado(new MarchaPuntoMuerto(motor));
		System.out.println("El motor ahora esta en punto muerto");		

	}

	@Override
	public void arreglar() {
		System.out.println("No sucedio nada");		
		
	}

}
