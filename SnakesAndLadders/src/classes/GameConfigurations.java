package classes;

import java.util.HashMap;
import java.util.Map;

public class GameConfigurations {
    public static final Map<Integer, Integer> SNAKE_HEADS_AND_TAILS = new HashMap<>();
    public static final Map<Integer, Integer> LADDER_BOTTOMS_AND_TOPS = new HashMap<>();

    static {
        //Definition for snake head and tail positions//
        SNAKE_HEADS_AND_TAILS.put(31,7);
        SNAKE_HEADS_AND_TAILS.put(34,27);
        SNAKE_HEADS_AND_TAILS.put(35,15);
        SNAKE_HEADS_AND_TAILS.put(39,20);
        SNAKE_HEADS_AND_TAILS.put(50,31);
        SNAKE_HEADS_AND_TAILS.put(63,44);
        SNAKE_HEADS_AND_TAILS.put(89,73);
        SNAKE_HEADS_AND_TAILS.put(97,63);
        //============================================//


        //Definition for ladder bottom and tops positions//
        LADDER_BOTTOMS_AND_TOPS.put(3,46);
        LADDER_BOTTOMS_AND_TOPS.put(9,33);
        LADDER_BOTTOMS_AND_TOPS.put(20,39);
        LADDER_BOTTOMS_AND_TOPS.put(42,59);
        LADDER_BOTTOMS_AND_TOPS.put(32,57);
        LADDER_BOTTOMS_AND_TOPS.put(64,77);
        LADDER_BOTTOMS_AND_TOPS.put(69,95);


        //============================================//
    }
}
