import java.util.*;

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

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un valor para buscarlo en la lista");
        int busquedaNumero = sc.nextInt();

        if(mySet1.contains(busquedaNumero)){
            System.out.println("El numero "+busquedaNumero+" si está");
        }else{
            System.out.println("No esta el numero"+ busquedaNumero);
        }
    }
}
