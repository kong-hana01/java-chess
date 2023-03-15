package chess.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayNameGeneration(ReplaceUnderscores.class)
@SuppressWarnings("NonAsciiCharacters")
class RankCoordinateTest {

    @ParameterizedTest
    @CsvSource(value = {"ONE:true", "TWO:true", "THREE:false", "EIGHT:false"}, delimiter = ':')
    void White팀의_랭크인지_확인할_수_있다(RankCoordinate rankCoordinate, boolean expect) {
        assertThat(rankCoordinate.isWhiteRank()).isEqualTo(expect);
    }

    @ParameterizedTest
    @CsvSource(value = {"SEVEN:true", "EIGHT:true", "TWO:false", "SIX:false"}, delimiter = ':')
    void Black팀의_랭크인지_확인할_수_있다(RankCoordinate rankCoordinate, boolean expect) {
        assertThat(rankCoordinate.isBlackRank()).isEqualTo(expect);
    }
}
