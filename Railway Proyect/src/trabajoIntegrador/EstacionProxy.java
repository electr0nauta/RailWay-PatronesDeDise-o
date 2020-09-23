package trabajoIntegrador;

import java.util.ArrayList;

public class EstacionProxy implements Estacion {
private EstacionReal estacionReal = null;
private Conexion conexion0;
private Conexion conexion1;
private ArrayList<Personal> personal = new ArrayList<Personal>();
private ArrayList<Anden> andenes = new ArrayList<Anden>();


public void agregarPersonal(Personal p){
	if(estacionReal == null)
		personal.add(p);
	else
		estacionReal.agregarPersonal(p);

}
public void agregarAnden(Anden a){
	if(estacionReal == null)
		andenes.add(a);
	else
		estacionReal.agregarAnden(a);
	}
@Override
public void idaDelTren() {
	if(estacionReal == null)
		System.out.println("La estacion real aun no ha sido creada");
	else
		estacionReal.idaDelTren();
	
}
@Override
public void vueltaDelTren() {
	if(estacionReal == null)
		System.out.println("La estacion real aun no ha sido creada");
	else
		estacionReal.vueltaDelTren();
}
@Override
public void llegaUnTren(Tren t){
	if(estacionReal == null)
	{

	estacionReal = new EstacionReal("");
	for(Anden a : andenes)
		estacionReal.agregarAnden(a);
// agregar conexiones y personal
	for(Personal p: personal)
		estacionReal.agregarPersonal(p);
	estacionReal.agregarConexion0(conexion0);
	estacionReal.agregarConexion1(conexion1);

	}

	estacionReal.llegaUnTren(t);

}
@Override
public void agregarConexion0(Conexion c) {
	if(estacionReal == null)
		conexion0=c;
	else
		estacionReal.agregarConexion0(c);
	
}
@Override
public void agregarConexion1(Conexion c) {
	if(estacionReal == null)
		conexion1=c;
	else
		estacionReal.agregarConexion1(c);
}
@Override
public void asignarNombre(String string) {
	if(estacionReal == null)
		System.out.println("La estacion real aun no ha sido creada");
	else
		estacionReal.asignarNombre(string);
	
}
@Override
public void asignarTren(TrenClonable t) {
	if(estacionReal == null)
		System.out.println("La estacion real aun no ha sido creada");
	else
		estacionReal.asignarTren(t);
	
}
@Override
public void ida(Tren t) {
	if(estacionReal == null)
		System.out.println("La estacion real aun no ha sido creada");
	else
		estacionReal.ida(t);	
}
@Override
public void vuelta(Tren t) {
	if(estacionReal == null)
		System.out.println("La estacion real aun no ha sido creada");
	else
		estacionReal.vuelta(t);	
}
@Override
public void saleUnTren(int num) {
	if(estacionReal == null)
		System.out.println("La estacion real aun no ha sido creada");
	else
		estacionReal.saleUnTren(num);	
}


}
