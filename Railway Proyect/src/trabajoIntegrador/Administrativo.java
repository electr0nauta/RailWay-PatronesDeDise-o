package trabajoIntegrador;

public class Administrativo implements Colega {
	
	MediadorDeEstacion mediador;
	
	public void setMediador(MediadorDeEstacion m) {
		mediador = m;
	}
	public void reporteDeAsistencia() {
		mediador.reporteDeAsistencia();
	}
	

	public void necesitoVacaciones() {
		
		
	}
	public void despedirAFulano() {
		// TODO Auto-generated method stub
		
	}

}
