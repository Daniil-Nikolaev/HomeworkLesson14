import java.io.*;

public class Copier {
    private File file;
    private File copy;

    public Copier(File file, File copy) {
        this.copy = copy;
        this.file = file;
    }

    public void copy() {

        try (InputStream inputStream = new FileInputStream(file);
             OutputStream outputStream = new FileOutputStream(copy)) {

            int num;

           while ((num = inputStream.read()) != -1) {
               outputStream.write(num);
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getPath(){
        return copy.getPath();
    }
    public int getLength(){
        return (int) copy.length();
    }
}
