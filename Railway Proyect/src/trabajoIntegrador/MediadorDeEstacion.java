package trabajoIntegrador;

public class MediadorDeEstacion implements Mediador {
	
	Administrativo administrativo;
	Mecanico mecanico;
	PersonalDeSeguridad seguridad;
	OperadorDeCabina cabina;
	ControladorDeSemaforos operador;
	PersonalDeCarga cargaDescarga;
	SupervisorDeEstacion supervisor;
	public void necesitoVacaciones(){

	administrativo.necesitoVacaciones();

	}
	public void necesitoUnAyudante(){

	supervisor.necesitoUnAyudante();

	}
	public void reporteDeAsistencia() {
		supervisor.reporteDeAsistencia();
	}
	public void arregladoElDetector() {
		operador.arregladoElDetector();
		
	}
	public void meQuedeSinRepuestos() {
		supervisor.meQuedeSinRepuestos();
		
	}
	public void andenesOcupados() {
		operador.andenesOcupados();
		
	}
	public void reporteDelClima() {
		supervisor.reporteDelClima();
		
	}
	public void detectorConFallas() {
		mecanico.detectorConFallas();
		
	}
	public void trenEnEspera() {
		supervisor.trenEnEspera();
		
	}
	public void noRobesNada() {

		cargaDescarga.noRobesNada();
	}
	public void todoEnOrden() {
		supervisor.todoEnOrden();
		
	}
	public void faltaMercaderia() {
		seguridad.faltaMercaderia();
		
	}
	public void cargaLista() {
		supervisor.cargaLista();
		
	}
	public void problemaEnLosVagones() {
		mecanico.problemaEnLosVagones();
		
	}
	public void despedirAFulano() {
		
		administrativo.despedirAFulano();
	}
	public void disturbiosEnElAnden() {
		
		seguridad.disturbiosEnElAnden();
		
	}
	public void cerraLosAccesos() {
		
		operador.cerraLosAccesos();
		
	}
	public void revisarTren() {
		
		mecanico.revisarTren();
		
	}
	
	
	
	
}
