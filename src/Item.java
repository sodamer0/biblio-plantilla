public abstract class Item {

  private String titulo;
  private int anho;
  private Genero genero; //Para un conjunto de valores determinados se
                          // crea una clase para ese atributo y que sea de tipo "enum"

  public Item() {

  }
  public Item(String titulo, int anho, Genero genero) {
    this.titulo = titulo;
    this.anho = anho;
    this.genero = genero;
  }


  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;


  }

  public int getAnho() {
    return anho;
  }

  public void setAnho(int anho) {
    this.anho = anho;
  }

  public void setGenero(Genero genero) {
    this.genero = genero;
  }


  public abstract String info();

  }
