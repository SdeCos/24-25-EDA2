class Coordenada {
  private int x;
  private int y;
  private int frame;

  public Coordenada(int x, int y, int frame) {
    this.x = x;
    this.y = y;
    this.frame = frame;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getFrame() {
    return frame;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setFrame(int frame) {
    this.frame = frame;
  }
}
