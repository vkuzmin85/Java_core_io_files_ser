import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Install {
    private static Boolean error = true;
    private static String logFileName = "src/folders/Games/temp/temp.txt";
    private static StringBuilder sb = new StringBuilder();
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("y-M-d H:m:s");

    public Install() {
    }

    public static void createLogFile() {
        if (!error) {
            sb.append("Все файлы и каталоги созданы успешно\n");
        }
        fileWrite(logFileName, sb.toString());
    }

    public static void createDir(String folderName) {
        File dir = new File(folderName);
        String date;
        String info;
        if (dir.mkdir()) {
            error = false;
            date = dtf.format(LocalDateTime.now());
            info = date + " создан каталог " + dir.getAbsolutePath();
        } else {
            date = dtf.format(LocalDateTime.now());
            info = date + " не удалось создать каталог " + dir.getAbsolutePath();
        }

        sb.append(info + "\n");
    }

    public static void createFile(String fileName) {
        File myFile = new File(fileName);
        try {
            String date;
            String info;
            if (myFile.createNewFile()) {
                error = false;
                date = dtf.format(LocalDateTime.now());
                info = date + " создан файл " + myFile.getAbsolutePath();
            } else {
                date = dtf.format(LocalDateTime.now());
                info = date + " не удалось создать файл " + myFile.getAbsolutePath();
            }
            sb.append(info + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
    public static void fileWrite(String fileName, String text) {
        try {
            FileWriter writer = new FileWriter(fileName, false);
            writer.write(text);
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
