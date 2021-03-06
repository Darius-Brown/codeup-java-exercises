import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fileIO {
    public static void printFile(Path filePath) throws IOException {

        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d %s", i + 1, fileContents.get(i));
        }
    }

    public static void main(String[] args) throws IOException {
        Path filepathtoList = Paths.get("./src/movie/MoviesArray.java");


        System.out.println("filepathtoList = " + filepathtoList);

        System.out.println("Files.exists() = " + Files.exists(filepathtoList));

        printFile(filepathtoList);




        String directory = "./src/Groceries";

        String filename = "Groceries.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory);

        System.out.println("dataFile = " + dataFile);

        if(Files.notExists(dataDirectory)) {

            Files.createDirectories(dataDirectory);
        }

        if (Files.notExists(dataFile)){

            Files.createFile(dataFile);
        }


        Path groceriesPath = Paths.get(directory, filename);

        System.out.println("groceriesPath = " + groceriesPath);
        
        List<String> groceries = Arrays.asList("Orange Juice");
        System.out.println("groceries = " + groceries);

        Files.write(groceriesPath, groceries, StandardOpenOption.APPEND);


        //Replace

        List<String> lines = Files.readAllLines(Paths.get(directory, filename));
        List<String> newList = new ArrayList<>();

        for (String line : lines) {
            if (line.equals("coffee")) {
                newList.add("Blue Mountain Coffee");
                continue;
            }
            newList.add(line);
        }

        Files.write(Paths.get(directory, filename), newList);





    }
}