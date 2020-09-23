package trabajoIntegrador;

public class EspecialistaEnDiesel extends Maquinista {
	
	public EspecialistaEnDiesel(String nom)
	{
		super (nom);
	}
	@Override
	public Maquinista clonar(){
		return new EspecialistaEnDiesel(super.getNombre());
	}

}
