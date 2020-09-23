package trabajoIntegrador;

public class ConstructorDeEscenarioSencillo extends
ConstructorDeEscenarioAbstracto {

@Override
public Estacion construirEstacion(String nombre) {
	Estacion e = new EstacionReal(nombre);
rf.agregarEstacion(e);
return e;

}

@Override
public Via construirVia(double l, Estacion e1, Estacion e2) {

return new Via(l, e1, e2);

}
@Override
public ViaDoble construirViaDoble(double l, Estacion e1, Estacion e2) {

return new ViaDoble(l, e1, e2);

}

@Override
public Puente construirPuente(double l, Estacion e1, Estacion e2) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Tunel construirTunel(double l, Estacion e1, Estacion e2) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public TramoDeVia construirTramoDeVia(Estacion e1, Estacion e2) {
	// TODO Auto-generated method stub
	return null;
}

}
