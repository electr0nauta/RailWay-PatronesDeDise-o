package trabajoIntegrador;

public class MarchaATodaMaquina extends EstadoDelMotor{

	public MarchaATodaMaquina(Motor m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		motor.cambiarEstado(new MarchaRoto(motor));
		System.out.println("El motor ahora esta roto");
		
		
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
		motor.cambiarEstado(new MarchaMedia(motor));
		System.out.println("El motor ahora esta a media marcha");
		
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
