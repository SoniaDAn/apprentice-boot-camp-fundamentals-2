package bowling;

import java.util.Arrays;

public class BowlingGame {

    public int totalScore(int[] gameResults) {
        int runningTotal = 0;
        for (int i = 0; i < gameResults.length; i += 2) {
            int frame = 0;
            frame += gameResults[i];
            frame += gameResults[i + 1];
            if (frame == 10) {
                frame += gameResults[i + 2];
            }
            runningTotal += frame;
        }
        return runningTotal;
    }
}


