package trabajoIntegrador;

public class Anden {
	private int numero;
	private Tren tren;
	EstadoAnden estado;
	
	
	public void llegaUnTren(Tren t)
	{
		tren = t;
		
	}
	public int getNumero()
	{
		return numero;
	}
	public boolean estaOcupado()
	{
		if (tren == null)
			return false;
		else
			return true;
		}
	public Anden(int num)
	{
		numero = num;
	}
	
	public void saleElTren()
	{
		tren = null;
		
	}
	public MementoAnden crearMemento(){

		MementoAnden m = new MementoAnden();
		m.obtenerEstado(this);
		return m;

		}
	public EstadoAnden getEstado() {
		return estado;
	}
	public void setEstado(EstadoAnden e) {
		
		estado = e;
	}
	

	
}
