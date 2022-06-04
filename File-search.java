import java.io.File;
import java.util.ArrayList;

public class Files {
    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        searchFiles(new File (pathname: "D:\\"), fileList);
        for(File file: fileList) {
            System.out.println(file.getAbsolutePath());
        }
    }
//C каждой папкой нужно сделать одну и ту же последовательность операций. 
//Функция вызывает сама себя.
    private static void searchFiles(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            System.out.println("searching at: " + rootFile.getAbsolutePath());
            File[] directoriyFiles = rootFile.listFiles();
            if (directoriyFiles != null) {
                for(File file: directoriyFiles) {
                    if(file.isDirectory()) {
                        searchFiles(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
    
}
