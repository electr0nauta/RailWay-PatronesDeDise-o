package trabajoIntegrador;

public class TrenHistorico implements TrenAbstractFactory{
	@Override
	public Locomotora crearLocomotora() 
	{
	return new LocomotoraAVapor();
	}
	@Override
	public Vagon crearVagon(int a) 
	{
	return new vagonDePasajerosAntiguo(a);
	}
	@Override
	public Maquinista crearMaquinista(String nom) 
	{
	return new MaquinistaJubilado(nom);
	}

}
