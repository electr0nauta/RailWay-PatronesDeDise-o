package trabajoIntegrador;

public interface Estacion {
void idaDelTren();
void vueltaDelTren();
void llegaUnTren(Tren t);
void ida(Tren t);
void vuelta(Tren t);
void agregarConexion0(Conexion c);
void agregarConexion1(Conexion c);
void agregarPersonal(Personal p);
void agregarAnden(Anden a);
void asignarNombre(String string);
void asignarTren(TrenClonable t);
void saleUnTren(int num);
}
