import Models.*;
import java.util.*;
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Lehrer> teacherArray = new ArrayList<Lehrer>();

        Lehrer l = new Lehrer("lol", 0, 0 , "lel");

    teacherArray.add(l)  ;
    printLehrer(teacherArray);


    }
    public static void printLehrer( ArrayList<Lehrer> teacherArray){
        for(Lehrer k : teacherArray){
            if (k instanceof mitarbeiter){
                System.out.println( k);
            }
            else{
                System.out.println(" Es gibt keine Lehrer. ");
            }

        }

    }
}
