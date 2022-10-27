
package linkedlist;

import java.util.LinkedList;

/**
 *
 * @author esteban
 */
public class LinkedEstudiante 
{
    
     static  final LinkedList<Estudiante> linkedListEstudiante = new LinkedList<Estudiante>();
    
    public LinkedList <Estudiante> addestudiante (Estudiante estudiante)
    {
        linkedListEstudiante.add(estudiante);
        return linkedListEstudiante;
    }
    //public void showEstudiante()
 //   {
        public void showEstudiante()
        {     
        System.out.println("list Estudiantes: " + linkedListEstudiante);
    }
}
