package trabajoIntegrador;

public class RailroadTrackAdapter {
	double longitud;
	Station conexionUno, conexionCero;
	
	public RailroadTrackAdapter (double l, Station e1, Station e2) {
		conexionUno = e1;
		conexionCero = e2;
		longitud = l;
		
	}

}
