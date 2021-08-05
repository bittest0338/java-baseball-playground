package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    @Test
    void 테스트(){
        String[] str = "1,2".split(",");
        assertThat(str).contains("1","2");
        String[] str2 = "1".split(",");
        assertThat(str2).containsExactly("1");
    }

    @Test
    void 테스트2(){
        String str = "(1,2)";
        String tmp = str.substring(1, str.length() - 1);
        assertThat(tmp).isEqualTo("1,2");
    }
/*
* 요구사항 3
* "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
* String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면
* StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
* JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.
* */
    @Test
    @DisplayName("학습테스트 구현")
    void 테스트3(){
        String str = "abc";
        assertThatThrownBy(() -> {
                throw new IndexOutOfBoundsException("index : 2, size:3");
        }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("index : 2, size:3");
    }


}
