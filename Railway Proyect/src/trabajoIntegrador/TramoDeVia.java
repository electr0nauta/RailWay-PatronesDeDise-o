package trabajoIntegrador;

import java.util.ArrayList;

public class TramoDeVia implements Conexion {
ArrayList<Conexion> hijos = new ArrayList<Conexion>();
Estacion conexion1, conexion0;


public TramoDeVia(Estacion e1, Estacion e2) 
{
	conexion0 = e1;
	conexion1 = e2;
}


public TramoDeVia() {}


public void agregarHijo(Conexion c){

hijos.add(c);


}



@Override
public void ida(Tren t) {
	for(int i = 0; i < hijos.size(); i++)

		hijos.get(i).ida(t);
}



@Override
public void vuelta(Tren t) {
	for(int i = hijos.size() - 1; i >= 0 ; i--)

		hijos.get(i).vuelta(t);
}



}
