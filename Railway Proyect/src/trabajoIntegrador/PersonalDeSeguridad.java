package trabajoIntegrador;

public class PersonalDeSeguridad extends Personal implements Colega
{
	MediadorDeEstacion mediador;
	
	public void setMediador(MediadorDeEstacion m) {
		mediador = m;
	}

	public PersonalDeSeguridad(String nom) {
		super(nom);
		
	}
	
	@Override	
	public void firmarEntrada()
	{
		
		System.out.println("Personal de Seguridad " + super.getNombre() + " llegando a trabajar.");
	}
	
	public void llegaUnTren(TrenFacade trenF){

		trenF.todoEnOrden();
		trenF.reportarProblemas();

		}
	
	public void controlarDisturbios() {}
	public void ubicarPasajeros() {}
	public void noRobesNada() {
		
		mediador.noRobesNada();
	}
	public void todoEnOrden() {
		
		mediador.todoEnOrden();
	}

	public void faltaMercaderia() {
		// TODO Auto-generated method stub
		
	}

	public void disturbiosEnElAnden() {
		// TODO Auto-generated method stub
		
	}
}
