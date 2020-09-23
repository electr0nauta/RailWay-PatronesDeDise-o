package trabajoIntegrador;

public class LocomotoraAVaporImp extends LocomotoraImp {

	@Override
	public void encenderMotor()
	{
		System.out.println("Locomotora a vapor encendida.");
	}

	@Override
	public void apagarMotor() 
	{
		System.out.println("Locomotora a vapor apagada");
	}

	@Override
	public void recargarCombustible() 
	{
		System.out.println("Poniendo leña a la locomotora");
	}

	@Override
	public LocomotoraImp clonar() {
		// TODO Auto-generated method stub
		return new LocomotoraAVaporImp();
	}

	@Override
	public void enMarcha()
	{
		System.out.println("Quemando vapor");
	}

	@Override
	public void reportarEstado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportarCombustible() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportarFallas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportarEstadoDelChasis() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportarSistemaDeFrenos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportarMotor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportarComandos() {
		// TODO Auto-generated method stub
		
	}

}
