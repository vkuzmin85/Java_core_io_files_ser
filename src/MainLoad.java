public class MainLoad {
    public static void main(String[] args) {
        String path = "src/folders/Games/savegames/";
        Zip.openZip(path + "myzip.zip", path);
        System.out.println(SaveLoad.openProgress(path + "game2.dat"));
    }
}
