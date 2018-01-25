import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Main.run();
    }

    private static void run() throws FileNotFoundException {

        Scanner in;
        PrintWriter out = null;
        String s = null;
        String t = null;

        in = new Scanner(new File("INPUT.TXT"));
        out = new PrintWriter(new File("OUTPUT.TXT"));
        s = in.nextLine();
        t = in.nextLine();
        if (s.length() > t.length()) {
            out.print("NO");
            out.close();
        }
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
            if (j==s.length()){
                break;
            }
        }
        if (j==s.length()){
            out.print("YES");
            out.close();
        } else {
            out.print("NO");
            out.close();
        }

    }
}


