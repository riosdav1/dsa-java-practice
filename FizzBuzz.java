import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3)); // [1,2,Fizz]
        System.out.println(fizzBuzz(5)); // [1,2,Fizz,4,Buzz]
        System.out.println(fizzBuzz(15)); // [1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz]
    }

    private static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String value = "";
            if (i % 3 == 0) {
                value = "Fizz";
            }
            if (i % 5 == 0) {
                value += "Buzz";
            }
            if (value.isEmpty()) {
                value = String.valueOf(i);
            }
            answer.add(value);
        }
        return answer;
    }
}
