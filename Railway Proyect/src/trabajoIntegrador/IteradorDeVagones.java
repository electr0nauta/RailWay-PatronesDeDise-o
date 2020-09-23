package trabajoIntegrador;

import java.util.ArrayList;

public class IteradorDeVagones implements Iterador{

ArrayList<Vagon> vagones;
int indice = 0;
public IteradorDeVagones(Tren tren){
vagones = tren.getVagones();

}
public void primero(){
indice = 0;

}
public void siguiente(){
indice++;

}
public boolean fin(){

return indice >= vagones.size();

}
public Iterable actual(){

return vagones.get(indice);

}

}