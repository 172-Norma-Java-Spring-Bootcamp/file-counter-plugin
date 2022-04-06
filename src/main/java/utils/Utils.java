package utils;

import java.io.File;
import java.util.Objects;

public class Utils {

    public static int getCountOfFiles(File directory) {
        int count = 0;
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isFile()) {
                count++;
            }
            if (file.isDirectory()) {
                count += getCountOfFiles(file);
            }
        }
        return count;
    }

}
