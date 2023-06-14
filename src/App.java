

import modelo.Modelo;
import vista.DulceriaVistaTerminal;
import vista.DulceriaVistaGUI;

import javax.swing.JOptionPane;

import controlador.ControladorDulceria;

public class App {
    public static void main(String[] args) {
        String[] opciones = { "Terminal", "GUI" };
        
        DulceriaVistaTerminal vista = new DulceriaVistaTerminal();
        DulceriaVistaGUI vista2 = new DulceriaVistaGUI();
        Modelo modelo  = new Modelo();
        
        // Muestra un panel de opciones en el cual se puede decidir que vista se usará (GUI o Consola)
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué tipo de vista desea ver?", "Seleccione una opción",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
                if (opcion == 0) {
                    ControladorDulceria controlador = new ControladorDulceria(modelo, vista);
                    controlador.inicializacion();
                } else if (opcion == 1) {
                    ControladorDulceria controlador = new ControladorDulceria(modelo, vista2);
                    controlador.inicializacion();
                } else {
                    // Cerró el cuadro de diálogo o seleccionó una opción inválida
                    System.out.println("No se seleccionó ninguna opción válida");
                }    
            }
}
