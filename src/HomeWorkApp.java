public class HomeWorkApp {
    public static void main(String[] args) {

        System.out.println(addTwoNumbers(10, 6));
        printInteger(-7);
        System.out.println(addIntegerNumber(100));
        printMessageInt();
        System.out.println(theLeapYear(2021));
    }

    //1
    public static boolean addTwoNumbers(int a, int b) {

        return a + b >= 10 && a + b <= 20;
    }

    //2
    public static void printInteger(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //3
    public static boolean addIntegerNumber(int a) {
        return a < 0;
    }

    //4
   public static void printMessageInt() {
        for (int a = 0; a < 10; a++) {
            System.out.println("Четвертое задание");
        }
        }
   //5
    public static boolean theLeapYear (int year) {
        return year %4 == 0 || year %100 == 0 && year %400 == 0;
    }

   }
//комментарий1