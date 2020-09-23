package trabajoIntegrador;

import java.util.Scanner;

public class FabricaDeEstacionHistorica extends FabricaDeEstacion {
	@Override
	public EstacionReal crearEstacion() {
		EstacionReal estacion = new EstacionReal(null);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre del personal de museo");
		String v = teclado.nextLine();
		
		estacion.agregarPersonal(new PersonalDeMuseo(v));
		Anden anden;
		for(int i=0; i<10; i++){
			anden = new AndenHistorico(i+1);
			estacion.agregarAnden(anden);
		}
		teclado.close();
		return estacion;
	}	
}