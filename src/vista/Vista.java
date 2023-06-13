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
    public void actualizarNombresListComboboxes();

    //Getters de datos pertenecientes a las vistas
    public String getNombresDulces();
    public String getCategoria();
    public String getNombreDulceAmodificar();
    public String getNombreDulceAeliminar();
    
}
