package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.Vista;
import modelo.CategoriaDulce;

public class ControladorDulceria implements ActionListener {
    Modelo modelo;
    Vista vista;
    Operaciones operacion;
    CategoriaDulce categoriadulce;


    public Operaciones getOperacion() {
        return operacion;
    }
    public void setOperacion(Operaciones operacion) {
        this.operacion = operacion;
    }
    public ControladorDulceria(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
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
                
                // Listar dulces como metodo de comprobacion
                modelo.listarDulces();
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
                // Listar dulces como metodo de comprobacion
                modelo.listarDulces();
                break;

            default: 
                break;
        }
        
    }
    
}
