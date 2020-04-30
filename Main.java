import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    static final File ip = new File("input.txt");
    static final File op = new File("output.txt");
    static Scanner scan;
    static PrintStream print;

    /**
     * All IO operations are perfored from ip and op files. Use scan.hasNext()
     * function before accepting input from Scanner object.
     */
    private static void solve(int t1) {
        System.out.println(t1);
    }

    public static void main(String[] args) throws FileNotFoundException {
        scan = new Scanner(ip);
        print = new PrintStream(op);
        System.setOut(print);

        int t = scan.nextInt(), t1 = 1;
        // scan.nextLine();
        while (t1 <= t) {
            solve(t1);
            t1++;
        }

    }
}