package other;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Contact {

    public static void printFile(Path filePath) throws IOException {

        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d %s", i + 1, fileContents.get(i));
        }
    }

    public static void searchFile(Path filePath) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the name you would like to search for");
        String input = sc.nextLine();

        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size(); i++) {
            if (fileContents.get(i).contains(input)){
                System.out.printf("%d %s", i + 1, fileContents.get(i));
            }
        }
    }



    //append to contacts.txt
    public static void main(String[] args) throws IOException {

        System.out.println();
        //Print file

        Path filepathtoList = Paths.get("./src/other/Contact.txt");


        System.out.println("filepathtoList = " + filepathtoList);

        System.out.println("Files.exists() = " + Files.exists(filepathtoList));

        printFile(filepathtoList);

        //Setting up file path

        String directory = "./src/other";

        String filename = "Contact.txt";

        Path dataDirectory = Paths.get(directory);

        Path dataFile = Paths.get(directory);

        System.out.println("dataFile = " + dataFile);

        if(Files.notExists(dataDirectory)) {

            Files.createDirectories(dataDirectory);
        }

        if (Files.notExists(dataFile)){

            Files.createFile(dataFile);
        }

        //APPEND to contact list
        Path contactPath = Paths.get(directory, filename);

        System.out.println("contactPath = " + contactPath);

        List<String> newContact = Arrays.asList("KL | 555-555-5555 ");
        System.out.println("newContact = " + newContact);

        Files.write(contactPath, newContact, StandardOpenOption.APPEND);
        searchFile(filepathtoList);
    }
}