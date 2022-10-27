package linkedlist;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author esteb
 */
public class TLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option;

        LinkedEstudiante linkedEstudiante = new LinkedEstudiante();

        // Estudiante estudiante = new Estudiante();
        //System.out.println("option =" + option);
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null, "seleciones una opcion \n 1.- agregar, \n 2.- mostrar, \n 3.- editar, \n 4.- actualizar, \n 5.- salir"));

            switch (option) {
                case 1:

                    String idEstudiante = "2031126006";
                    String nombre = "Esteban Gabriel";
                    String apelliedopaterno = "Segundo";
                    String apellidomaterno = "Gonzalez";
                    String profesion = "INGENIERIA";

                    Estudiante estudiante = new Estudiante(idEstudiante, nombre, apellidomaterno, apellidomaterno, profesion);
                    linkedEstudiante.addestudiante(estudiante);

                    System.out.println("se eligio la opcion agregar");
                    break;

                case 2:  
                    
                    linkedEstudiante.showEstudiante();
                    //System.out.println(linkedEstudiante);
                    System.out.println("se eligio la opcion mostrar");
                    break;

                case 3:
                    System.out.println("se eligio la opcion editar");
                    break;

                case 4:
                    System.out.println("se eligio la opcion actualizar");
                    break;

                case 5:
                    System.out.println("se eligio la opcion salir");
                    break;

                default:;
            }
        } while (option != 5);
    }
}

//        LinkedList<String> linkedListAnimals = new LinkedList<String>();
//
//        linkedListAnimals.add("dog");
//        linkedListAnimals.add("cat");
//        linkedListAnimals.add("monkey");
//        linkedListAnimals.add("donkey");
//        linkedListAnimals.add("turtle");
//        linkedListAnimals.add("cow");
//        linkedListAnimals.add("parrot");
//        linkedListAnimals.add("tigger");
//        linkedListAnimals.add("lion");
//        linkedListAnimals.add("crocodrile");
//        linkedListAnimals.add("duck");
//        linkedListAnimals.add("elephant");
//        linkedListAnimals.addFirst("fish");
//        linkedListAnimals.addLast("horse");
//
//        System.out.println("lista de animales; " + linkedListAnimals);
//        System.out.println("lista de animales; " + linkedListAnimals.getFirst());
//
//        linkedListAnimals.removeFirst();
//        linkedListAnimals.removeLast();
//
//        System.out.println("lista de animales; " + linkedListAnimals);
//        System.out.println("lista de animales peek; " + linkedListAnimals.peek());
//        System.out.println("lista de animales; " + linkedListAnimals);
//
//        //clona las respuetas 
//        linkedListAnimals.clone();
//        System.out.println("lista de animales; " + linkedListAnimals);
//
//        //cuenta o busca si se encuentra perro
//        linkedListAnimals.contains("dog");
//        System.out.println("lista de animales; " + linkedListAnimals.contains("dog"));
//
//        //inserta un nuevo valor, un nuevo campo
//        linkedListAnimals.add("camaleon");
//        System.out.println("lista de animales; " + linkedListAnimals.add("camaleon"));
//        System.out.println("lista de animales; " + linkedListAnimals);

