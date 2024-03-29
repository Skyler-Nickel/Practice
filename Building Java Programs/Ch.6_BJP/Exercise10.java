// Modify the preceding wordWrap method so that it outputs the newly wrapped text back
// into the original file.

import java.io.*;
import java.util.*;

public class Exercise10 {
    public static final int MAXIMUM_LINE = 60;

    public static void wordWrap(Scanner scan) throws FileNotFoundException {
        String s = "";
        String s2 = "";
        String s3 = "";
        while (scan.hasNextLine()) {
            s = scan.nextLine();
            for (int i = 0; i < s.length();) {
                if (i+MAXIMUM_LINE < s.length()) {
                    s2 = s.substring(i, i+MAXIMUM_LINE);
                } else {
                    s2 = s.substring(i, s.length());
                }
                i += MAXIMUM_LINE;
                s3 += s2 + "\n";
            }
        }
        System.out.println(s3);
        PrintStream output = new PrintStream(new File("exercise10.txt"));
        output.println(s3);
        output.close();
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("exercise10.txt"));
        wordWrap(scan);
        scan.close();
    }
}
