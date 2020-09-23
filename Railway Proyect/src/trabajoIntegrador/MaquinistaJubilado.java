package trabajoIntegrador;

public class MaquinistaJubilado extends Maquinista {
	
	public MaquinistaJubilado(String nom)
	{
		super (nom);
	}
	@Override
	public Maquinista clonar(){
		return new MaquinistaJubilado(super.getNombre());
	}

}
