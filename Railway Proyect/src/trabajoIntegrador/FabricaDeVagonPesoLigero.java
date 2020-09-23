package trabajoIntegrador;

public class FabricaDeVagonPesoLigero {
Vagon[] vagones = new Vagon[10];

public Vagon crearVagon(int modelo){
	if(vagones[modelo] == null)

		vagones[modelo] = this.crearVagon(modelo);

	return vagones[modelo];

}

}