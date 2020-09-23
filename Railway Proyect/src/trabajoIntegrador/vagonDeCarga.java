package trabajoIntegrador;

import java.util.ArrayList;

public class vagonDeCarga extends Vagon 
{
	private String tipoDeCarga;
	private ArrayList<VagonPesoLigero> vagones;
	
	public vagonDeCarga(int Numero) 
	{
		super(Numero);
	}
	public int getNumero()
	{
		return super.getNumero();
	}
	public void enganchar()
	{
		System.out.println("Vagon de carga " + super.getNumero() + " enganchado.");
	}
	public void setTipoCarga(String a){
		tipoDeCarga = a;
	}
	@Override
	public Vagon clonar(){
		vagonDeCarga a = new vagonDeCarga(super.getNumero());
		a.setTipoCarga(tipoDeCarga);
		return a;
	}
	public void desatascarTolva() {
		// TODO Auto-generated method stub
		
	}
	public void repararCompuertas() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void visitar(Visitante v) {
		v.visitarVagonDeCarga(this);
		
	}

}
