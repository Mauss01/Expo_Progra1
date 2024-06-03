/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expo.progra1;
import java.util.Scanner;
/**
 *
 * @author gabri
 */
public class ExpoProgra1 {

    public ExpoProgra1(Eleccion spotify) {
        this.spotify = spotify;
    }
    static Scanner lea = new Scanner(System.in);
    private Eleccion spotify;

    public static void main(String[] args) {
        Eleccion spotify = new Eleccion("Ninguno", "Ninguna",0);
        Computadora computadora1 = new Computadora("Ryzen 7 3700x", 16, "GeForce GTX 1660 Ti GAMING", 1000);
        int resp = 1;
        Libro[] libros = new Libro[5];
        while (resp != 5) {
            System.out.println("-------------------MENU-------------------");
            System.out.println("1. Spotify");
            System.out.println("2. Libreria Virtual");
            System.out.println("3. Mostrar componentes de la PC");
            System.out.println("4. Cambiar componentes de la PC");
            System.out.println("5. Salir");
            resp = lea.nextInt();
            if (resp > 5 || resp < 0) {
                System.out.println("Numero invalido");
            }
            switch (resp) {
                case 1:
                    System.out.println("Entrando a Spotify....");
                    mood(spotify);
                    break;

                case 2:
                libros[0] = new Libro("1. Dune");
                libros[1] = new Libro("2. Metro 2033");
                libros[2] = new Libro("3. Prision Verde");
                libros[3] = new Libro("4. Codigo Civil de Honduras");
                libros[4] = new Libro("5. The Shadow Over Innsmouth");

                int resp2;

        do {
            System.out.println("---------------------------------");
            System.out.println("Libros disponibles:");
            for (int i = 0; i < libros.length; i++) {
                System.out.println(libros[i]);
            }
            System.out.println("---------------------------------");
            System.out.println("Opciones");
            System.out.println("1. Rentar libro");
            System.out.println("2. Devolver libro");
            System.out.println("3. Regresar al menu principal");
            System.out.print("Elige una opcion: ");
            resp2 = lea.nextInt();

            switch (resp2) {
                case 1:
                    System.out.println("---------------------------------");
                    System.out.print("Elige el numero del libro que vas a rentar: ");
                    int rent = lea.nextInt() - 1;
                    if (rent >= 0 && rent < libros.length) {
                        if (libros[rent].getEstado().equals("disponible")) {
                            libros[rent].rentar();
                        } else {
                            System.out.println("Ya lo prestaron.");
                        }
                    } else {
                        System.out.println("Numero invalido.");
                    }
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    System.out.print("Elige el numero del libro que vas a devolver: ");
                    int dev = lea.nextInt() - 1;
                    if (dev >= 0 && dev< libros.length) {
                        libros[dev].devolver();
                    } else {
                        System.out.println("Numero invalido.");
                    }
                    break;
                case 3:
                    System.out.println("---------------------------------");
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (resp2 != 3);
        break;
                case 3:
                    System.out.println("Los componentes actuales son: ");
                    System.out.println("Procesador: " + computadora1.getProcesador());
                    System.out.println("Tarjeta Grafica: " + computadora1.getGPU());
                    System.out.println("Memoria RAM: " + computadora1.getRAM() + "GB");
                    System.out.println("Memoria: " + computadora1.getMemoria() + "GB");
                    break;

                case 4:
                    int opcion;
                    System.out.println("Que componente desea cambiar?");
                    System.out.println("1. Procesador");
                    System.out.println("2. Tarjeta Grafica");
                    System.out.println("3. Memoria RAM");
                    System.out.println("4. Memoria");
                    opcion = lea.nextInt();
                    switch (opcion) {
                        case 1:
                            int opcion1;
                            System.out.println("-------TIENDA-------");
                            System.out.println("Seleccione el componente a cambiar: ");
                            System.out.println("1. Ryzen 3 3100");
                            System.out.println("2. Ryzen 5 3600");
                            System.out.println("3. Ryzen 7 3700x");
                            System.out.println("4. Ryzen 9 3900x");
                            String validar;
                            opcion1 = lea.nextInt();
                            if (opcion1 > 5 || opcion1 < 0) {
                                System.out.println("Numero invalido. Vuelva pronto.");
                            }
                            switch (opcion1) {

                                case 1:
                                    validar = computadora1.getProcesador();
                                    computadora1.setProcesador("Ryzen 3 3100");
                                    if (computadora1.getProcesador() == validar) {
                                        System.out.println("Lo siento pero ya posee el componente");
                                    }
                                    break;
                                case 2:
                                    validar = computadora1.getProcesador();
                                    computadora1.setProcesador("Ryzen 5 3600");
                                    if (computadora1.getProcesador() == validar) {
                                        System.out.println("Lo siento pero ya posee el componente");
                                    }
                                    break;

                                case 3:
                                    validar = computadora1.getProcesador();
                                    computadora1.setProcesador("Ryzen 7 3700x");
                                    if (computadora1.getProcesador() == validar) {
                                        System.out.println("Lo siento pero ya posee el componente");
                                    }
                                    break;
                                case 4:
                                    validar = computadora1.getProcesador();
                                    computadora1.setProcesador("Ryzen 9 3900x");
                                    if (computadora1.getProcesador() == validar) {
                                        System.out.println("Lo siento pero ya posee el componente");
                                    }
                                    break;
                            }
                            break;//break case 1 del comp

                        case 2:
                            int opcion2;
                            System.out.println("-------TIENDA-------");
                            System.out.println("Seleccione el componente a cambiar: ");
                            System.out.println("1. Nvidia gtx 1060");
                            System.out.println("2. GeForce GTX 1660 Ti GAMING");
                            System.out.println("3. Nvidia RTX 4090");
                            opcion2 = lea.nextInt();
                            switch (opcion2) {
                                case 1:
                                    validar = computadora1.getGPU();
                                    computadora1.setGPU("Nvidia gtx 1060");
                                    if (computadora1.getGPU() == validar) {
                                        System.out.println("Lo siento pero ya posee el componente");
                                    }
                                    break;
                                case 2:
                                    validar = computadora1.getGPU();
                                    computadora1.setGPU("GeForce GTX 1660 Ti GAMING");
                                    if (computadora1.getGPU() == validar) {
                                        System.out.println("Lo siento pero ya posee el componente");
                                    }
                                    break;
                                case 3:
                                    validar = computadora1.getGPU();
                                    computadora1.setGPU("Nvidia RTX 4090");
                                    if (computadora1.getGPU() == validar) {
                                        System.out.println("Lo siento pero ya posee el componente");
                                    }
                                    break;
                                default:
                                    System.out.println("Numero invalido. Vuelva pronto.");
                            }
                            break;//break del 2 de cambio de componentes

                        case 3:
                            int opcion3;
                            System.out.println("-------TIENDA-------");
                            System.out.println("Selecciones la cantidad de RAM: ");
                            System.out.println("1. 8 GB");
                            System.out.println("2. 16 GB");
                            System.out.println("3. 32 GB");
                            opcion3 = lea.nextInt();
                            switch (opcion3) {
                                case 1:
                                    int validar1 = computadora1.getRAM();
                                    computadora1.setRAM(8);
                                    if (computadora1.getRAM() == validar1) {
                                        System.out.println("Lo siento pero ya posee el componente");
                                    }
                                    break;
                                case 2:
                                    validar1 = computadora1.getRAM();
                                    computadora1.setRAM(16);
                                    if (computadora1.getRAM() == validar1){
                                        System.out.println("Lo siento pero ya posee el componente");
                                    }
                                    break;
                                case 3:
                                    validar1 = computadora1.getRAM();
                                    computadora1.setRAM(32);
                                    if (computadora1.getRAM() == validar1){
                                        System.out.println("Lo siento pero ya posee el componente");
                                    }
                                    break;
                                default:
                                    System.out.println("Numero invalido. Vuelva pronto.");
                            }

                            break;//break 3 del cambio de componentes
                        case 4:
                            int opcion4;
                            System.out.println("-------TIENDA-------");
                            System.out.println("Selecciones la cantidad de memoria de almacenamiento: ");
                            System.out.println("1. 250 GB");
                            System.out.println("2. 500 GB");
                            System.out.println("3. 1000 GB");
                            opcion4 = lea.nextInt();
                            switch (opcion4){
                                case 1:
                                    int validar2 = computadora1.getMemoria();
                                    computadora1.setMemoria(250);
                                    if (computadora1.getMemoria() == validar2){
                                        System.out.println("Lo siento pero ya posee el componente");
                                    }
                                    break;
                                case 2:
                                    validar2 = computadora1.getMemoria();
                                    computadora1.setMemoria(500);
                                    if (computadora1.getMemoria() == validar2){
                                        System.out.println("Lo siento pero ya posee el componente");
                                    }
                                    break;
                                case 3:
                                    validar2 = computadora1.getMemoria();
                                    computadora1.setMemoria(1000);
                                    if (computadora1.getMemoria() == validar2){
                                        System.out.println("Lo siento pero ya posee el componente");
                                    }
                                    break;
                                default:
                                    System.out.println("Numero invalido. Vuelva pronto.");
                            }
                            break;//break 4 del cambio de componentes
                    }//cambiar componente

                    break;//no tocar


            }//case del menu
        }
    }
    public static void mood(Eleccion spotify) {
        // Crear una instancia de Clase_Spotify y pasarle la instancia de Eleccion
        ExpoProgra1 app = new ExpoProgra1(spotify);
        app.mood();
    }

    private void mood() {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Bucle para mostrar el menú hasta que el usuario elija salir (opción 5)
        do {
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("---Menu---");
            System.out.println("1) Asignar Cantante");
            System.out.println("2) Cambiar Cancion");
            System.out.println("3) Parar Canciones");
            System.out.println("4) Mostrar mi cuenta spotify");
            System.out.println("5) Salir de Spotify");
            System.out.println("Seleccione una opcion: ");
            System.out.println("-------------------------------------");

            // Validar que la entrada sea un número
            while (!scanner.hasNextInt()) {
                System.out.println();
                System.out.println("-------------------------------------");
                System.out.println("Lo siento debe introducir un numero de la lista.");
                scanner.next(); // Descartar la entrada inválida
                System.out.println("Seleccione una opcion: ");
                System.out.println("-------------------------------------");
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea para evitar problemas con la entrada

            // Manejo de opciones del menú utilizando un switch
            switch (opcion) {
                case 1:
                    asignarCantante(scanner); // Pasa el scanner al método asignarCantante
                    break;
                case 2:
                    cambiarCancion(scanner); // Pasa el scanner al método cambiarCancion
                    break;
                case 3:
                    pararCancion();
                    break;
                case 4:
                    mostrarCuenta();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("-------------------------------------");
                    System.out.println("¿Esta seguro de que desea salir? (s/n): ");
                    System.out.println("-------------------------------------");
                    String confirmacion = scanner.nextLine();
                    if (confirmacion.equalsIgnoreCase("s")) {
                        System.out.println("-------------------------------------");
                        System.out.println("Saliendo de Spotify...");
                        System.out.println("-------------------------------------");
                        break;
                    } else {
                        opcion = -1; // Para no salir del bucle
                    }
                    break;
                default:
                    System.out.println();
                    System.out.println("-------------------------------------");
                    System.out.println("Ese numero no esta identificado en la lista.");
                    System.out.println("-------------------------------------");
            }
        } while (opcion != 5);
    }

    // Método privado para asignar el cantante
    private void asignarCantante(Scanner scanner) {
        // Utiliza scanner para leer la elección del usuario
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("¿Que cantante desea?");
        System.out.println("1) Kanye West");
        System.out.println("2) Travis Scott");
        System.out.print("Seleccione una opcion: ");
        System.out.println("-------------------------------------");

        // Validar que la entrada sea un número
        while (!scanner.hasNextInt()) {
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("Lo siento no contamos con ese artista.");
            scanner.next(); // Descartar la entrada inválida
            System.out.print("Seleccione una opcion: ");
            System.out.println("-------------------------------------");
        }
        int opcionCantante = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        // Asignar el cantante seleccionado
        switch (opcionCantante) {
            case 1:
                spotify.setCantante("Kanye West");
                break;
            case 2:
                spotify.setCantante("Travis Scott");
                break;
            default:
                System.out.println();
                System.out.println("-------------------------------------");
                System.out.println("Debe seleccionar entre 1 de Kanye West o 2 de Travis Scott");
                System.out.println("-------------------------------------");
        }
    }

    // Método privado para cambiar la canción
    private void cambiarCancion(Scanner scanner) {
        if ("Ninguno".equals(spotify.getCantante())) {
            System.out.println("-------------------------------------");
            System.out.println("Primero debe asignar un cantante.");
            System.out.println("-------------------------------------");
            return;
        }

        String[] cancionesKanye = {"Stronger", "Gold Digger", "Heartless", "POWER", "All of the Lights",
            "Runaway", "Flashing Lights", "Good Life", "Can't Tell Me Nothing", "Bound 2"};

        String[] cancionesTravis = {"SICKO MODE", "Goosebumps", "HIGHEST IN THE ROOM", "STARGAZING", "BUTTERFLY EFFECT",
            "YOSEMITE", "STOP TRYING TO BE GOD", "Antidote", "90210", "COFFEE BEAN"};

        // Seleccionar canciones según el cantante asignado
        String[] cancionesSeleccionadas = "Kanye West".equals(spotify.getCantante()) ? cancionesKanye : cancionesTravis;

        System.out.println("-------------------------------------");
        System.out.println("Seleccione una cancion:");
        System.out.println("-------------------------------------");
        for (int i = 0; i < cancionesSeleccionadas.length; i++) {
            System.out.println((i + 1) + ") " + cancionesSeleccionadas[i]);
        }

        // Validar que la entrada sea un número
        while (!scanner.hasNextInt()) {
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("Lo siento no contamos con esa cancion.");
            scanner.next(); // Descartar la entrada inválida
            System.out.print("Seleccione una cancion: ");
            System.out.println("-------------------------------------");
        }
        int opcionCancion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        if (opcionCancion < 1 || opcionCancion > cancionesSeleccionadas.length) {
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("Debe introducir un numero de la lista.");
            System.out.println("-------------------------------------");
            return;
        }

        spotify.setCancion(cancionesSeleccionadas[opcionCancion - 1]);
        int popularidad = (11 - opcionCancion) * 20; // Popularidad de mayor a menor
        spotify.setPopularidad(spotify.visitas(popularidad));
    }

    // Método privado para parar la canción
    private void pararCancion() {
        if ("Ninguna".equals(spotify.getCancion())) {
            System.out.println("-------------------------------------");
            System.out.println("No hay una cancion para detener.");
            System.out.println("-------------------------------------");
        } else {
            spotify.setCancion("Ninguna");
        }
    }

    // Método privado para mostrar la cuenta de Spotify
    private void mostrarCuenta() {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Cantante: " + spotify.getCantante());
        System.out.println("Cancion actual: " + spotify.getCancion());
        System.out.println("Popularidad: " + spotify.getPopularidad() + " millones de visitas");
        System.out.println("-------------------------------------");
    }
}
