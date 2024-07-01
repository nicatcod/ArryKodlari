import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//n tam ədəddən ibarət massiv verilir.
// Onun bütün ən böyük elementlərinin qiymətini ən kiçiklə, ən kiçiklərini isə ən böyüklə əvəzləyin.
        Scanner scanner = new Scanner(System.in);{
            System.out.print("Daxil etdiyin ededin sayi:");
        }
        int n = scanner.nextInt();{
            System.out.println("Ededleri daxil et:");
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];

            }

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                arr[i] = min;
            } else if (arr[i] == min) {
                arr[i] = max;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}