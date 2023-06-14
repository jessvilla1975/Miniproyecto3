package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Modelo;
import vista.Vista;
import modelo.CategoriaDulce;

public class ControladorDulceria implements ActionListener {
    Modelo modelo;
    Vista vista;
    Operaciones operacion;
    CategoriaDulce categoriadulce;
    String dulceEncontrado;

    // Me servira para ejecutar el evento perteneciente al combobox de la GUI
    Boolean auxEliminarGui = false;


    public ControladorDulceria(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public Operaciones getOperacion() {
        return operacion;
    }
    public void setOperacion(Operaciones operacion) {
        this.operacion = operacion;
    }

    public Boolean getAuxEliminarGui() {
        return auxEliminarGui;
    }

    public void setAuxEliminarGui(Boolean auxEliminarGui) {
        this.auxEliminarGui = auxEliminarGui;
    }

    // Metodo intermediario que usa un metodo del modelo para enviar un array de nombres a la vista GUI
    public String[] getNombresDulcesControlador(){
        return modelo.getNombresDulces();
    }

    public void inicializacion(){
        vista.iniciar(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(operacion){
            case INSERTAR:
                vista.insertarDulce();
                String nuevoDulce = vista.getNombresDulces();
                String categoria = vista.getCategoria();
                
                if(categoria.toUpperCase().equals(CategoriaDulce.DULCE.toString().toUpperCase())){
                    categoriadulce = CategoriaDulce.DULCE;
                }else if(categoria.toUpperCase().equals(CategoriaDulce.ACIDO.toString().toUpperCase())){
                    categoriadulce = CategoriaDulce.ACIDO;
                }else{
                    categoriadulce = CategoriaDulce.SINAZUCAR; 
                }
                modelo.insertarDulces(nuevoDulce, categoriadulce);
                break;
            case ACTUALIZAR:
                //Ejecuto el metodo de la vista y extraigo sus datos
                vista.actualizarDulce();
                String dulceAmodificar = vista.getNombreDulceAmodificar().toUpperCase(); // en mayusculas para que no exista error al digitar
                String nombreDulceNuevo = vista.getNombresDulces();
                String categoriaNueva = vista.getCategoria();

                // Asigno la categoria correspondiente
                if(categoriaNueva.toUpperCase().equals(CategoriaDulce.DULCE.toString().toUpperCase())){
                    categoriadulce = CategoriaDulce.DULCE;
                }else if(categoriaNueva.toUpperCase().equals(CategoriaDulce.ACIDO.toString().toUpperCase())){
                    categoriadulce = CategoriaDulce.ACIDO;
                }else{
                    categoriadulce = CategoriaDulce.SINAZUCAR; 
                }

                //Ejecuto el metodo para modificar el dulce con la informacion extraida de la vista
                modelo.actualizarDulces(dulceAmodificar, nombreDulceNuevo, categoriadulce);

                getNombresDulcesControlador();
                
                // **Solo para GUI** Actualizo al tiempo los comboboxes y Jlist para que se vean los cambios en el mismo menu de la GUI
                vista.actualizarNombresListComboboxes();
                break;
            case ELIMINAR:
                vista.eliminarDulce();
                String nombreDulceAEliminar = vista.getNombreDulceAeliminar().toUpperCase();
                // voy a ejecuta el combobox y a poner la info en el - funciona principalemnte en la GUI
                vista.setDatos(modelo.buscarDulcesPorNombre(nombreDulceAEliminar), true);
                // si el auxiliar es false significa que se va a eliminar el dulce del ombobox, asi que ejecuto este metodo
                if(!auxEliminarGui){
                    if (nombreDulceAEliminar == null) {
                        System.out.println("No se ha seleccionado ningún dulce para eliminar.");
                    } else {
                        String dulceAEliminar = nombreDulceAEliminar.toUpperCase();
                        modelo.eliminarDulces(dulceAEliminar);
                        }  
                    vista.actualizarNombresListComboboxes();
                }
                break;
            case BUSCAR:
                vista.buscarDulce();
                String buscar = vista.getNombresDulces().toUpperCase();
                vista.setDatos(modelo.buscarDulcesPorNombre(buscar), false);
                break;
            case LISTAR:
                vista.listarDulce(modelo.getDulces());
                break;
            default: 
                break;
        }
        
        
    }
    
}
