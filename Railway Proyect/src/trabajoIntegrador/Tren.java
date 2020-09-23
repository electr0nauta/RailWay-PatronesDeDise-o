package trabajoIntegrador;

import java.util.ArrayList;

public class Tren implements TrenClonable 
{
	private Locomotora locomotora;
	private ArrayList<Vagon> Vagones = new ArrayList<Vagon>();
	private String horaDeArribo;
	
	public void agregarLocomotora(Locomotora l)
	{
		locomotora = l;
		locomotora.encenderMotor();
	}
	public void agregarVagon(Vagon v)
	{
		Vagones.add(v);
		v.enganchar();
	}
	public void realizarRecorrido()
	{
		locomotora.enMarcha();
		for(Vagon v: Vagones)
		{
			v.liberarFrenos();
		}
	}
	
	public ArrayList<Vagon> getVagones()
	{
		return Vagones;
	}
	
	public Tren clonar()
	{
		Tren tren = new Tren();
		tren.agregarLocomotora(locomotora.clonar());
		for(Vagon v: Vagones)
			tren.agregarVagon(v.clonar());
		return tren;
	}
	public Locomotora getLocomotora() 
	{
		return locomotora;
	}
	public void horaDeArribo(String hora) {
		horaDeArribo = hora;
		
	}
	
	public double longitudTotal() 
	{
		double total = 0;
		for(int i=0; i<this.Vagones.size(); i++ )
			total =+ Vagones.get(i).getLongitud();
		
		total =+ this.getLocomotora().getLongitud();
		return total;
	}
	public double pesoTotal() 
	{
		double total = 0 ;
		for(int i=0; i<this.Vagones.size(); i++ )
			total =+ Vagones.get(i).getPeso();
		
		total =+ this.getLocomotora().getPeso();
		return total;
	}
	public Iterador crearIterador() {

		return new IteradorDeVagones(this);

		}
	public Iterador crearIteradorInverso() 
	{
		return new IteradorDeVagonesInverso(this);
	}
	
}
