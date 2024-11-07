package modelo;

import interfaces.Volable;

public class Parapente implements Volable {

  @Override
  public void elevarse() {
    System.out.println("El parapente se eleva!");
  }

  @Override
  public void aterrizar() {
    System.out.println("El parapente aterriza...");
  }

}
