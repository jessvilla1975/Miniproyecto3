# MiniProyecto3
# _Integrantes_
- Alex Garcia Castañeda - 2259517
- Yessica Fernanda Villa Nuñez - 2266301
- Victor Manuel Hernandez Ortiz - 2259520

**Link de trello - espacio de gestion del proyecto**
https://trello.com/invite/b/SIUbqORz/ATTIe3805f437f283b344ea097b375406340CBD1D06D/miniproyecto-iii
# _Enunciado del miniproyecto_
Vamos a hacer la gestión de una tienda de dulces
La aplicación debe permitir las siguiente opciones:
1. Insertar nuevos dulces
2. Actualizar dulces
3. Eliminar dulces
4. Buscar dulces por nombre
5. Listar todos los dulces

Un dulce tiene un nombre y una categoría (dulce, ácido, sin azúcar). Aplicar los conceptos
vistos en clase y generar la interfaz gráfica para realizar esta gestión. La interfaz debe tener un
botón que al presionarlo, se mostrará un resumen de todos los dulces creados dentro de un
área de texto.

Lo novedoso de este miniproyecto es que se implementará el modelo vista
controlador para escoger entre terminal e interfaz gráfica. Aplicar lo visto en
clase, algún formato igual o muy parecido de controlador

## _Descripcion geneal del funcionamiento del programa_
Este programa ofrece una variedad de funciones que permiten gestionar de forma básica una tienda de dulces. Incluye características como la inserción de nuevos dulces, su modificación, búsqueda, eliminación y la capacidad de mostrar una lista completa de los dulces disponibles. Cuenta con la eleccion entre interfaz por consola o La interfaz gráfica de usuario (GUI). Cada interfaz cuenta con submenus en los cuales se da la implementacion de las principales funionalidades del programa. Se usa el patron de diseño MVC, con el fin de crear una independencia entre el apartado visual y de almacenamiento y logica de datos, ello también nos permite crear los dos tipos de vistas (GUI y Terminal) y declarar las mismas funciones para ambas aunque con una diferente implementacion dependiendo del tipo de vista.

## _Descripcion del funcionamiento de los menús del programa_
### Insertar dulces
En el panel menu insertar dulces implica que el usuario interactúa con diferentes elementos gráficos para ingresar información, en este caso se puede considerar las siguientes interacciones: 
-un campo de texto (TextField) donde el usuario ingresa el nombre del dulce.
-un grupo de botones de opción (RadioButton) que representa tres categorías: ácido, dulce y sin azúcar.
-Un boton (Jbutton) para activar el evento.

La vista de terminal, utilizamos la clase Scanner para leer los datos ingresados por el usuario, luego se muestra un menú de opciones y se le solicita al usuario que ingrese el número correspondiente a la categoría seleccionada, ambos datos ingresados guardados en variables auxiliares de tipo String y se usa un switch para asignar la categoría correspondiente según la opción seleccionada. 

Se obtienen los datos en metodos get, los cuales por medio del controlador, se ejecuta el metodo del modelo de insertar ducle, el cual recibe dos parametros nombre de dulce y categoria del dulce. Luego agregar ese objeto a la lista de dulces existente. Esto permite almacenar información sobre los dulces ingresados en una estructura de datos para su posterior uso o consulta.

### Actualizar Dulces
El menú de actualización de dulces se encarga de interactuar con la lista de dulces del modelo de datos para realizar cambios en los atributos de los dulces existentes. Para llevar a cabo esta funcionalidad, se utilizan varios elementos en la GUI:
- Un combobox que muestra los nombres de los dulces existentes. El nombre del dulce seleccionado se almacena en una variable.
- Un campo de texto donde se ingresa el nuevo nombre del dulce. El valor ingresado se guarda en otra variable.
- Un conjunto de radio buttons que permite seleccionar la nueva categoría del dulce. La categoría seleccionada se almacena en una variable separada.

Mientras que en la terminal se hace uso de prints y scanners para tomar los datos. En ambos casos estos datos se almacenan en unas variables auxiliares las cuales cuentan con getters que posteriormente son pedidos por el controlador para ser enviados al modelo.

Una vez que se han obtenido los valores necesarios, se realiza un recorrido por la lista de dulces del modelo. Durante este recorrido, se busca el dulce que se desea modificar mediante la comparación de nombres. Una vez encontrado, se utilizan los métodos "set" correspondientes para modificar los atributos del dulce con los nuevos valores proporcionados.

Al finalizar el proceso de modificación, se realizan algunas tareas adicionales, como borrar la selección de los radio buttons, restablecer el texto predeterminado en el campo de texto y actualizar las listas que muestran los nombres de los dulces, asegurando así una interfaz coherente y actualizada.
### Buscar dulces por nombre
La interacción del panel buscar dulces es un panel de búsqueda consta de dos elementos principales:
-Un campo de texto (textField) para ingresar los datos del dulce a buscar
-Un área de texto (textArea) que mostrará los resultados.
-Un boton (Jbutton) para activar el evento.
En la terminal solo se obtiene en una variable el nombre del dulce a buscar, una vez obtenido el nombre del dulce a buscar en cualquiera de las vistas, se envia a un metodo del modelo, el cual recibe el parametro del nombre del dulce, se realiza la busqueda del dulce en la base de datos del arraylist. Una vez encuentra el dulce, se guarda en una variable los datos del dulce, el cual se envia por medio de un setter para mostrar la informacion en la terminal y en el Text Area de la Gui. 
### Eliminar Dulces
El menu de eliminacion de dulces se encarga de interactuar con la lista de dulces del modelo de datos para realizar cambios en los atributos de los dulces existentes.Para llevar a cabo esta funcionalidad, se utilizan varios elementos en la GUI:

- Un combobox que muestra los nombres de los dulces existentes. El nombre del dulce seleccionado se almacena en una variable.
- Un TextField de informacion en donde se muestra la informacion del dulce seleccionado en el combobox
- Un Jbutoon encargado de dar el evento que confirma el dulce a eliminar

Mientras que en la terminal se hace uso de prints y scanners para tomar los datos. En ambos casos estos datos se almacenan en unas variables auxiliares las cuales cuentan con getters que posteriormente son pedidos por el controlador para ser enviados al modelo.

En la interfaz una vez que se han obtenido los valores necesarios, se realiza un recorrido por la lista de dulces del modelo. Durante este recorrido, se manda el nombre almacenado en una variable al metodo de eliminar dulce en el modelo, despus de de esto se actualizara el jcombox mostrando los dulces que quedaron.

Al eliminar el dulce en la interfaz se realizan alguna tareas adicionales, como limpiar el campo de informacion una vez eliminiado el dulce.
### Lista de dulces 
El menu de eliminacion de dulces se encarga de interactuar con la lista de dulces del modelo de datos para dar a conocer la categotia de estos en una caja de texto, se ultilizan varios elementos en la GUI:

- Un Jlist que muestra los nombres de los dulces.
- Un TextField en donde se mostra la categoria del dulce que se haya seleccionado ene le Jlist.

Mientras que en la terminal se hace un de varios prints y del metodo de listar dulces que se encuentra en el modelo,
este se encargara de imprimir cada detalle de los dulces.

En la interfaz se asignara a una variable el elemento seleccionado en el Jlist, esta variable a asu vez se enviara mediante el controlador al modelo en donde se ejecutara un metodo que enviara la categoria exacta del dulce seleccionado hacia la interfaz, y esta se vera en el TextField categoria.

