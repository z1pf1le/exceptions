import java.io.File;

public class Main {
    public static void main(String[] args) {
        int[]    arr = new int[20];

        try {
            arr[10] = 20;
        } catch (Exception e) {
            System.out.println("нет такого элемента"); //провоцирется исключение запросом
            // несуществующего элемента массива
        }

        finally {
            System.out.println("из finally");
        }
        System.out.println(arr[190]);

    }
}