package trabajoIntegrador;

import java.util.ArrayList;

public class TrenFacade {
Tren tren;
Locomotora locomotora;
Motor motor;
Maquinista maquinista;
ArrayList<Vagon> vagones;



public TrenFacade(Tren t){

tren = t;
locomotora = tren.getLocomotora();
motor = locomotora.getMotor();
maquinista = locomotora.getMaquinista();
vagones = tren.getVagones();

}

public void horaDeArribo(String hora){
tren.horaDeArribo(hora);

}
public void todoEnOrden (){

maquinista.todoEnOrden();

}
public void reportarEstadoParaProximoTramo (){

locomotora.reportarEstadoParaProximoTramo ();

}
public void reportarEstadoVagones() 
{
	for(int i=0; i<vagones.size(); i++) 
	{
		vagones.get(i).reportarEstado();
	}
}
public void reportarProblemas() 
{
	for(int i=0; i<vagones.size(); i++) 
	{
		vagones.get(i).reportarProblemas();
	}
}

public void existenFallas() {
	maquinista.existenFallas();
	
}

public void revisarFrenos() {
	
	for(int i=0; i<vagones.size(); i++) 
	{
		vagones.get(i).revisarFrenos();
	}
}

public void recargarCombustible() {
	locomotora.recargarCombustible();
	
}

public void hacerRevision() {
	motor.hacerRevision();
	
}

public ArrayList<Vagon> getVagones() {
	// TODO Auto-generated method stub
	return vagones;
}


}