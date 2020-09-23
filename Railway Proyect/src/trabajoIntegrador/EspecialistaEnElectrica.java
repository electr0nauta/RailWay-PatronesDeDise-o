package trabajoIntegrador;

public class EspecialistaEnElectrica extends Maquinista {
	
	public EspecialistaEnElectrica(String nom)
	{
		super (nom);
	}
	@Override
	public Maquinista clonar(){
		return new EspecialistaEnElectrica(super.getNombre());
	}

}
