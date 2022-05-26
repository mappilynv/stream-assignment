import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while (true){
            String inputsValue = scanner.nextLine();
            if(inputsValue.equals("end")){
               break;
            }
            inputs.add(inputsValue);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String inputsAnswer = scanner.nextLine();
        if(inputsAnswer.equals("n")){
            double averageNegative = inputs.stream()
                    .mapToInt(number -> Integer.valueOf(number))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("average of the negative numbers: " +averageNegative);
        } else {
            double averagePositive = inputs.stream()
                    .mapToInt(number -> Integer.valueOf(number))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("average of the negative numbers: " +averagePositive);
        }

    }

}
