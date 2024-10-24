import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManipulacionArchivos {

public static void leerArchivo(String fileName) {
    File file; //Apunta a un archivo físico en el disco duro
    FileReader reader; //Llavve con persmisos de solo lectura
    BufferedReader bufer; //Recuperar información del archivo
    String line;

    try {
        //crear un apuntador al archivo fisico
        file = new File("C:\\archivos\\" + fileName + ".txt");
        //abrir el archivo 
        reader = new FileReader(file);
        //Configurar bufer para leer el archivo
        bufer = new BufferedReader(reader);
        while( (line = bufer.readLine()) != null) {
            System.out.println("Linea leída: " + line);
        }
        reader.close();
    } catch (Exception e) {
        System.out.println("Error al leer el archivo: " + e.toString());
    }
}


    public static void main(String[] args) throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        System.out.println("Lectura de archivos de texto");
        System.out.println("Escribe el nombre del archivo: ");
        fileName = bufer.readLine();
        leerArchivo(fileName);
    }
}