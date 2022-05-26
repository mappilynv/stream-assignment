import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> positiveList = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        positiveList.forEach(System.out::println);
        return positiveList;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        //reading the input
        while (true){
            String inputsValue = scanner.nextLine();
            if(inputsValue.equals("end")){
                break;
            }
            inputs.add(Integer.valueOf(inputsValue));
        }
        positive(inputs);

    }

}
