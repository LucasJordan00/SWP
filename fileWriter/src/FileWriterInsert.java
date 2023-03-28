import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class FileWriterInsert {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Path path = Paths.get("C:\\Users\\lucas\\Desktop\\HTL-1BHWII\\SWP\\input\\fileWriter\\"+args[0]);
        try {

            String str = args[1];
            byte[] bs = str.getBytes();
            Path writtenFilePath = Files.write(path, bs);
            System.out.println("Geschriebener Inhalt in file:\n"+ new String(Files.readAllBytes(writtenFilePath)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
