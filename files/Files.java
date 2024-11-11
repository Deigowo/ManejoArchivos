package files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Files {

    public void readFileInScreen(String fileName) {
        File file; // Apunta a un archivo físico en el disco duro
        FileReader reader; // Llavve con persmisos de solo lectura
        BufferedReader bufer; // Recuperar información del archivo
        String line;

        try {
            // crear un apuntador al archivo fisico
            file = new File("C:\\archivos\\" + fileName + ".txt");
            // abrir el archivo
            reader = new FileReader(file);
            // Configurar bufer para leer el archivo
            bufer = new BufferedReader(reader);
            while ((line = bufer.readLine()) != null) {
                System.out.println("Linea leída: " + line);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.toString());
        }
    }

    public int countFileLines(String fileName) {
        File file; // Apuntar a un archivo fisico del disco duro
        FileReader reader; // Llave con persmiso de solo lectura
        BufferedReader bufer; // Bufer para recuperar la información
        int lines = 0;
        try {
            // crear un apuntador al archivo fisico
            file = new File("C:\\archivos\\" + fileName + ".txt");
            // abrir el archivo
            reader = new FileReader(file);
            // Configurar bufer para leer el archivo
            bufer = new BufferedReader(reader);
            while ((bufer.readLine()) != null) {
                lines++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.toString());
        }
        return lines;
    }

    public String[] fileToStringArray(String fileName) { // Donde String es un arreglo de caracteres
        File file; // Apuntar a un archivo fisico del disco duro
        FileReader reader; // Llave con persmiso de solo lectura
        BufferedReader bufer; // Bufer para recuperar la información
        String line; // Una línea recuperada del archivo de texto
        String[] array = null; //Se tiene que inicializar con un null
        int t; // el tamaño del archivo en líneas de texto
        int i = 0; //El índice del arreglo

        try {
            //Obtener el tamaño del archivo en lineas
            t = countFileLines(fileName);
            System.out.println(t);
            array = new String[t];
            file = new File ("C:\\archivos\\" + fileName + ".txt");
            reader = new FileReader(file);
            bufer = new BufferedReader(reader);
            while ((line = bufer.readLine()) != null) {
                array[i] = line;
                i++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer archivo" + e.toString());
        }
        return array;
    }

    public int[] fileToIntArray(String fileName) { // Donde String es un arreglo de caracteres
        File file; // Apuntar a un archivo fisico del disco duro
        FileReader reader; // Llave con persmiso de solo lectura
        BufferedReader bufer; // Bufer para recuperar la información
        String line; // Una línea recuperada del archivo de texto
        int[] array = null; //Se tiene que inicializar con un null
        int t; // el tamaño del archivo en líneas de texto
        int i = 0; //El índice del arreglo

        try {
            //Obtener el tamaño del archivo en lineas
            t = countFileLines(fileName);
            System.out.println(t);
            array = new int[t];
            file = new File ("C:\\archivos\\" + fileName + ".txt");
            reader = new FileReader(file);
            bufer = new BufferedReader(reader);
            while ((line = bufer.readLine()) != null) {
                array[i] = Integer.parseInt(line);
                i++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer archivo" + e.toString());
        }
        return array;
    }

    public void printStringArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }

    public void printlntArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public void writeKeyboardToFile(String fileName) {
        //Aúntador del espacio fisico del dd
        FileWriter file;
        // La llave del acceso para escritura
        PrintWriter writer;
        // Configurar bufer para leer el teclado
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        char respuesta;

        try {
            // Apuntando a un espacio fisico del disco duro.
            file = new FileWriter("C:\\archivos\\" + fileName + ".txt");
            // Crear y abrir el archivo en modo escritura
            writer = new PrintWriter(file);
            do {
                System.out.println("Escirbe datos para guardar al archivo: ");
                entrada = bufer.readLine();
                // Guardar entrada en el archivo
                writer.println(entrada);
                System.out.println("Escriba x para salir, s para seguir");
                entrada = bufer.readLine();
                respuesta = entrada.charAt(0);
            } while (respuesta != 'x');
            file.close();
        } catch (Exception e) {
            System.out.println("Error al escribir el archivo: " + e.toString());
        }
    }

    public void writeIntArrayToFile(String fileName, int[] array) {
        FileWriter file;
        PrintWriter writer;
        try {
            file = new FileWriter("C:\\archivos\\" + fileName + ".txt");
            writer = new PrintWriter(file);
            // Guardar el array a un archivo
            for ( int Number : array ) {
                writer.println(Number);
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Error al escribir el archivo: " + e.toString());
        }
    }

    public void writeStringArrayToFile(String fileName, String[] array) {
        FileWriter file;
        PrintWriter writer;
        try {
            file = new FileWriter("C:\\archivos\\" + fileName + ".txt");
            writer = new PrintWriter(file);
            // Guardar el array a un archivo
            for ( String Number : array ) {
                writer.println(Number);
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Error al escribir el archivo: " + e.toString());
        }
    }
}
