package trabajoIntegrador;

public class MarchaRoto extends EstadoDelMotor {

	public MarchaRoto(Motor m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		System.out.println("El motor esta roto");		
	}

	@Override
	public void encender() {
		System.out.println("El motor esta roto");		
	}

	@Override
	public void apagar() {
		System.out.println("El motor esta roto");		
	}

	@Override
	public void desacelerar() {
		System.out.println("El motor esta roto");		
	}

	@Override
	public void frenar() {
		System.out.println("El motor esta roto");		
	}

	@Override
	public void arreglar() {
		motor.cambiarEstado(new MotorApagado(motor));
		System.out.println("El motor se ha arreglado correctamente");
		System.out.println("El motor ahora esta apagado");		


	}

}
