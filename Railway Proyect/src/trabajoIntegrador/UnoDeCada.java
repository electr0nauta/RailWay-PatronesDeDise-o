package trabajoIntegrador;

import java.util.ArrayList;

public class UnoDeCada implements PoliticaDeAcceso {
	
	int siguiente = 0;
	
	@Override
	public int siguienteTren(ArrayList[] colas) {
		siguiente++;
		if(siguiente == colas.length)
			siguiente = 0;
		return siguiente;
	}

}
