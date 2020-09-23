package trabajoIntegrador;

public class MementoAnden {

	EstadoAnden estado;

	void obtenerEstado(Anden a) {
	estado = a.getEstado();

	}
	void establecerEstado(Anden a) {
	a.setEstado(estado);

	}

}
