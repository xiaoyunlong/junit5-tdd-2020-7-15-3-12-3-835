package junit5.tdd;

public class FizzBuzz {
    public String play(int inputNumber){
        if(inputNumber % 3 == 0){
            return "fizz";
        }
        return String.valueOf(inputNumber);
    }
}
