/*
    =====================================
    @project Algorithms
    @created 06/02/2023    
    @author Bereznev Nikita @CreativeWex
    =====================================
 */

import java.util.HashMap;
import java.util.Map;

public class PairOfShoes {
    enum Foot { LEFT, RIGHT};
    record Shoe(Foot foot, int size) { }

    class Solution {
        public static boolean pairOfShoes(Shoe[] shoes) {
            Map<Integer, Foot> takenShoes = new HashMap<>();
            for (int i = 0; i < shoes.length; i++) {
                if (takenShoes.containsKey(shoes[i].size)) {
                    if (takenShoes.get(shoes[i].size).equals(shoes[i].foot)) {
                        return false;
                    }
                } else {
                    takenShoes.put(shoes[i].size, shoes[i].foot);
                }
            }
            return true;
        }
    }
}
