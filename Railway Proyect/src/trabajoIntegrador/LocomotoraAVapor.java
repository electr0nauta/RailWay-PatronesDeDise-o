package trabajoIntegrador;

public class LocomotoraAVapor extends Locomotora {
	
	public LocomotoraAVapor() {}
	
	public LocomotoraAVapor(double lon, double pesito) {
		super(lon, pesito);
		// TODO Auto-generated constructor stub
	}
	public void encenderMotor()
	{
		System.out.println("Locomotora a vapor encendida.");
	}
	public void apagarMotor() 
	{
		System.out.println("Locomotora a vapor apagada");
	}
	public void enMarcha()
	{
		System.out.println("Quemando vapor");
	}
	public void recargarCombustible() 
	{
		System.out.println("Poniendo leña a la locomotora");
	}
	@Override
	public Locomotora clonar(){
		return new LocomotoraAVapor();
	}

}
