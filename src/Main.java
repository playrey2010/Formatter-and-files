import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        try {
            Formatter formatter = new Formatter("C:\\Users\\[username]\\Documents\\newfile.txt"); // Change username field
            formatter.format("%s %s", "Hello", "World! ");
            formatter.format("%s", "My name is Slim Shady. ");
            formatter.close();
        } catch (Exception e) {
            System.out.println("There was an error while creating the file."); // IMPORTANT: when the error happens, the file is overwritten as blank!
        }
    }
}
