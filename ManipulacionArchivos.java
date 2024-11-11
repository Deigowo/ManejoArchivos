import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import files.Files;

public class ManipulacionArchivos {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        String fileName;
        String [] languages;
        int opcion;
        Files files = new Files();


        // Menú de opciones
        do {
            System.out.println("1. Leer archivo y mostrarlo en pantalla");
            System.out.println("2. Llenar un arreglo con contenido de archivo");
            System.out.println("3. Crear archivo nuevo desde teclado");
            System.out.println("4. Guardar arreglo de enteros a un archivo");
            System.out.println("5. Salir");
            entrada = bufer.readLine();
            opcion = Integer.parseInt(entrada);
            switch (opcion) {
                case 1: {
                    System.out.println("Escribe el nombre del archivo: ");
                    fileName = bufer.readLine();
                    files.readFileInScreen(fileName);
                }
                break;
                case 2: {
                    System.out.println("Lectura de archivos de texto");
                    fileName = bufer.readLine();
                    languages = files.fileToStringArray(fileName);
                    files.printStringArray(languages);
                }
                break;
                case 3: {
                    System.out.println("Escribe el nombre del archivo: ");
                    fileName = bufer.readLine();
                    files.writeKeyboardToFile(fileName);
                }
                break;
                case 4: {
                    int [] numbers = {19, 0, 8, 38, 32, 87, 8, 95, 23, 14, 2};
                    System.out.println("Escribe el nombre del archivo: ");
                    fileName = bufer.readLine();
                    files.writeIntArrayToFile(fileName, numbers);
                }
                break;
                case 5: {
                    System.out.println("Saliendo del sistema...");
                    System.exit(0);
                }
            }
        } while (opcion != 5);

    }
}