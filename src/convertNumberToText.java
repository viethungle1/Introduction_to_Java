import java.util.Scanner;

public class convertNumberToText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int a = number / 100;
        int b = (number % 100) / 10;
        int c = (number % 100) % 10;
        String strC;
        if (number<10) {
            switch (c) {
                case 1:
                    strC = "one";
                    System.out.print(strC);
                    break;
                case 2:
                    strC = "two";
                    System.out.print(strC);
                    break;
                case 3:
                    strC = "three";
                    System.out.print(strC);
                    break;
                case 4:
                    strC = "four";
                    System.out.print(strC);
                    break;
                case 5:
                    strC = "five";
                    System.out.print(strC);
                    break;
                case 6:
                    strC = "six";
                    System.out.print(strC);
                    break;
                case 7:
                    strC = "seven";
                    System.out.print(strC);
                    break;
                case 8:
                    strC = "eight";
                    System.out.print(strC);
                    break;
                case 9:
                    strC = "nine";
                    System.out.print(strC);
                    break;
                case 0:
                    strC = "";
                    System.out.print(strC);
                    break;
            }
        }
        if (number >= 10 && number < 20) {
            switch (c) {
                case 1:
                    System.out.print("eleven");
                    break;
                case 2:
                    System.out.print("twelve");
                    break;
                case 3:
                    System.out.print("thirteen");
                    break;
                case 4:
                    System.out.print("fourteen");
                    break;
                case 5:
                    System.out.print("fifteen");
                    break;
                case 6:
                    System.out.print("sixteen");
                    break;
                case 7:
                    System.out.print("seventeen");
                    break;
                case 8:
                    System.out.print("eighteen");
                    break;
                case 9:
                    System.out.print("nineteen");
                    break;
                case 0:
                    System.out.print("ten");
                    break;

            }
        }
        if (number >= 20 && number < 100 && c<10) {
            switch (b) {
                case 1:
                    System.out.print("and");
                    break;
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("fourty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
                case 0:
                    System.out.print("and");
                    break;
            }
        }
    }
}
