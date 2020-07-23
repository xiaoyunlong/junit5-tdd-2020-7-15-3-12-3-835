package junit5.tdd;

public class FizzBuzz {
    public String play(int inputNumber){
        if(inputNumber % 3 == 0){
            return "fizz";
        }
        if(inputNumber == 5){
            return "buzz";
        }
        return String.valueOf(inputNumber);
    }
}
