import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        filArray();
        System.out.println(" ");
        inArray();
        System.out.println(" ");
        multArray();
        System.out.println(" ");
        int[][] array4 = new int[4][4];
        fillDiagonal(array4);
        int[] array5 = createArray(8, 22);
        System.out.println(Arrays.toString(array5));
        minMaxArray();
        int[] array7 = {2, 3, 1, 7, 4, 6, 2, 1};
        System.out.print(checkSumArray(array7));

    }

    //1
    public static void filArray() {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {
                array1[i] = 0;
            } else array1[i] = 1;
            System.out.print(array1[i] + " ");
        }
    }

    //2
    public static void inArray() {
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
            System.out.print(array2[i] + " ");
        }
    }

    //3
    public static void multArray() {
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++)
            if (array3[i] < 6) {
                array3[i] *= 2;
                System.out.print(array3[i] + " ");
            }
    }

    //4 одна диагональ
    public static void fillDiagonal(int[][] array4) {
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                array4[i][4 - i - 1] = 1;
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }
    }

    //5
    public static int[] createArray(int len, int initialValue) {
        int[] array5 = new int[len];
        Arrays.fill(array5, initialValue);
        return array5;
    }

    //6
    public static void minMaxArray() {
        int[] array6 = {1, -3, 90, 120, 4, 700};
        int min = 0;
        int max = 0;
        for (int i : array6) {
            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
        }
        System.out.println("Минимальное значение: " + min + " " + "Максимальное значение: " + max);
    }
    /* ну или так:
    public static void minMaxArray () {
        int[] array6 = {1, -3, 90, 120, 4, 700};
        int min = 0;
        int max = 0;
        for (int i = 0; i<array6.length; i++) {
            if (array6[i] < min) {
                min = array6[i];
            } else if (array6[i] > max) {
                max = array6[i];
            }
        }
        System.out.println("Минимальное значение: " + min +" "+ "Максимальное значение: " +max);
    }
     */

    //7
   /* public static boolean checkSumArray(int[] array7) {
        int left = 0;
        int right = 0;
        for (int i : array7) {
            right += i;
        }
        for (int j : array7) {

            if (left == right) {

                return true;
            }
            left += j;
            right -= j;
        }
        return false;
    }*/

    public static boolean checkSumArray(int[] array7) {
        int left = 0;
        int right = 0;
        for (int i : array7) {
            right += i;
        }
        for (int i = 0; i < array7.length; i++) {

            if (left == right) {

                return true;
            }
            left += array7[i];
            right -= array7[i];
        } return false;
    }

        //8


        }


















