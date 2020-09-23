package trabajoIntegrador;

import java.util.Scanner;

public class FabricaDeEstacionDePasajeros extends FabricaDeEstacion {
	@Override
	public EstacionReal crearEstacion() {
		EstacionReal estacion = new EstacionReal(null);
		Scanner teclado = new Scanner(System.in);
		String v = teclado.nextLine();
		System.out.println("Ingrese el nombre del personal de boleteria");
		estacion.agregarPersonal(new PersonalDeBoleteria(v));
		Anden anden;
		for(int i=0; i<10; i++){
			anden = new AndenDePasajeros(i+1);
			estacion.agregarAnden(anden);
		}
		teclado.close();
		return estacion;
	}	
}