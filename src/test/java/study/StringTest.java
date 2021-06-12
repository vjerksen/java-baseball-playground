package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class StringTest {

    // [0. 학습테스트 - String class 에 대한 학습 테스트] : example
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    // [0. 학습테스트 - String class 에 대한 학습 테스트] : 요구사항 1
    @Test
    void split() {
        String[] actual1 = "1,2".split(",");
        String[] actual2 = "1".split(",");

        assertThat(actual1[0]).contains("1");
        assertThat(actual1[1]).contains("2");
        assertThat(actual2[0]).contains("1");

    }

    // [0. 학습테스트 - String class 에 대한 학습 테스트] : 요구사항 2
    @Test
    void substring() {
        String actual = "(1,2)";
        int len = actual.length() - 1;

        assertThat(actual.substring(1, len)).isEqualTo("1,2");
    }

    // [0. 학습테스트 - String class 에 대한 학습 테스트] : 요구사항 3
    @DisplayName("find specific index")
    @Test
    void charAt() {
        String actual = "abc";
        int outOfIdx = 3;
        int idx = 1;

        assertThat(actual.charAt(idx)).isEqualTo('b');
        assertThatThrownBy(() -> {
            actual.charAt(outOfIdx);
        }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("%d", outOfIdx);
    }
}