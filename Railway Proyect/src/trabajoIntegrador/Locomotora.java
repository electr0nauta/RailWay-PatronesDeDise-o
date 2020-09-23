package trabajoIntegrador;

public abstract class Locomotora implements PrototipoClonable
{
	private Maquinista maquinista;
	private Motor motor;
	private boolean estado = true;
	private boolean combustible;
	protected LocomotoraImp implementacion;
	private double longitud, peso;
	
	
	
	public Locomotora() {}
	public Locomotora(double lon, double pesito) 
	{
		longitud = lon;
		peso = pesito;
	}
	
	public void encenderMotor()
	{
		implementacion.encenderMotor();
	}
	public void apagarMotor() 
	{

	implementacion.apagarMotor();
	}
	public void enMarcha()
	{
		
	}
	public void setMaquinista(Maquinista m)
	{
		maquinista = m;
		maquinista.estoyListo();
	}
	public Maquinista getMaquinista() 
	{
		return maquinista;
	}
	public abstract Locomotora clonar();
	
	public void setMotor(Motor m) 
	{
		motor = m;
	}
	
	public Motor getMotor() 
	{
		return motor;
	}
	public void reportarEstadoParaProximoTramo() {
		implementacion.reportarEstado();
		
	}
	public void recargarCombustible() {
		implementacion.recargarCombustible();
		combustible = true;
		System.out.println("Combustible recargado");
		
	}
	public double getLongitud() 
	{
		return longitud;
	}
	public double getPeso() 
	{
		return peso;
	}
	
	public void acelerar() 
	{
		motor.acelerar();
	}
	public void encender() 
	{
		motor.encender();
	}
	public void apagar() 
	{
		motor.apagar();
	}
	public void desacelerar() 
	{
		motor.desacelerar();
	}
	public void frenar() 
	{
		motor.frenar();
	}
	public void arreglar() 
	{
		motor.arreglar();
	}
}