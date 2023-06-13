package vista;
import controlador.ControladorDulceria;
public interface Vista {
  
    public void iniciar(ControladorDulceria controlador);
    public void insertarDulce();
    public void actualizarDulce();
    public void eliminarDulce();
    public void buscarDulce();
    public void listarDulce();
    public void actualizarNombresListComboboxes();

    //Getters de datos pertenecientes a las vistas
    public String getNombresDulces();
    public String getCategoria();
    public String getNombreDulceAmodificar();
    
}
