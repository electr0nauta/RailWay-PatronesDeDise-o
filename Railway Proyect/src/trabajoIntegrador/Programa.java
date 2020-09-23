package trabajoIntegrador;

import java.util.Scanner;
//alt+60 = <
//alt+62 = >
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		crearEscenarioCuadrado();
		
		

	}
	public static void trenesEnMovimiento()
	{
		Estacion e = new EstacionReal("berazategui");
		int accion = 0;
		
		while(accion != 3)
		{
			Scanner teclado1 = new Scanner(System.in);
			teclado1.reset();

			System.out.println("Ingrese la accion a realizar");
			System.out.println("1- Llega un Tren");
			System.out.println("2- Sale un Tren");
			System.out.println("3- Finalizar simulacion");
			
			accion = teclado1.nextInt();
			
			switch(accion)
			{
			case 1:
				System.out.println("Ingrese el anden del que quiere que llegue el tren");
				int a = teclado1.nextInt();
				teclado1.close();
				e.llegaUnTren(crearTren());
				
				break;
			case 2:
				System.out.println("Ingrese el anden del que quiere que salga el tren");
				a = teclado1.nextInt();
				e.saleUnTren(a);
				teclado1.close();
				break;
			
			}
			

		}
		
		

	}
	public static Tren crearTren()
	{
		Scanner teclado = new Scanner(System.in);

		TrenAbstractFactory fabrica = null;

		System.out.println("Ingrese la opcion:");
		System.out.println("1- Tren de pasajeros");
		System.out.println("2- Tren de carga");
		System.out.println("3- Tren historico ");
		int opcion = teclado.nextInt();
		switch (opcion)
		{
		case 1: fabrica = new TrenDePasajeros();break;
		case 2: fabrica = new TrenDeCarga();break;
		case 3: fabrica = new TrenHistorico(); break;
		}		


		
		System.out.println("Ingrese el nombre del maquinista");
		String nomMaquinista = teclado.next();
		
		
		
		
		

		Tren tren = new Tren();
		Maquinista maquinista = fabrica.crearMaquinista(nomMaquinista);
		Locomotora locomotora = fabrica.crearLocomotora();		
		locomotora.setMaquinista(maquinista);
		tren.agregarLocomotora(locomotora);
		
		System.out.println("Ingrese la cantidad de vagones");
		int cantVagones = teclado.nextInt();
		
		for(int i=0; i<cantVagones; i++)
		{
			int v;
			v = i+1;//Integer.toString(i+1)
			Vagon vagon = fabrica.crearVagon(v);
			tren.agregarVagon(vagon);


		}
		tren.realizarRecorrido();
		teclado.close();

		return tren;

	}
	
	public static void crearEscenarioCuadrado() 

	{
		ConstructorDeEscenarioAbstracto crf = new ConstructorDeEscenarioDeCarga();

		RedFerroviaria rf = DirectorDeEscenarios.construirRedCuadrada(crf);
		
		
				
		
	}
	
	public static void crearEscenarioCuadradoDoble() 

	{
		ConstructorDeEscenarioAbstracto crf = new ConstructorDeEscenarioSencillo();

		RedFerroviaria rf = DirectorDeEscenarios.construirRedCuadradaDoble(crf);
		
				
		
	}
	
	public static void recorridoComposite()
	{
		Via v1 = new Via(20);
		Puente p1 = new Puente(30);
		Tunel t1 = new Tunel(12);
		TramoDeVia tv1 = new TramoDeVia();
		tv1.agregarHijo(v1);
		tv1.agregarHijo(p1);
		tv1.agregarHijo(t1);

		Via v2 = new Via(48);

		Via v31 = new Via(20);
		Via v32 = new Via(12);
		Puente p3 = new Puente(30);
		Tunel t3 = new Tunel(12);
		TramoDeVia tv3 = new TramoDeVia();
		tv3.agregarHijo(v31);
		tv3.agregarHijo(v32);
		tv3.agregarHijo(p3);
		tv3.agregarHijo(t3);
		
		EstacionReal estacion1 = new EstacionReal("La Plata"), estacion2 = new EstacionReal("Berazategui");
		
		TramoDeVia tv = new TramoDeVia(estacion1, estacion2);
		tv.agregarHijo(tv1);
		tv.agregarHijo(v2);
		tv.agregarHijo(tv3);
		Tren t = new Tren();
		tv.ida(t);
		tv.vuelta(t);
		
	}

	public static void viajesDelTren() 
	{
		
	}

}

