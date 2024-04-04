public class Test4 {
    public static void main(String[] args) {
        /*int[] array = {44, 21, 32, 43, 32, 32, 44, 43, 23};
        int[] copyArray = new int[array.length];


        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }

        for (int i = 0; i < copyArray.length; i++) {
            System.out.print(array[i] + " ");
        }*/

        int input = 5;

        for (int i = 0; i < input; i++) {

            for (int j = input - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = input - i - 1; j < input; j ++) {
                System.out.print("* ");
            }
            System.out.println();

        }




    }
}
