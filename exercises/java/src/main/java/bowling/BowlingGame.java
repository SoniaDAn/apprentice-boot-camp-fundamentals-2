package bowling;

import java.util.Arrays;

public class BowlingGame {

    public int totalScore(int[] gameResults) {
       return Arrays.stream(gameResults).sum();
    }
}
