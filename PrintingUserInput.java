import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> userInputs = new ArrayList<>();

        while (true){
            String inputsValue = scanner.nextLine();
            if(inputsValue.equals("")){
                break;
            }
            userInputs.add(inputsValue);
        }
        String combined = userInputs.stream()
                .reduce("", (previousString, inputs) -> previousString + inputs + "\n");
        System.out.println(combined);
    }

}
