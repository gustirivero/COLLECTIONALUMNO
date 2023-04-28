/*
Crear una clase llamada Main que mantenga información sobre las notas de distintos
alumnos. La clase Main tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Main deberemos tener un bucle que crea un objeto Main. Se pide
toda la información al usuario y ese Main se guarda en una lista de tipo Main y se le
pregunta al usuario si quiere crear otro Main o no.
Después de ese bucle tendremos el siguiente método en el servicio de Main:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Main;

import Entidades.Alumnos;
import Servicios.ServiciosAlumno;
import Servicios.gusty;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ServiciosAlumno sa = new ServiciosAlumno();
        Scanner leer = new Scanner(System.in);
        Alumnos alumnos = sa.crearAlumno();
        sa.mostrarLista();

      
        
        
        
    }
}