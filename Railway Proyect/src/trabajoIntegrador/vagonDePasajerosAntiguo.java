package trabajoIntegrador;

public class vagonDePasajerosAntiguo extends Vagon {
	int a�oDeCreacion;
	
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
		public void setA�oDeCreacion(int c){
			a�oDeCreacion = c;
		}
		@Override
		public Vagon clonar(){
			vagonDePasajerosAntiguo a = new vagonDePasajerosAntiguo(super.getNumero());
			a.setA�oDeCreacion(a�oDeCreacion);
			return a;		
			
		}
		@Override
		public void visitar(Visitante v) {
			v.visitarVagonDePasajerosAntiguo(this);
			
		}

}
