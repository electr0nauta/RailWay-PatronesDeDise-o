package trabajoIntegrador;

public interface Observado {
	
	void agregar(Observador o);
	void quitar(Observador o);
	void notificar();

}
