import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class EjemploLeerCVS {
    public static void main(String[] args) {
        EjemploLeerCVS.leer();

    }

    public static void leer(){
        HashMap<String, Integer> palabras = new HashMap<String, Integer>();

        try {int c = 0;
            String linea;
            BufferedReader leer = new BufferedReader(new FileReader("C:\\Users\\bombo\\Desktop\\claseMariaLuisa\\src\\unique-passenger-counts-over-100-by-NZ-port-and-citizenship-year-ended-june-2020.csv"));

            while((linea = leer.readLine()) != null){
                String [] contenido = linea.split(",");
                String palabraEncontrar = "Canada";
                if (contenido [1].equals(palabraEncontrar)) {
                    //System.out.println(linea);
                    c++;
                    palabras.put(palabraEncontrar, c);
                }

            }
            leer.close();
        } catch (FileNotFoundException ex){
            System.err.println("No encontro el archivo");
        } catch (IOException ex){
            System.err.println("No puedo leer");
        }

        for(String i : palabras.keySet()){
            System.out.println(i + "," + palabras.get(i));
        }
    }
}

