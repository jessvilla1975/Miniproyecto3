package modelo;


public class Dulce {
    // Atributos
    private String nombreDulce;
    private CategoriaDulce categoria;

    // Constructores
    public Dulce(String nombreDulce, CategoriaDulce categoria){
        this.nombreDulce = nombreDulce;
        this.categoria = categoria;
    }

    // Setters y Getters
    public String getNombreDulce() {
        return nombreDulce;
    }


    public void setNombreDulce(String nombreDulce) {
        this.nombreDulce = nombreDulce;
    }


    public CategoriaDulce getCategoriaDulce() {
        return categoria;
    }


    public void setCategoriaDulce(CategoriaDulce categoria) {
        this.categoria = categoria;
    }

    public void mostrarInformacion(){
        System.out.printf("----------\n" +
                            "Nombre del dulce: %s\n" +
                            "Categoria del dulce: %s\n" ,nombreDulce, categoria);
    }

}
