import java.util.Scanner;

public class YourInput {
    public static void yourInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение: ");
        String input = scanner.nextLine();

        System.out.println("Вы ввели: " + input);
    }
}
