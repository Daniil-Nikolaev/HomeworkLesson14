import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите полный путь файла для копирования");
        String path = sc.nextLine();

        File file = new File(path);
        File copy=new File(file.getParent(),file.getName()+".copy");

        if(file.exists()) {
            Copier copier = new Copier(file, copy);
            copier.copy();
            System.out.println("Файл был скопирован в: " + copier.getPath());
            System.out.println("Размер файла: " + copier.getLength() + " байт");
        } else{
            System.out.println("Файл не найден");
        }

    }
}