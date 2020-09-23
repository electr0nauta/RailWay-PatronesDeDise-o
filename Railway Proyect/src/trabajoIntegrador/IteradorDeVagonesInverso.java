package trabajoIntegrador;

import java.util.ArrayList;

public class IteradorDeVagonesInverso implements Iterador{

ArrayList<Vagon> vagones;
int indice = 0;
public IteradorDeVagonesInverso(Tren tren){
vagones = tren.getVagones();

}
public void primero(){
indice = vagones.size()-1;

}
public void siguiente(){
indice--;

}
public boolean fin(){

return indice >= 0;

}
public Iterable actual(){

return vagones.get(indice);

}

}