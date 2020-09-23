package trabajoIntegrador;

public class AndenHistorico extends Anden {
	
	public AndenHistorico(int num) {
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
		System.out.println("El tren está dejando el anden historico " + super.getNumero());
	}

}
