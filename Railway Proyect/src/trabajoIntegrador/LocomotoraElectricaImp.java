package trabajoIntegrador;

public class LocomotoraElectricaImp extends LocomotoraImp{

	@Override
	public void encenderMotor() {

	System.out.println("Enchufado a los cables en suspensión");

	}

	@Override
	public void apagarMotor() {

	System.out.println("Desenchufado de los cables en suspensión");

	}

	@Override
	public void recargarCombustible() {

	System.out.println("No necesito mientras haya corriente");

	}

	@Override
	public LocomotoraImp clonar() {
		// TODO Auto-generated method stub
		return new LocomotoraElectricaImp();
	}

	@Override
	public void enMarcha()
	{
		System.out.println("Consumiendo electricidad");
	}

	@Override
	public void reportarEstado() {
		System.out.println("Estoy enchufada al tendido eléctrico");		
	}

	@Override
	public void reportarCombustible() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportarFallas() {
		System.out.println("Hay un cable pelado");		
	}

	@Override
	public void reportarEstadoDelChasis() {
		System.out.println("En perfectas condiciones");		
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
