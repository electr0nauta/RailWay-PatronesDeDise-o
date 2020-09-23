package trabajoIntegrador;

public class LocomotoraElectrica extends Locomotora   
{
	//////////////////////////////////
	
	public LocomotoraElectrica() {
		
		// TODO Auto-generated constructor stub
	}
	public void encenderMotor()
	{
		System.out.println("Enchufado a los cables en suspensión");	
	}
	public void apagarMotor() 
	{
		System.out.println("Desenchufado de los cables en suspensión");
	}
	public void recargarCombustible() 
	{
		System.out.println("No necesito mientras haya corriente");	
	}
	public void enMarcha()
	{
		System.out.println("Consumiendo electricidad");
	}
	
	public LocomotoraElectrica clonar(){
		return new LocomotoraElectrica();
	}
	
}