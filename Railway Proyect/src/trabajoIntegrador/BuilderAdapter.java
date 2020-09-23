package trabajoIntegrador;

public class BuilderAdapter implements Builder {
ConstructorDeEscenarioAbstracto constructor;

public BuilderAdapter(ConstructorDeEscenarioAbstracto c){

constructor = c;

}
public void buildRailroadNetwork(){

constructor.construirRedFerroviara();

}
public Estacion buildStation(String name){

return  constructor.construirEstacion(name);

}
public Via buildRailroadTrack(double distance, Estacion s1, Estacion s2){

return constructor.construirVia(distance, s1, s2);

}
public RedFerroviaria getRailroadNetwork(){
return  constructor.obtenerRedFerroviaria();

}
}