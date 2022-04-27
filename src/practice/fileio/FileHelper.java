package practice.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileHelper {
    public static Path tryMakeFileDirectory() {
        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }
            return dataFile;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

        public static void tryWriteFile(Path filePath, List<String> linesToWrite) {
            try {
                Files.write(filePath, linesToWrite, StandardOpenOption.APPEND);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        public static List<String> tryReadFile(Path filePath) {
        try {
            return Files.readAllLines(filePath);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
        }

}
