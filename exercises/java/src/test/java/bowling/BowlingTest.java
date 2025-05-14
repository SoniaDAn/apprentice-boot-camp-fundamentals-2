package bowling;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BowlingTest {
    @Test
    public void givenAllZero_returnZero() {
        // Given
        BowlingGame bowlingGame = new BowlingGame();
        int[] gameResults = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // When
        int result = bowlingGame.totalScore(gameResults);

        // Then
        assertThat(result).isZero();
    }
}
