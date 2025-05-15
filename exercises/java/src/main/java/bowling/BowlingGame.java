package bowling;

public class BowlingGame {

    public int totalScore(int[] gameResults) {
        int runningTotal = 0;
        for (int i = 0; i < gameResults.length; i += 2) {
            int frameOne = 0;
            int frameTwo = 0;
            int frameTotal;
            frameOne += gameResults[i];
            if (frameOne == 10) {
                frameTotal = frameOne + gameResults[i + 1] + gameResults[i + 2];
                runningTotal += frameTotal;
                frameTotal = 0;
                i -= 1; // this removes one from the index
            } else {
                frameTwo += gameResults[i + 1];
                frameTotal = frameOne + frameTwo;
            }
                if (frameTotal == 10) {
                    frameTotal += gameResults[i + 2];
                }
                runningTotal += frameTotal;
        }
        return runningTotal;
    }
    }

