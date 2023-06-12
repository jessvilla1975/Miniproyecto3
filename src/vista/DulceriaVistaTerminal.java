package vista;
import controlador.Operaciones;
import controlador.ControladorDulceria;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler;
public class DulceriaVistaTerminal implements Vista{
    ControladorDulceria controlador;
    String nombreDulceAmodificar, nombreDulce, categoria = "Dulce";
    Scanner scanner = new Scanner(System.in);

     // -----------Metodos para la consola------------------------------------------------
     public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void esperarEnter() {
        System.out.print("\nPresiona enter para continuar... ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        // scanner.close();
    }

    //Metodo para limpiar las variables pertencientes a los datos despues de cada uso, se en el menu
    public void limpiarDatos(){
        nombreDulce = nombreDulceAmodificar = "";
        categoria = "Dulce";
    }

    public void iniciar(ControladorDulceria controlador) {
        boolean continuar = true;
        this.controlador = controlador;
        limpiarConsola();
        while(continuar){
            limpiarDatos();
            // limpiarConsola();
            System.out.println("--------Menu Dulceria--------");
            System.out.println("1.Insertar Dulce");
            System.out.println("2.Actualizar Dulce");
            System.out.println("3.Eliminar Dulce");
            System.out.println("4.Buscar Dulce");
            System.out.println("5.Listar Dulces");
            System.out.println("6.Salir");
            System.out.print("Ingrese una opcion: ");
            Scanner scanner = new Scanner(System.in);
            Byte opcion = scanner.nextByte();
            switch(opcion){
                case 1:
                    controlador.setOperacion(Operaciones.INSERTAR);
                    break;
                case 2:
                    controlador.setOperacion(Operaciones.ACTUALIZAR);
                    break;
                case 6:
                    // limpiarConsola();
                    System.out.println("Gracias por usar la aplicacion");
                    continuar = false;
                    scanner.nextLine();
                    // esperarEnter();
                    break;
            }
            // Condicional para que si salgo de la app no se ejecute el actionPerformed ya que genera error
            if (continuar) {
                controlador.actionPerformed(null);         
            }
        }
    }

    @Override
    public void insertarDulce() {
        limpiarConsola();
        String[] opciones = {"Dulce", "Acido", "Sin azucar"};
        System.out.println("---- Menu Insertar Dulce ----");
        System.out.print("Ingrese el nombre del dulce: ");
        nombreDulce = scanner.nextLine();
        System.out.println("--Ingrese categoria del dulce--");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + ". " + opciones[i]);
        }
        System.out.print("Seleccione una opcion de categoria: ");
        categoria= scanner.nextLine();
        switch (categoria) {
            case "1":
                categoria = opciones[0];
                break;
            case "2":
            categoria = opciones[1];
                break;
            case "3":
            categoria = opciones[2];
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
        limpiarConsola();
        System.out.println("Dulce agregado con exito!");
        esperarEnter();
    }

    @Override
    public void actualizarDulce() {
        String[] opciones = {"Dulce", "Acido", "Sin azucar"};
        System.out.println("---- Menu Actualizar Dulce -----");
        System.out.print("Ingrese el nombre del dulce que Desea modificar: ");
        nombreDulceAmodificar = scanner.nextLine();
        System.out.print("Ingrese el nuevo nombre del dulce: ");
        nombreDulce = scanner.nextLine();
        System.out.println("--Ingrese la nueva categoria del dulce--");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + ". " + opciones[i]);
        }
        System.out.print("Seleccione una opcion de categoria: ");
        categoria= scanner.nextLine();
        switch (categoria) {
            case "1":
                categoria = opciones[0];
                break;
            case "2":
            categoria = opciones[1];
                break;
            case "3":
            categoria = opciones[2];
                break;
            default:
                System.out.println("Número inválido");
                break;
            }
        limpiarConsola();
        System.out.println("Dulce Modificado con exito!");
        esperarEnter();
    }

    @Override
    public void eliminarDulce() {

    }

    @Override
    public void buscarDulce() {
        
    }

    @Override
    public void listarDulce() {
        
    }

    @Override
    public String getNombresDulces() {
        return nombreDulce;
    }
    
    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public String getNombreDulceAmodificar() {
       return nombreDulceAmodificar;
    }
    
 

    
    
}
