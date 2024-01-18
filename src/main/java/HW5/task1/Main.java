package HW5.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String backupPath = "./src/main/java/HW5/task1/backup";
        String sourcePath = "./src/main/java/HW5/task1/test";
        Path target = Paths.get(backupPath);
        Path source = Paths.get(sourcePath);
        Files.createDirectory(target);
        File[] files = source.toFile().listFiles();
        for (File file : files) {
            if (!Files.isDirectory(file.toPath())) {
                Files.copy(Paths.get(sourcePath + "/" + file.getName()),
                        Paths.get(backupPath + "/" + file.getName()));
            }
        }
    }
}
