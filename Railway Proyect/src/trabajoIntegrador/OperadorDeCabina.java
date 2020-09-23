package trabajoIntegrador;

public class OperadorDeCabina implements Colega{
	MediadorDeEstacion mediador;
	
	public void setMediador(MediadorDeEstacion m) {
		mediador = m;
	}
	
	public void decidirSegunElClima() {}
	public void andenesOcupados() {
		mediador.andenesOcupados();
	}
	public void reporteDelClima() {
		mediador.reporteDelClima();
	}


}
