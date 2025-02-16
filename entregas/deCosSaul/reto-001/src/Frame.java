class Frame {
  private Pixel[][] pixeles;

  public Frame(int x, int y) {
    pixeles = new Pixel[x][y];
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        pixeles[i][j] = new Pixel();
        pixeles[i][j].setDato(0);
      }
    }
  }

  public void modificarPixel(Coordenada coordenada, int nuevoValor) {
    pixeles[coordenada.getX()][coordenada.getY()].setDato(nuevoValor);
  }

  public char getPixelTraducido(Coordenada coordenada) {
    char[] caracteres = { '.', '#', '+', '*' };
    int valorPixel = pixeles[coordenada.getX()][coordenada.getY()].obtenerDato();
    return caracteres[valorPixel];
  }
}
