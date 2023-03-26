package chess.domain;

import chess.domain.Score;
import chess.domain.piece.Bishop;
import chess.domain.piece.Team;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static chess.PositionFixture.C_4;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@SuppressWarnings("NonAsciiCharacters")
class ScoreTest {

    @Test
    void 체스말이_전달되면_점수를_구할_수_있다() {
        Assertions.assertThat(Score.findScoreBy(new Bishop(Team.WHITE, C_4))).isEqualTo(3);
    }
}