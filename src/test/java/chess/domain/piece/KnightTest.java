package chess.domain.piece;

import static chess.domain.board.FileCoordinate.C;
import static chess.domain.board.RankCoordinate.FOUR;
import static org.assertj.core.api.Assertions.assertThat;

import chess.domain.board.FileCoordinate;
import chess.domain.board.Position;
import chess.domain.board.RankCoordinate;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayNameGeneration(ReplaceUnderscores.class)
@SuppressWarnings("NonAsciiCharacters")
class KnightTest {

    private static final Position C_4 = new Position(C, FOUR);

    @ParameterizedTest
    @CsvSource(value = {"B:SIX:true", "A:THREE:true", "E:SIX:false", "C:FOUR:false"}, delimiter = ':')
    void 나이트는_상하좌우로_움직인_뒤_대각선으로_이동할_수_있다(FileCoordinate fileCoordinate, RankCoordinate rankCoordinate, boolean expect) {
        Knight knight = new Knight(Color.WHITE);

        assertThat(knight.canMove(C_4, new Position(fileCoordinate, rankCoordinate))).isEqualTo(expect);
    }
}