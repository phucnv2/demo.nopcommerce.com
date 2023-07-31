package helpers;

import java.io.File;

public class SystemsHelper {
    // hàm lấy đường dẫn tuyet đối của project
    public static String getCurrentDir() {
        String current = System.getProperty("user.dir") + File.separator ;
        return current;
    }
}
