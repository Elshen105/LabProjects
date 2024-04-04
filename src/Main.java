import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {15, 250,23,457,456,321,875,246,190,234,800,9837,12351};
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int digitSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (n < array[i] && array[i] < m) {
                int temp = array[i];

                while (temp > 0) {
                    int lastNumber = temp % 10;
                    digitSum += lastNumber;
                    temp /= 10;
                }

                if (digitSum > 7) {
                    System.out.println(array[i]);
                }

                digitSum = 0;


            }


        }



    }
}
