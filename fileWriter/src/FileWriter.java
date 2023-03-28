import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriter {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\lucas\\Desktop\\HTL-1BHWII\\SWP\\input\\fileWriter\\example.txt");
        try {
            String str = "Test1 test test test";
            byte[] bs = str.getBytes();
            Path writtenFilePath = Files.write(path, bs);
            System.out.println("Geschriebener Inhalt in file:\n"+ new String(Files.readAllBytes(writtenFilePath)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
