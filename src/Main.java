import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    //Set
    //Escribir un programa que cree un Set y añada 100 elementos aleatorios (0-100) e imprimirlo
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            mySet.add(new Random().nextInt(100));
        }
        for (Integer elemento:mySet) {
            System.out.print(elemento +" ");
        }
        System.out.println("Tamaño de my set: "+mySet.size());

        Set<Integer> mySet1 = new TreeSet<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            mySet1.add(random.nextInt(100));
        }
        for (Integer elemento:mySet1) {
            System.out.print(elemento+" ");
        }




    }
}
