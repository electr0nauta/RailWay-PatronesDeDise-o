package trabajoIntegrador;

/**
 *
 * @author Waldo
 */
public interface Station {
    // El alumno puede renombrar la interface RailroadTrack para simplificar el código
    
    // También puede usar su propira interface/clase de estación, a la cual deberá agregar dos métodos 
    // para setear por separado las dos conexiones que puede tener una estación
    
    void addConnection0(RailroadTrack track);
    void addConnection1(RailroadTrack track);
}
