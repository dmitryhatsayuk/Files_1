import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMaker {

    public void MakeFile(String name, String path) {
        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        DirMaker pathDir = new DirMaker();
        pathDir.mkNewDir(path);
        String pathName = STR."\{path}\\\{name}";
        File newFile = new File("C:\\Users\\dmitr\\Games", pathName);
        try {
            if (newFile.createNewFile()) {
                try (FileWriter writer = new FileWriter("C:\\Users\\dmitr\\Games\\tmp\\Temp.txt", true)) {
                    writer.write(currentDateTime + " " + "\\" + path + "\\" + name + " успешно создан");
                    writer.write('\n');
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
