class Pantalla {
  private Frame[] pantalla = new Frame[2];

  public Pantalla() {
    pantalla[0] = new Frame(7, 3);
    pantalla[1] = new Frame(7, 3);

  }

  public void mostrarFrame() {
    for (int y = 0; y < 3; y++) {
      for (int frame = 0; frame < pantalla.length; frame++) {
        for (int x = 0; x < 7; x++) {
          Coordenada coordenada = new Coordenada(x, y, frame);
          System.out.print(pantalla[coordenada.getFrame()].getPixelTraducido(coordenada));
        }
        System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public void modificarPixel(Coordenada coordenada, int nuevoValor) {
    pantalla[coordenada.getFrame()].modificarPixel(coordenada, nuevoValor);
  }
}
