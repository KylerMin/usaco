import java.io.*;
import java.util.StringTokenizer;
public class OneLevel {
    static boolean debug = true;
    static boolean usaco = false;
    static String task = "usaco-task";
    public static void main(String... arg) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        if (debug) r = new BufferedReader(new FileReader("in.txt"));
        if (usaco && !debug) r = new BufferedReader(new FileReader(task+".in"));
        PrintWriter pw = new PrintWriter(System.out);
        if (!debug && usaco) pw = new PrintWriter(new File(task+".out"));
        String aline = r.readLine();
        int num_friends = Integer.parseInt(aline);
        aline = r.readLine();
        StringTokenizer st = new StringTokenizer(aline);
        for (int place = 0; place < num_friends; place++) {
            String word = st.nextToken();
            int give = Integer.parseInt(word);
        }
    }
}