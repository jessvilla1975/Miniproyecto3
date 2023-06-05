package modelo;

public enum CategoriaDulce {
    DULCE("Dulce"),
    ACIDO("Acido"),
    SINAZUCAR("Sin Azucar");

    private final String nombre;

    CategoriaDulce(String nombre) {
        this.nombre = nombre;
    }

    public String getElementoFormateado() {
        return nombre;
    }
}
