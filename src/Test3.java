import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        /*int min = scanner.nextInt();
        if (999 < min) {
            int count = 0;
            int temp = min;
            int splitDigit = min;

            while (temp > 0) {
                temp = temp / 10;
                count++;
            }


            int[] array = new int[count];
            for (int i = 0; i < array.length; i++) {
                array[i] = splitDigit % 10;
                splitDigit /= 10;
            }


            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

        }*/


        int[] array = {102, 1, 23, 32, 32, 43, 43, 1, 98};
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(array[i] + " ");
            }
        }






    }
}
