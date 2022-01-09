import java.util.Arrays;
import java.util.Scanner;

public class ARQuestion9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        int size = scan.nextInt();
        Integer[] array1 = new Integer[size];
        System.out.println("Please enter the elements in the array : ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = new Integer(scan.nextInt());
        }
        Arrays.sort(array1);
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (Arrays.toString(array1).contains(String.valueOf(array1[i] + array1[j]))) {
                    System.out.println("The sum of the two elements equal to an integer in the array is : ");
                    System.out.println(array1[i] + " + " + array1[j] + " = " + (array1[i] + array1[j]));
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No such combination present in this array.");
        }
    }
}
