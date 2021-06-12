package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // [0. 학습테스트 - Set class 에 대한 학습 테스트] : 요구사항 1
    @Test
    void size() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    // [0. 학습테스트 - Set class 에 대한 학습 테스트] : 요구사항 2
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void contains(int input) {
        assertThat(numbers.contains(input)).isTrue();
    }

    // [0. 학습테스트 - Set class 에 대한 학습 테스트] : 요구사항 3
    @ParameterizedTest
    @CsvSource({"1, true", "2, true", "3, true", "4, false", "5, false"})
    void trueOrfalseContains(int input, boolean expectedStr) {
        assertEquals(numbers.contains(input), expectedStr);
    }

}
