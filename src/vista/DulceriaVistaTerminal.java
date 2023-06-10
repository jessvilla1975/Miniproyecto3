package vista;
import controlador.Operaciones;
import controlador.ControladorDulceria;
import java.util.Scanner;
public class DulceriaVistaTerminal implements Vista{
    ControladorDulceria controlador;
    String nombreDulce, categoria;
    Scanner scanner = new Scanner(System.in);
    public void iniciar(ControladorDulceria controlador) {
        boolean continuar = true;
        this.controlador = controlador;
        while(continuar){
            System.out.println("--------Menu Dulceria--------");
            System.out.println("1.Insertar Dulce");
            System.out.println("2.Actualizar Dulce");
            System.out.println("3.Eliminar Dulce");
            System.out.println("4.Buscar Dulce");
            System.out.println("5.Listar Dulces");
            System.out.println("6.Salir");
            System.out.print("Ingrese una opcion: ");
            Scanner scanner = new Scanner(System.in);
            String opcion = scanner.nextLine();
            switch(opcion){
                case "1":
                    insertarDulce();
                    controlador.setOperacion(Operaciones.INSERTAR);
                    break;
                case "2":
                //controlador.setOperacion(Operaciones.RESTA);
                    break;
                case "6":
                    continuar = false;
                    continue;
            }     
            controlador.actionPerformed(null);     
        }
    }

    @Override
    public void insertarDulce() {
        String[] opciones = {"Dulce", "Acido", "Sin azucar"};
        System.out.println("Ingrese el nombre del dulce: ");
        nombreDulce = scanner.nextLine();
        System.out.println("Ingrese categoria del dulce: ");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + ". " + opciones[i]);
        }
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
    }
    


    @Override
    public void actualizarDulce() {

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
 

    
    
}
