package ar.edu.utn.frba.dds.qmp4;

import java.util.List;

/* Req 1. Poder manejar varios guardarropas.
Se propone GestordeGuardarropas, el cual puede recibir una lista de guardarropas

 */
public class GestorGuardarropas {
  List<Guardarropas> listadoGuardarropas;
  List<propuestaAgregarPrenda> listPropuestasAgregarPrenda;
  List<propuestaQuitarPrenda> listPropuestasQuitarPrenda;
  
  String criterio;

  public void agregarGuardarropa(Guardarropas guardarropas){
      listadoGuardarropas.add(guardarropas);
  }

  public void agregarPropuestaAgregarPrenda(propuestaAgregarPrenda propuestaAgregarPrenda){
    this.listPropuestasAgregarPrenda.add(propuestaAgregarPrenda);
  }

  public void agregarPropuestaQuitarPrenda(propuestaQuitarPrenda propuestaQuitarPrenda){
    this.listPropuestasQuitarPrenda.add(propuestaQuitarPrenda);
  }
}

/* Guardarropa compartido-> Crear un guardarropa que tenga un listado de usuarios?
Pero hasta acá nunca hablamos de usuarios.


 */


