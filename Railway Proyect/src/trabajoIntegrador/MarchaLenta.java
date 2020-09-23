package trabajoIntegrador;

public class MarchaLenta extends EstadoDelMotor{

	public MarchaLenta(Motor m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		motor.cambiarEstado(new MarchaMedia(motor));
		System.out.println("El motor ahora esta en marcha media");		

		
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
		motor.cambiarEstado(new MarchaPuntoMuerto(motor));
		System.out.println("El motor ahora esta en punto muerto");		

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
