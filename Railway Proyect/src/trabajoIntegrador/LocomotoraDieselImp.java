package trabajoIntegrador;

public class LocomotoraDieselImp extends LocomotoraImp{

	@Override
	public void encenderMotor()
	{
		System.out.println("Locomotora Diesel encendida.");
	}

	@Override
	public void apagarMotor() 
	{
		System.out.println("Locomotora Diesel apagada");
	}

	@Override
	public void recargarCombustible() 
	{
		System.out.println("Recargando Diesel");
	}

	@Override
	public void enMarcha()
	{
		System.out.println("Quemando gasoil");
	}

	@Override
	public LocomotoraImp clonar() {
		// TODO Auto-generated method stub
		return new LocomotoraDieselImp();
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
