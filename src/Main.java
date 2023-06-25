import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length;
        int temp = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        length = scanner.nextInt();
        System.out.println("Dizinin elemanlarını giriniz : ");

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + ". elemanı : ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Sıralama : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}