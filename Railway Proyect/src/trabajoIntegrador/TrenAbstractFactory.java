package trabajoIntegrador;

public interface TrenAbstractFactory 
{
	Locomotora crearLocomotora();
	Vagon crearVagon(int a);
	Maquinista crearMaquinista(String nom);

}
