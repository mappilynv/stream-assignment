import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class LimitedNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> userInputs = new ArrayList<>();

        while (true){
            String inputsValue = scanner.nextLine();
            if(Integer.valueOf(inputsValue) < 0){
                break;
            }
            userInputs.add(Integer.valueOf(inputsValue));
        }
        userInputs.stream()
                .filter(value -> 0 < value && value < 6 )
                .forEach(num -> System.out.println(num));
    }
}

