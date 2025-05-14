package bowling;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BowlingTest {

    @Test
    public void givenScores_returnTotal() {
        // Given
        BowlingGame bowlingGame = new BowlingGame();
        int[] gameResults = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        // When
        int result = bowlingGame.totalScore(gameResults);

        // Then
        assertThat(result).isEqualTo(20);
    }
}
