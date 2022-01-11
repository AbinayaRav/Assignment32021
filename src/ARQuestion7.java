import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ARQuestion7 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int size = 0;
            while (true) {
                System.out.println("Please enter the size of the array (Array's size should be more than 1 : ");
                size = scan.nextInt();
                if (size < 2) {
                    System.out.println("The array size should be atleast 2 !! Please try again ");
                    continue;
                }
                break;
            }
            Integer[] array1 = new Integer[size];
            System.out.println("Please enter the elements in the array :");
            for (int i = 0; i < array1.length; i++) {
                array1[i] = new Integer(scan.nextInt());
            }
            Integer max = Arrays.stream(array1).max((k, j) -> k.compareTo(j)).get();
            Integer min = Arrays.stream(array1).min((k, j) -> k.compareTo(j)).get();
            Integer difference = max - min;
            System.out.println("The difference between the largest and smallest elements in the array is : ");
            System.out.println(max + " - " + min + " = " + difference);
        } catch (Exception e) {
            System.out.println("Exception occurred!!");
        }
    }
}
