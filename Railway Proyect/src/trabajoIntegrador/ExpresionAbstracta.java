package trabajoIntegrador;

import java.util.ArrayList;

public abstract class ExpresionAbstracta {
private ExpresionAbstracta siguiente;
public abstract void ejecutar(ContextoLocomotora c);


public static ExpresionAbstracta interpretar(ArrayList<String> progr, int indice){

ExpresionAbstracta expresion;
expresion = FabricaDeExpresiones.crear(prog.get(indice));
if(indice < prog.size - 1){

ExpresionAbstracta proxExpresion;
proxExpresion = ExpresionAbstracta.interpretar(prog, indice+1);
expresion.setSiguiente(proxExpresion);

}
return expresion;

}
private void setSiguiente(ExpresionAbstracta proxExpresion) {
	// TODO Auto-generated method stub
	
}
}
