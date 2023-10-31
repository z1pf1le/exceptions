import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Input2File {
    public static void input2file() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение: ");
        String input = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(input);
            writer.close();
            System.out.println("Значение успешно записано в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
