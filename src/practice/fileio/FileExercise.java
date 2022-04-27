package practice.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileExercise {
//    public static void main(String[] args) throws IOException {
//        String directory = "data";
//        String filename = "info.txt";
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        if (Files.notExists(dataDirectory)) {
//            try {
//                Files.createDirectories(dataDirectory);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        if (! Files.exists(dataFile)) {
//            Files.createFile(dataFile);
//        }
//    }

//    public static void main(String[] args) throws IOException {
//        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
//        Path filepath = Paths.get("data", "groceries.txt");
//        Files.write(filepath, groceryList);
//    }

    //    Walkthrough Code
    public static void main(String[] args) {
        Path newPath = FileHelper.tryMakeFileDirectory();
//        FileHelper.tryWriteFile(newPath);

        List<String> linesToWrite = new ArrayList<>();
        linesToWrite.add("Hello");
        linesToWrite.add("Is it the weekend yet?");
        FileHelper.tryWriteFile(newPath, linesToWrite);

//        Do a null check(What???)
        for (String line: FileHelper.tryReadFile(newPath)) {
            System.out.println(line);
        }
    }


}
