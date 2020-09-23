package trabajoIntegrador;

public class PersonalDeBoleteria extends Personal implements Colega
{
	public PersonalDeBoleteria(String nom) {
		super(nom);
		
	}

	@Override
	public void firmarEntrada()
	{
		
		System.out.println("Personal de boleteria " + super.getNombre() + " llegando a trabajar.");
	}

}
