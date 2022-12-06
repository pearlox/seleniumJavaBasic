import java.io.*;

public class FileHandling {

    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("G://Demo.txt");
            FileReader fileReader = new FileReader("G://Demo.txt");
            int i;

            while((i=fileReader.read())!= -1) {
                System.out.println((char)i);
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader("G://Demo.txt"));
            String s;
            while((s=bufferedReader.readLine())!=null) {
                System.out.println(s);
            }

            s = "line4";
            bufferedWriter = new BufferedWriter(new FileWriter("G://Demo.txt"));
            bufferedWriter.write(s);
            bufferedWriter.flush();

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }
    }
}
