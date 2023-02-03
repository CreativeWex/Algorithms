/*
    =====================================
    @project Algorithms
    @created 01/02/2023    
    @author Bereznev Nikita @CreativeWex
    =====================================
 */

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    static Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));

    // Самый эффективный метод
    public static int calculateSimple(int n) {
        int last = 0, next = 1;
        for (int i = 0; i < n; i++) {
            int oldLast = last;
            last = next;
            next = oldLast + last;
        }
        return last;
    }

    //Метод, заключающийся в запоминании значений уже встречающихся чисел
    public static int calculateMemo(int n) {
        if (!memo.containsKey(n)) {
            memo.put(n, calculateMemo(n - 1) + calculateMemo(n - 2));
        }
        return memo.get(n);
    }
}
