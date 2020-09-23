package trabajoIntegrador;

public abstract class Motor implements PrototipoClonable{
	
	private boolean noHayFallas = true;
	EstadoDelMotor estadoDelMotor;
	
	public abstract Motor clonar();

	public void hacerRevision() 
	{
		if(noHayFallas) 
		{
			System.out.println("Motor ok");
		}
		else 
		{
			System.out.println("Motor con problemas");
		}
		
	}
	

	public Motor()
	{

	estadoDelMotor = new MotorApagado(this);

	}

	public void acelerar()
	{
	estadoDelMotor.acelerar();

	}

	public void cambiarEstado(EstadoDelMotor em)
	{

	estadoDelMotor = em;

	}
	
	public void encender() 
	{
		estadoDelMotor.encender();
	}
	public void apagar() 
	{
		estadoDelMotor.apagar();
	}
	public void desacelerar() 
	{
		estadoDelMotor.desacelerar();
	}
	public void frenar() 
	{
		estadoDelMotor.frenar();
	}
	public void arreglar() 
	{
		estadoDelMotor.arreglar();
	}
}
