package trabajoIntegrador;

import java.util.ArrayList;


public class EstacionReal implements Estacion, Observado
{
	private String nombre;
	private ArrayList<Personal> personal = new ArrayList<Personal>();
	private ArrayList<Anden> andenes = new ArrayList<Anden>();
	private Conexion conexion0;
	private Conexion conexion1;
	private ArrayList<Observador> observadores = new ArrayList<Observador>();
	private Tren trenRecientementeLlegado;
	
	public void agregarPersonal(Personal p)
	{
		personal.add(p);
		
	}
	public void agregarAnden(Anden a)
	{
		andenes.add(a);
		
	}
	public void llegaUnTren(Tren t)
	{
		
		System.out.println("El tren ha llegado a la estación");
		trenRecientementeLlegado = t;
		this.notificar();
		
		int i = 0;
		while(i<andenes.size()){
			if(andenes.get(i).estaOcupado()==false){
				andenes.get(i).llegaUnTren(t);
				break;
			}
			else
				i++;
		}
	}
	public void saleUnTren(int num)
	{
		for(Anden a: andenes)
		{
			if(a.getNumero()==num)
			{
				a.saleElTren();
			}
		}
	}
	
	
	public void asignarTren(TrenClonable t)
	{
		for(Anden a: andenes)
			a.llegaUnTren((Tren)t.clonar());
		
		
	}
	
	public void asignarNombre(String Nombre) 
	{
		nombre = Nombre;
		
	}
	public void agregarConexion0(Conexion v) 
	{
		conexion0 = v;
		
	}
	public void agregarConexion1(Conexion v) 
	{
		conexion1 = v;
		
	}
	public EstacionReal(String s) 
	{
		this.asignarNombre(s);
		
	}
	public String getNombre() 
	{
		return nombre;
	}
	
	public void ida(Tren t) 
	{
		this.llegaUnTren(t);
		System.out.println("El tren vino a estacion " + this.getNombre());
	}
	public void vuelta(Tren t) 
	{
		this.llegaUnTren(t);
		System.out.println("El tren volvio a estacion " + this.getNombre());
	}
	public void idaDelTren() 
	{
		conexion1.ida(null);;
	}
	public void vueltaDelTren() 
	{
		conexion0.vuelta(null);
	}
	@Override
	public void agregar(Observador o) {
		observadores.add(o);		
	}
	@Override
	public void quitar(Observador o) {
		observadores.remove(o);		
	}
	@Override
	public void notificar() {
		for(Observador o: observadores)
			o.actualizar(this);		
	}
	
	
}
