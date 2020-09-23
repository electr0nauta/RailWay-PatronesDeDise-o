package trabajoIntegrador;

public class StationAdapter implements Station {
	Conexion conexion0, conexion1;
	
	public void agregarConexion0(Conexion v) 
	{
		conexion0 = v;
		
	}
	public void agregarConexion1(Conexion v) 
	{
		conexion1 = v;
		
	}
	@Override
	public void addConnection0(RailroadTrack track) {
		conexion0 = track;
		
	}

	@Override
	public void addConnection1(RailroadTrack track) {
		conexion1 = track;
		
	}

}
