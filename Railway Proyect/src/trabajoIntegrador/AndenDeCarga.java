package trabajoIntegrador;

public class AndenDeCarga extends Anden 
{
	public AndenDeCarga(int num) {
		super(num);
		
	}

	@Override
	public void llegaUnTren(Tren t)
	{
		System.out.println("Cargando y descargando mercader�a en anden " + super.getNumero());
		super.llegaUnTren(t);
	}
	@Override
	public void saleElTren()
	{
		super.saleElTren();
		System.out.println("El tren est� dejando el anden de carga " + super.getNumero());
	}
}
