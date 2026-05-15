package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Juliana");
        list.add("Lucas");
        list.add("João");
        list.add(2, "Marcos");

        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------");
        System.out.println("Index of Lucas: " + list.indexOf("Lucas"));
        System.out.println("Index of Marcos: " + list.indexOf("Marcos"));
        System.out.println("------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
        for(String x : result) {
            System.out.println(x);
        }
         System.out.println("------------------");
         String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
         System.out.println(name);


        

    }
}
