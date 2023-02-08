package kyu7;
/*
    =====================================
    @project Algorithms
    @created 08/02/2023    
    @author Bereznev Nikita @CreativeWex
    =====================================
 */


import static java.util.stream.IntStream.of;

public class LargestElements {
    public static int[] largest(int n, int[] arr) {
        return of(arr)
                .sorted()
                .skip(arr.length - n)
                .toArray();
    }
}
