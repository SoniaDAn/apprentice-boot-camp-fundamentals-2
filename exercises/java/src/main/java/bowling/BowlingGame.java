package bowling;

import java.util.Arrays;

public class BowlingGame {

    public int totalScore(int[] gameResults) {
        int result = 0;
        for (int i = 0; i < gameResults.length; i += 2) {
            result += gameResults[i];
            result += gameResults[i + 1];
            if (result == 10) {
                result += gameResults[i + 2];
            }
        }
        return result;
    }
}

           /*int runningTotal = 0;
           runningTotal = gameResults[i] + gameResults[i + 1];
           if (runningTotal == 10) {
              runningTotal += gameResults[i + 2];
           }
       }
        return Arrays.stream(gameResults).sum();*/


