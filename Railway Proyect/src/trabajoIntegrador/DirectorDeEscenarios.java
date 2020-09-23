package trabajoIntegrador;

public class DirectorDeEscenarios {

public static RedFerroviaria construirRedSimple(ConstructorDeEscenarioAbstracto constructor)
{

constructor.construirRedFerroviara();
Estacion e1 = constructor.construirEstacion("Brendam");
Estacion e2 = constructor.construirEstacion("Wellsworth");

Via v = constructor.construirVia(29.8, e1, e2);
e1.agregarConexion1(v);
e2.agregarConexion0(v);
return constructor.obtenerRedFerroviaria();

}

public static RedFerroviaria construirRedCuadrada(ConstructorDeEscenarioAbstracto constructor) 
{
	
	
	constructor.construirRedFerroviara();
	Estacion e1 = FabricaDeEstacion.crearEstacion(3);
	e1.asignarNombre("Estacion1");
	Estacion e2 = FabricaDeEstacion.crearEstacion(3);
	e2.asignarNombre("Estacion2");
	Estacion e3 = FabricaDeEstacion.crearEstacion(3);
	e3.asignarNombre("Estacion3");
	Estacion e4 = FabricaDeEstacion.crearEstacion(3);
	e4.asignarNombre("Estacion4");
	
	Via v1 = constructor.construirVia(20, e1, e2);
	Via v2 = constructor.construirVia(20, e2, e3);
	Via v3 = constructor.construirVia(20, e3, e4);
	Via v4 = constructor.construirVia(20, e4, e1);
	e1.agregarConexion1(v1);
	e1.agregarConexion0(v4);
	e2.agregarConexion0(v1);
	e2.agregarConexion1(v2);
	e3.agregarConexion0(v2);
	e3.agregarConexion1(v3);
	e4.agregarConexion0(v3);
	e4.agregarConexion1(v4);
	TrenAbstractFactory fabricaTren = new TrenDeCarga();
	Tren t = new Tren();
	fabricaTren.crearLocomotora();
	t.agregarLocomotora(fabricaTren.crearLocomotora());
	t.agregarVagon(fabricaTren.crearVagon(1));
	e1.asignarTren(t);
	
	
	return constructor.obtenerRedFerroviaria();
	
}

public static RedFerroviaria construirRedCuadradaDoble(ConstructorDeEscenarioAbstracto constructor) 
{
	constructor.construirRedFerroviara();
	Estacion e1 = FabricaDeEstacion.crearEstacion(1);
	e1.asignarNombre("Estacion1");
	Estacion e2 = FabricaDeEstacion.crearEstacion(1);
	e2.asignarNombre("Estacion2");
	Estacion e3 = FabricaDeEstacion.crearEstacion(1);
	e3.asignarNombre("Estacion3");
	Estacion e4 = FabricaDeEstacion.crearEstacion(1);
	e4.asignarNombre("Estacion4");
	
	ViaDoble v1 = constructor.construirViaDoble(20, e1, e2);
	ViaDoble v2 = constructor.construirViaDoble(20, e2, e3);
	ViaDoble v3 = constructor.construirViaDoble(20, e3, e4);
	ViaDoble v4 = constructor.construirViaDoble(20, e4, e1);
	e1.agregarConexion1(v1);
	e1.agregarConexion0(v4);
	e2.agregarConexion0(v1);
	e2.agregarConexion1(v2);
	e3.agregarConexion0(v2);
	e3.agregarConexion1(v3);
	e4.agregarConexion0(v3);
	e4.agregarConexion1(v4);
	return constructor.obtenerRedFerroviaria();
}

}
