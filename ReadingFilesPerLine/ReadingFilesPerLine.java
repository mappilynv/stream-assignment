package ReadingFilesPerLine;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {



    public static List<String> read(String file){
        List<String> files = new ArrayList<>();
        try{
            Files.lines(Paths.get(file))
                    .forEach(f -> files.add(f));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        files.forEach(System.out::println);
        return files;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        read("src/ReadingFilesPerLine/file.txt");
        String fileToRead = scanner.nextLine();
        read(fileToRead);
    }

}
