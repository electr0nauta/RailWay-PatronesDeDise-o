package trabajoIntegrador;

public class AndenDePasajeros extends Anden {

	public AndenDePasajeros(int num) {
		super(num);
		
	}
	@Override
	public void llegaUnTren(Tren t)
	{
		System.out.println("Los pasajeros suben y bajan en anden " + super.getNumero());
		super.llegaUnTren(t);
	
	}
	@Override
	public void saleElTren()
	{
		super.saleElTren();
		System.out.println("El tren está dejando el anden de pasajeros " + super.getNumero());
	}

}
