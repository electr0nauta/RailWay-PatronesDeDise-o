package trabajoIntegrador;

public class TrenDeCarga implements TrenAbstractFactory {
	
	
	@Override
	public Locomotora crearLocomotora() {
	return new LocomotoraDiesel();
	}
	@Override
	public Vagon crearVagon(int a) {
	return new vagonDeCarga(a);
	}
	@Override
	public Maquinista crearMaquinista(String nom) {
	return new EspecialistaEnDiesel(nom);
	}
	


}
	