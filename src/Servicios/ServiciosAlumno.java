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
package Servicios;

import Entidades.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiciosAlumno {

    ArrayList<Alumnos> listaAlumno = new ArrayList<>();
    Scanner leer = new Scanner(System.in);
    Alumnos alumno = new Alumnos();

    public Alumnos crearAlumno() {

        String aux = "si";

        do {
            System.out.println("NOMBRE DEL ALUMNO: ");
            alumno.setNombre(leer.nextLine());

            System.out.println("NOTA 1 :");
            alumno.setNota1(leer.nextInt());
            System.out.println("NOTA 2 :");
            alumno.setNota2(leer.nextInt());
            System.out.println("NOTA 3 :");
            alumno.setNota3(leer.nextInt());
            
            Alumnos alumno = new Alumnos(this.alumno.getNombre(),this.alumno.getNota1(),this.alumno.getNota2(),this.alumno.getNota3());

            listaAlumno.add(alumno);

            System.out.println("Si desea agregar otro alumno escriba: si/no");
            leer.nextLine();
            aux = leer.nextLine();

        } while (aux.toLowerCase().equals("si"));

        return alumno;
    }

    public void mostrarLista() {
        System.out.println("La cantidad de Alumnos que hay en la lista son: " + listaAlumno.size());
        for (Alumnos alumnos : listaAlumno) {
            
            System.out.println(alumnos);

        }

        
        
        
    }

}
