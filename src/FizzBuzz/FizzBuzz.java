package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            String curStr = "";


            if (divisibleBy3) {
                curStr += "Fizz";
            }

            if (divisibleBy5) {
                curStr += "Buzz";
            }

            if (curStr.isEmpty()) {
                curStr += String.valueOf(i);
            }

            results.add(curStr);
        }

        return results;
    }

    public static void main(String[] args) {
        int input = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> results = fizzBuzz.fizzBuzz(input);

        results.forEach(System.out::println);
    }
}
