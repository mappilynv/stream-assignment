import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        //reading the input
        while (true){
            String inputsValue = scanner.nextLine();
            if(inputsValue.equals("end")){
                break;
            }
            inputs.add(inputsValue);
        }

        double average = inputs.stream()
                .mapToInt(number -> Integer.valueOf(number))
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " +average);

    }


}
