package src.javacore.Vio.test;

import java.io.File;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        boolean isCreated = file.delete();
        System.out.println("Created " + isCreated);
        boolean exists = file.exists();
        if (exists) {
            System.out.println("Deleted" + file.delete());
        }
    }
}