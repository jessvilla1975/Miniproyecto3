package vista;
import java.util.ArrayList;

import controlador.ControladorDulceria;
import modelo.Dulce;
public interface Vista {
  
    public void iniciar(ControladorDulceria controlador);
    public void insertarDulce();
    public void actualizarDulce();
    public void eliminarDulce();
    public void buscarDulce();
    public void listarDulce(ArrayList<Dulce> dulces);
    public void actualizarNombresListComboboxes(); // Este metodo solo en al GUI, en la terminal no se implementa

    //Getters de datos pertenecientes a las vistas
    public String getNombresDulces();
    public String getCategoria();
    public String getNombreDulceAmodificar();
    public String getNombreDulceAeliminar();
    public void setDatos(String resultado, Boolean menuEliminar); // el resultado es la informacion, el booelan indica si
    // se estara usando para el menuEliminar o en caso contrario se usa para el menu buscar
    
}
