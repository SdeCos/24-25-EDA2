class Main {
  public static void main(String[] args) {
    Pantalla pantalla = new Pantalla();

    pantalla.modificarPixel(new Coordenada(2, 2, 0), 3);
    pantalla.modificarPixel(new Coordenada(4, 2, 1), 1);

    pantalla.mostrarFrame();
  }
}
