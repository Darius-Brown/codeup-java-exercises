import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        
        List<String> groceries = Arrays.asList("coffee","milk", "sugar");
        System.out.println("groceries = " + groceries);

        Files.write(groceriesPath, groceries);






    }
}