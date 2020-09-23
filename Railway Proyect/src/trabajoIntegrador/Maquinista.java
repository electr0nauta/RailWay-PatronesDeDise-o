package trabajoIntegrador;

import java.util.Scanner;

public abstract class Maquinista implements PrototipoClonable
{
	private String nombre;
	private boolean estado = true;
	private boolean fallas = false;
	public void estoyListo()
	{
		System.out.println(nombre + " listo para conducir el tren");
	}
	
	public Maquinista(String Nombre)
	{
		nombre = Nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public abstract Maquinista clonar();

	public void todoEnOrden() {
		if(estado) 
		{
			System.out.println("Todo en orden");
		}
		else
			System.out.println("Todo mal");
		
	}

	public void existenFallas() {
		if(!fallas) 
		{
			estado = true;
			System.out.println("No hay fallas");
		}
		else
			estado = false;
		System.out.println("Hay fallas detectadas");
			
		
	}
	
	public void manejar() 
	{
		Scanner teclado = new Scanner(System.in);
		int accion = teclado.nextInt();
		
		while(accion != 7) {
			System.out.println("Ingrese la opcion deseada");
			System.out.println("1-Encender");
			System.out.println("2-Apagar");
			System.out.println("3-Acelerar");
			System.out.println("4-Desacelerar");
			System.out.println("5-Frenar");
			System.out.println("6-Arreglar Motor");
			System.out.println("7-Salir");
			
			switch(accion) 
		{
		case 1:
			
		case 2:
			
		case 3:
			
		case 4:
			
		case 5:
			
		case 6:
			
		case 7:
			accion = 7;
			
		default:
			System.out.println("Ha ingresado un valor incorrecto");
		
		}
	}
	}
}
