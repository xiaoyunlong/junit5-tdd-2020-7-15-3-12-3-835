package junit5.tdd;

public class FizzBuzz {
    public String play(int inputNumber) {
        if (inputNumber % 3 == 0 && inputNumber % 5 == 0) {
            return "fizzbuzz";
        }

        if (inputNumber % 3 == 0) {
            return "fizz";
        }
        if (inputNumber % 5 == 0) {
            return "buzz";
        }
        if (inputNumber % 7 == 0) {
            return "whizz";
        }
        return String.valueOf(inputNumber);
    }
}
