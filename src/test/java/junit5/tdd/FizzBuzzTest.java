package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_return_1_when_count_off_given_1(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 1;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        assertEquals("1", result);
    }

    @Test
    void should_return_fizz_when_count_off_given_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 3;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        assertEquals("fizz", result);
    }

    @Test
    void should_return_buzz_when_count_off_given_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 5;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        assertEquals("buzz", result);
    }
    @Test
    void should_return_fizzbuzz_when_count_off_given_15(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 15;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        assertEquals("fizzbuzz", result);
    }

    @Test
    void should_return_whizz_when_count_off_given_7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 7;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        assertEquals("whizz", result);
    }
    @Test
    void should_return_whizzbuzz_when_count_off_given_35(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 35;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        assertEquals("whizzbuzz", result);
    }

    @Test
    void should_return_fizzwhizz_when_count_off_given_21(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 21;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        assertEquals("fizzwhizz", result);
    }

    @Test
    void should_return_fizzbuzzwhizz_when_count_off_given_105(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 105;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        assertEquals("fizzbuzzwhizz",result);
    }
}
