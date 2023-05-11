import java.io.*;
import java.util.Scanner;

public class Problema {

    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("mensaje.txt"));
            bw = new BufferedWriter(new FileWriter("mensaje_cifrado.txt"));
            boolean validado = false;
            String linea;
            do {
                String clave;
                Scanner sc = new Scanner(System.in);
                System.out.println("Escribe la clave(max 12 letras)");
                clave = sc.nextLine();
                if (clave.matches("[a-zA-Z]{1,15}"))
                    validado = true;
                /* Lectura y validación  de clave */
                linea = null;
            } while (validado = false);

            /* Lectura y validación  de clave */

            while ((linea = br.readLine()) != null) {
                StringBuilder sb = new StringBuilder(linea.length());


                /* Aquí vendría la lógica del programa */


                bw.write(sb.toString()); /* Escribe la cadena de caracteres en el fichero*/
                bw.newLine(); /* escribe nueva línea en el fichero */

            }
            System.out.println("El mensaje ha sido cifrado correctamente");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            /* Lectura y validación  de clave */
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null)
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (bw != null)
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

}


