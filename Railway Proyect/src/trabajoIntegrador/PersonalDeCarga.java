package trabajoIntegrador;

public class PersonalDeCarga extends Personal implements Colega
{
	MediadorDeEstacion mediador;
	
	public void setMediador(MediadorDeEstacion m) {
		mediador = m;
	}
	
	public PersonalDeCarga(String nom) {
		super(nom);
		
	}

	@Override	
	public void firmarEntrada()
	{
		
		System.out.println("Personal de carga " + super.getNombre() + " llegando a trabajar.");
	}

	public void noRobesNada() {
		// TODO Auto-generated method stub
		
	}
	public void faltaMercaderia() {
		
		mediador.faltaMercaderia();
	}
	public void cargaLista() {
		
		mediador.cargaLista();
	}
	public void problemaEnLosVagones() {
		
		mediador.problemaEnLosVagones();
	}
}
