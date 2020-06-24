package inputOutput;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\02max\\Desktop\\Prog\\JAVA\\inputOutput\\src\\inputOutput\\test");
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()) {
            System.out.println(br.readLine());
        }
        br.close();
        FileWriter fw = new FileWriter(f1, true);
        PrintWriter pw = new PrintWriter(fw);
        for(int i = 8; i < 15; i++) {
            pw.print("Test " + i + " \n");
        }
        pw.flush();
        pw.close();

    }
}
