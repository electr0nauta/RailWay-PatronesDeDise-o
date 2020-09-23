package trabajoIntegrador;

import java.util.Scanner;

public class FabricaDeEstacionDeCarga extends FabricaDeEstacion {
	@Override
	public Estacion crearEstacion() {
		Scanner teclado = new Scanner(System.in);
		Estacion estacion = new EstacionProxy();		
		
		System.out.println("Ingrese el nombre del personal de carga");
		String v = teclado.next();
		estacion.agregarPersonal(new PersonalDeCarga(v));
		Anden anden;
		for(int i=0; i<10; i++){
			anden = new AndenDeCarga(i+1);
			estacion.agregarAnden(anden);
		}
		
		return estacion;
	}

	
}