package trabajoIntegrador;

public abstract class LocomotoraImp implements PrototipoClonable{

abstract void encenderMotor();
abstract void apagarMotor();
abstract void recargarCombustible();
abstract void enMarcha();
public abstract LocomotoraImp clonar();




public void reportarEstado(){

this.reportarCombustible();
this.reportarFallas();
this.reportarEstadoDelChasis();
this.reportarSistemaDeFrenos();
this.reportarMotor();
this.reportarComandos();

}
public abstract void reportarCombustible();
public abstract void reportarFallas();
public abstract void reportarEstadoDelChasis();
public abstract void reportarSistemaDeFrenos();
public abstract void reportarMotor();
public abstract void reportarComandos();

}
