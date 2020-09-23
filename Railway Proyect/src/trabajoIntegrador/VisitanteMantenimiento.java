package trabajoIntegrador;

public class VisitanteMantenimiento implements Visitante {

public void visitarVagonDeCarga(vagonDeCarga vagon){

vagon.desatascarTolva();
vagon.repararCompuertas();

}
public void visitarVagonDePasajeros(vagonDePasajeros vagon){

vagon.destrabarPuertas();
vagon.atornillarAsientos();

}
public void visitarVagonDePasajerosAntiguo(vagonDePasajerosAntiguo vagon){}


}



