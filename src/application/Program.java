package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = lista1.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        int sum = lista1.stream().reduce(0, (x,y) -> x+y);
        System.out.println("sum = "+sum);

        // filter usa um predicado e FILTRA os itens que satisfaça esse predicado
        // map faz a ação que está dentro dos parenteses em TODOS itens do stream
        // collet transforma o stream em lista de novo.

        List<Integer> lista2 = lista1.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .collect(Collectors.toList());
        
        System.out.println(Arrays.toString(lista2.toArray()));
    }
}
