import java.io.*;

class ReadBff {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter data, enter 'S' to stop");

        try {
            int i;
            while ((i = br.read()) != 'S') {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
