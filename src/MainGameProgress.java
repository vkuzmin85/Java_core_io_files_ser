public class MainGameProgress {
    public static void main(String[] args) {
        String path = "src/folders/Games/savegames/";
        String list[] = new String[3];
        GameProgress gameProgress1 = new GameProgress(1, 2, 3, 0.5);
        GameProgress gameProgress2 = new GameProgress(2, 5, 6, 1.5);
        GameProgress gameProgress3 = new GameProgress(3, 1, 2, 2.5);
        SaveLoad.saveGame(gameProgress1, list[0] = path + "game1.dat");
        SaveLoad.saveGame(gameProgress2, list[1] = path + "game2.dat");
        SaveLoad.saveGame(gameProgress3, list[2] = path + "game3.dat");
        Zip.zipFiles(path + "myzip.zip", list);
    }
}