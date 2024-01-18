package HW5.task2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "./src/main/java/HW5/task2/file.txt";
        Files.createFile(Paths.get(path));
        File file = new File(path);
        FileOutputStream fos = new FileOutputStream(file);
        PrintWriter pw = new PrintWriter(fos);
        int[][] array = createArray();
        for (int[] ints : array) {
            for (int anInt : ints) {
                pw.print(anInt);
            }
        }
        pw.close();
        fos.close();
    }

    private static int[][] createArray() {
        Random random = new Random();
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(4);
            }
        }
        return array;
    }
}
