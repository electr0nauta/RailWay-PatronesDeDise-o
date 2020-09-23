package trabajoIntegrador;

import java.util.ArrayList;

public class ControladorDeSemaforos implements Colega{
PoliticaDeAcceso politica;
ArrayList<Tren>[] colasDeTrenes = new ArrayList[5];
MediadorDeEstacion mediador;

public void setMediador(MediadorDeEstacion m) {
	mediador = m;
}
public void Locomotora(){

politica = new UnoDeCada();

}
public Tren siguienteTren(){

int cola = politica.siguienteTren(colasDeTrenes);
Tren tren = colasDeTrenes[cola].get(0);
colasDeTrenes[cola].remove(0);
return tren;

}
public void cambiarPolitica(PoliticaDeAcceso pa){

politica = pa;

}
public void arregladoElDetector() {
	// TODO Auto-generated method stub
	
}
public void andenesOcupados() {
	// TODO Auto-generated method stub
	
}
public void detectorConFallas() {
	
	mediador.detectorConFallas();
}
public void trenEnEspera() {
	
	mediador.trenEnEspera();
}
public void cerraLosAccesos() {
	// TODO Auto-generated method stub
	
}


}
