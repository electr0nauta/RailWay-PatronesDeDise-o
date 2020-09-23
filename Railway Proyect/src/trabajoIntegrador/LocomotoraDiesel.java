package trabajoIntegrador;

public class LocomotoraDiesel extends Locomotora 
{
	public LocomotoraDiesel() {}
	public LocomotoraDiesel(double lon, double pesito) {
		super(lon, pesito);
		// TODO Auto-generated constructor stub
	}
	public void encenderMotor()
	{
		System.out.println("Locomotora Diesel encendida.");
	}
	public void apagarMotor() 
	{
		System.out.println("Locomotora Diesel apagada");
	}
	public void enMarcha()
	{
		System.out.println("Quemando gasoil");
	}
	public void recargarCombustible() 
	{
		System.out.println("Recargando Diesel");
	}
	@Override
	public Locomotora clonar(){
		return new LocomotoraDiesel();
	}

}
