package trabajoIntegrador;

public class TrenDePasajeros implements TrenAbstractFactory 
{
	@Override
	public Locomotora crearLocomotora() 
	{
	return new LocomotoraElectrica();
	}
	@Override
	public Vagon crearVagon(int a) 
	{
	return new vagonDePasajeros(a);
	}
	@Override
	public Maquinista crearMaquinista(String nom) 
	{
	return new EspecialistaEnElectrica(nom);
	}


}
