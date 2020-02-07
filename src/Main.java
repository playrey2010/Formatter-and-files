import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        try {
            Formatter formatter = new Formatter("C:\\Users\\playr\\Documents\\newfile.txt");
        } catch (Exception e) {
            System.out.println("There was an error while creating the file. ");
        }
    }
}
