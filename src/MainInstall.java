public class MainInstall {
    public static void main(String[] args) {
        Install.createDir("src/folders/Games/src");
        Install.createDir("src/folders/Games/res");
        Install.createDir("src/folders/Games/savegames");
        Install.createDir("src/folders/Games/temp");

        Install.createDir("src/folders/Games/src/main");
        Install.createDir("src/folders/Games/src/test");

        Install.createDir("src/folders/Games/res/drawables");
        Install.createDir("src/folders/Games/res/vectors");
        Install.createDir("src/folders/Games/res/icons");

        Install.createFile("src/folders/Games/src/main/Main.java");
        Install.createFile("src/folders/Games/src/main/Utils.java");
        Install.createFile("src/folders/Games/temp/temp.txt");

        Install.createLogFile();
    }
}