public class Main {
    public static void main(String[] args) {
        DirMaker dirs = new DirMaker();
        FileMaker files = new FileMaker();
//        В папке Games создайте несколько директорий: src, res, savegames, temp.

        dirs.mkNewDir("src");
        dirs.mkNewDir("res");
        dirs.mkNewDir("savegames");
        //                В каталоге src создайте две директории: main, test.
        dirs.mkNewDir("src\\main");
        dirs.mkNewDir("src\\test");
//                В подкаталоге main создайте два файла: Main.java, Utils.java.
        files.MakeFile("Main.java", "src\\main");
        files.MakeFile("Utils.java", "src\\main");
//                В каталог res создайте три директории: drawables, vectors, icons.
        dirs.mkNewDir("res\\drawables");
        dirs.mkNewDir("res\\vectors");
        dirs.mkNewDir("res\\icons");

    }
}