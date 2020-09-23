package trabajoIntegrador;

import java.util.ArrayList;

public class SupervisorDeEstacion implements Colega{
	MediadorDeEstacion mediador;
	
	public void setMediador(MediadorDeEstacion m) {
		mediador = m;
	}

public void llegaUnTren(TrenFacade trenF){

// Mensaje al tren
trenF.horaDeArribo("hora");
// Mensaje al maquinista
trenF.todoEnOrden();
// Mensaje a la locomotora
trenF.reportarEstadoParaProximoTramo();
ArrayList<Vagon> vagones = trenF.getVagones();
for(Vagon v: vagones){
v.reportarEstado();

}


}
public void llegaUnTren(Tren tren){

	// Mensaje al tren
	tren.horaDeArribo("hora");
	// Mensaje al maquinista
	tren.getLocomotora().getMaquinista().todoEnOrden();
	// Mensaje a la locomotora
	tren.getLocomotora().reportarEstadoParaProximoTramo();
	IteradorDeVagones iterador = (IteradorDeVagones) tren.crearIterador();
	while(! iterador.fin()){

	Vagon v = (Vagon) iterador.actual();
	v.reportarEstado();
	iterador.siguiente();

	}


	}

Manejador manejadorDeProblemas;

boolean verificarPartida(){


boolean respuesta = manejadorDeProblemas.cargarCombustible();

return respuesta;

}
public void setManejador(Manejador m) {
	manejadorDeProblemas = m ;
}
public void necesitoUnAyudante() {
	// TODO Auto-generated method stub
	
}
public void reporteDeAsistencia() {
	// TODO Auto-generated method stub
	
}
public void meQuedeSinRepuestos() {
	// TODO Auto-generated method stub
	
}
public void reporteDelClima() {
	// TODO Auto-generated method stub
	
}
public void trenEnEspera() {
	// TODO Auto-generated method stub
	
}
public void todoEnOrden() {
	// TODO Auto-generated method stub
	
}
public void cargaLista() {
	// TODO Auto-generated method stub
	
}
public void despedirAFulano() {
	
	mediador.despedirAFulano();
}
public void disturbiosEnElAnden() {
	
	mediador.disturbiosEnElAnden();
}
public void cerraLosAccesos() {
	
	mediador.cerraLosAccesos();
	
}
public void revisarTren() {
	
	mediador.revisarTren();
	
}

}