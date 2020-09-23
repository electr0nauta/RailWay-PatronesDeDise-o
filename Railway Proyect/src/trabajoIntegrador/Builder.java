package trabajoIntegrador;

/**
 *
 * @author Waldo
 */
public interface Builder {
    
    // El alumno puede renombrar las interfaces Station, RailroadTrack y RailroadNEtwork para simplificar el código
    
    void buildRailroadNetwork();
    Estacion buildStation(String name);
    Via buildRailroadTrack(double distance, Estacion c1, Estacion c2);
    RedFerroviaria getRailroadNetwork();
	
}
