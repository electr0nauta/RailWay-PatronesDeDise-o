package trabajoIntegrador;

public class Mecanico extends Manejador implements Colega   
{
	MediadorDeEstacion mediador;
	
	public Mecanico(MediadorDeEstacion m) {
		super(null);
		mediador = m;
	}
	
	public Mecanico(Manejador s) {
		super(s);
		
	}
	public void llegaUnTren(TrenFacade trenF){

		trenF.existenFallas();
		trenF.revisarFrenos();
		trenF.recargarCombustible();
		trenF.hacerRevision();

		}
	public boolean cargarCombustible() {
		System.out.println("Cargando combustible...");
		super.cargarCombustible();
		return true;}
	public boolean arreglarDesperfectoEnLocomotora() {
		System.out.println("Arreglando locomotora...");
		super.arreglarDesperfectoEnLocomotora();
		return false;}
	public boolean arreglarDesperfectoEnVagon() {
		System.out.println("Arreglando vagón...");
		super.arreglarDesperfectoEnVagon();
		return true;
	}
	public void arregladoElDetector() {
		
		mediador.arregladoElDetector();
	}
	public void meQuedeSinRepuestos() {
		mediador.meQuedeSinRepuestos();
	}

	public void detectorConFallas() {
		// TODO Auto-generated method stub
		
	}

	public void problemaEnLosVagones() {
		// TODO Auto-generated method stub
		
	}

	public void revisarTren() {
		// TODO Auto-generated method stub
		
	}

}
