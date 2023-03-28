import java.io.File;

public class FileCreator {
    public static void main(String[] args) {
        try {

            // Get the file
            File f = new File("C:\\Users\\lucas\\Desktop\\HTL-1BHWII\\SWP\\input\\fileWriter\\examp.txt");

            // Create new file
            // Check if it does not exist
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
