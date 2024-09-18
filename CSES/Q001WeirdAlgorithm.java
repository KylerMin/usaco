import java.io.*;

public class Q001WeirdAlgorithm {
    static boolean debug = false;


    public static void main(String... arg) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        if (debug) r = new BufferedReader(new FileReader("in.txt"));

        PrintWriter pw = new PrintWriter(System.out);

        String aline = r.readLine();
        long input_number = Long.parseLong(aline);
        System.out.print(input_number + " ");
        while (input_number >1 ){
            if(input_number % 2 == 0){
                input_number = input_number / 2;
            }
            else {
                if (input_number % 2 != 0) {
                    input_number = input_number * 3 + 1;
                }
            }
            System.out.print(input_number + " ");
            if(input_number == 1){
                return;
            }
        }
    }
}