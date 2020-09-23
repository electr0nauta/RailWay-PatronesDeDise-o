package trabajoIntegrador;

public abstract class Vagon implements PrototipoClonable, VagonPesoLigero, Iterable
{
	private int numero;
	private boolean todoOk = true;
	private boolean estado = true;
	private boolean frenos = true;
	private double longitud, peso;
	
	public void enganchar()
	{
		System.out.println("Vagon " + this.getNumero() + " engachado.");
	}
	public int getNumero()
	{
		return numero;
	}
	public Vagon (int Numero)
	{
		numero = Numero;//Integer.parseInt(Numero) convierte la variable Numero de tipo string en tipo int
		
	}
	public Vagon (int Numero, double lon, double pesito)
	{
		numero = Numero;//Integer.parseInt(Numero) convierte la variable Numero de tipo string en tipo int
		longitud = lon;
		peso = pesito;
	}
	public void liberarFrenos()
	{
		System.out.println("Vagon " + numero + ": frenos liberados.");
	}
	public abstract Vagon clonar();
	
	public void reportarEstado() 
	{
		if(estado) {
		System.out.println("Vagon " + this.getNumero() + " en estado optimo");
		}
		else
			System.out.println("Vagon " + this.getNumero() + " en estado pesimo");
	}
	public void reportarProblemas() {
		if(todoOk) {
			System.out.println("Vagon " + this.getNumero() + " sin problemas");
			}
		else
			System.out.println("Vagon " + this.getNumero() + " con problemas");
	}
	public void revisarFrenos() {
		if(frenos) 
		{
			estado = true;
			todoOk = true;
			System.out.println("Vagon " + this.getNumero() + " frenos ok");
		}
		else 
		{
			estado = false;
			todoOk = false;
			System.out.println("Vagon " + this.getNumero() + " frenos con problemas");
		}
			
		
		
	}
	public double getLongitud() 
	{
		return longitud;
	}
	public double getPeso() 
	{
		return peso;
	}
	public abstract void visitar(Visitante v);
}
