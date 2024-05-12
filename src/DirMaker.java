import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DirMaker {


    public void mkNewDir(String path) {
        File newDir = new File("C:\\Users\\dmitr\\Games", path);
        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        if (newDir.mkdir()) {
            mkNewDir("tmp");
            try (FileWriter writer = new FileWriter("C:\\Users\\dmitr\\Games\\tmp\\Temp.txt", true)) {
                writer.write(currentDateTime + " " + "\\" + path + " успешно создан");
                writer.write('\n');
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }
}

