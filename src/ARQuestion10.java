import java.util.Scanner;

public class ARQuestion10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        int size = scan.nextInt();
        int[] array1 = new int[size];
        System.out.println("Please enter the elements in the array : ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (scan.nextInt());
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                sum = array1[i] + array1[j];
                if (Math.abs(sum) < min) {
                    min = sum;
                    System.out.println("The sum value that is closest to 0 is : " + min);
                }
            }
        }
    }
}
