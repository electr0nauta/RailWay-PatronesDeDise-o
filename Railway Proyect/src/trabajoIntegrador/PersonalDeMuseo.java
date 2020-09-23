package trabajoIntegrador;

public class PersonalDeMuseo extends Personal implements Colega{
	
	public PersonalDeMuseo(String nom) {
		super(nom);
		
	}

	@Override	
	public void firmarEntrada()
	{
		
		System.out.println("Personal de Museo " + super.getNombre() + " llegando a trabajar.");
	}

}
