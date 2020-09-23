package trabajoIntegrador;

public class vagonDePasajerosAntiguo extends Vagon {
	int añoDeCreacion;
	
		public vagonDePasajerosAntiguo(int Numero) {
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
		public void setAñoDeCreacion(int c){
			añoDeCreacion = c;
		}
		@Override
		public Vagon clonar(){
			vagonDePasajerosAntiguo a = new vagonDePasajerosAntiguo(super.getNumero());
			a.setAñoDeCreacion(añoDeCreacion);
			return a;		
			
		}
		@Override
		public void visitar(Visitante v) {
			v.visitarVagonDePasajerosAntiguo(this);
			
		}

}
