package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Modelo {
    // Array de los dulces
    private ArrayList<Dulce> dulces = new ArrayList<Dulce>();
    
    // Constructor de dulces por defecto
    public Modelo(){
        Dulce dulce1 = new Dulce("Chocobreak", CategoriaDulce.DULCE);
        dulces.add(dulce1);

        Dulce dulce2 = new Dulce("Revolcon", CategoriaDulce.ACIDO);
        dulces.add(dulce2);

        Dulce dulce3 = new Dulce("Tosh", CategoriaDulce.SINAZUCAR);
        dulces.add(dulce3);

        Dulce dulce4 = new Dulce("Frunas", CategoriaDulce.DULCE);
        dulces.add(dulce4);

        Dulce dulce5 = new Dulce("BomBomBum", CategoriaDulce.DULCE);
        dulces.add(dulce5);

        Dulce dulce6 = new Dulce("Splot", CategoriaDulce.ACIDO);
        dulces.add(dulce6);

        Dulce dulce7 = new Dulce("Pirulito", CategoriaDulce.ACIDO);
        dulces.add(dulce7);
    }

    // Metodo que permite agregar dulces
    public void insertarDulces(String nombreDulce, CategoriaDulce categoria){
        Dulce dulce = new Dulce(nombreDulce, categoria);
        dulces.add(dulce);
    }

    // Metodo que permite actualizar dulces
    public void actualizarDulces(int indice, String nombreDulce, CategoriaDulce categoria){
        Dulce dulce = dulces.get(indice);
        dulce.setNombreDulce(nombreDulce);
        dulce.setCategoriaDulce(categoria);   
    }

    //Metodo que permite eliminar dulces
    public Dulce eliminarDulces(String nombreDulce) {
        for (int i = 0; i < dulces.size(); i++) {
            Dulce dulce = dulces.get(i);
            if (dulce.getNombreDulce().equals(nombreDulce)) {
                dulces.remove(i);
                return dulce; // Retorna el dulce eliminado si es necesario
            }
        }
        return null; // Retorna null si no se encuentra el dulce en la lista
    }

    //  Metodo que permite mostrar la informacion de un dulce en especifico
    public String mostrarInformacionDulce(String nombreDulce) {
        for (Dulce dulce : dulces) {
            if (dulce.getNombreDulce().equals(nombreDulce)) {
                String informacion = String.format("Nombre: %s\n" +
                                                   "Categoría: %s\n",
                                                   dulce.getNombreDulce(),
                                                   dulce.getCategoriaDulce().getElementoFormateado());
                return informacion;
            }
        }
        // Si no se encuentra el dulce, se puede devolver un mensaje de error o una cadena vacía
        return "No se encontró información para el dulce seleccionado.";
    }

    //Metodo que permite buscar dulces por nombre
    public String buscarDulcesPorNombre(String nombreDulce){
        String datos = ""; // Variable para almacenar los datos del dulce encontrado
        boolean existeDulce = false; // Variable para verificar si se encuentra el dulce
        for (Dulce dulce : dulces){ 
            // Se convierte el nombre del dulce en mayusculas y se verifica si es igual al nombre del dulce a buscar en el arraylist
            if(dulce.getNombreDulce().toUpperCase().equals(nombreDulce)){
                // Si se encuentra el dulce, se asignan los datos y se marca como encontrado
                datos = "Nombre Dulce: " + dulce.getNombreDulce() + "\nCategoria: " + dulce.getCategoriaDulce().getElementoFormateado();
                existeDulce = true;
                break; // Salir del bucle una vez que se encuentra el dulce
            }
        }
        if(!existeDulce){
            // Mostrar un cuadro de diálogo de error si no se encuentra el dulce
            JOptionPane.showMessageDialog(null, "El dulce " + nombreDulce + " no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
        return datos; // Devolver los datos del dulce encontrado
    }
    

    // Metodo que permite listar todos los dulce
    public void listarDulces(){
        for (Dulce dulce : dulces){
            dulce.mostrarInformacion();
        }
    }

    // Obtener el arraylist de los dulces
    public ArrayList<Dulce> getDulces(){
        return dulces;
    }

    /* Funcion que permite obtener un array con los nombres de los dulces. Creo un array 
     de Strings y le asigno el tamaño de la cantidad de dulces que existen, posteriormente
     con un for recorro el array asigando en cada posición el nombre del dulce al que correspondiente
    */
    public String[] getNombresDulces(){
        String[] strArray = new String[dulces.size()];;
        for (int i = 0; i < dulces.size(); i++) {
            strArray[i] = dulces.get(i).getNombreDulce();
        }
        return strArray;
    }
}
