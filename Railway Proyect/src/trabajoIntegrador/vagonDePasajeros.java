package trabajoIntegrador;

public class vagonDePasajeros extends Vagon 
{
	int capacidad;
	
	
	public vagonDePasajeros(int Numero) {
		super(Numero);
		 
		
	}
	public int getNumero()
	{
		return super.getNumero();
	}
	public void enganchar()
	{
		System.out.println("Vagon de pasajeros " + super.getNumero() + " enganchado.");
	}
	public void setCapacidad(int c){
		capacidad = c;
	}
	@Override
	public Vagon clonar(){
		vagonDePasajeros a = new vagonDePasajeros(super.getNumero());
		a.setCapacidad(capacidad);
		return a;
	}
	public void destrabarPuertas() {
		// TODO Auto-generated method stub
		
	}
	public void atornillarAsientos() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void visitar(Visitante v) {
		v.visitarVagonDePasajeros(this);
		
	}

}
