package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.print.PrintColor;
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

    public void inicializacion(){
        vista.iniciar(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(operacion){
            case INSERTAR:
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
                modelo.listarDulces();
                break;
            case ACTUALIZAR:
            
            break;

            default: break;
    
        }
        
    }
    
}
