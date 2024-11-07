package modelo;

import interfaces.Volable;

// Implements significa que podemos implementar la interfaz Volable
// Si implementamos una interfaz, debemos usar TODOS sus metodos
// Es una forma de polimorfismo, un pilar de la programación orientada a objetos
// Esto significa que conseguimos que un mismo metodo se comporte de diferentes maneras dependiendo el contexto
// Esto da orden, claridad, y nos hace escribir menos codigo

public class Avion implements Volable {

  @Override
  public void elevarse() {
    System.out.println("El avion se eleva!");
  }

  @Override
  public void aterrizar() {
    System.out.println("El avion aterriza...");
  }

}
