import java.util.Arrays;
import java.util.Scanner;

public class ARQuestion8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the array :");
        int size = scan.nextInt();
        Integer[] array1 = new Integer[size];
        System.out.println("Please enter the elements of the array : ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = new Integer(scan.nextInt());
        }
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i].equals(array1[j])) {
                    array1[j] = 0;
                }
            }
        }
        long length = Arrays.stream(array1).filter(x -> x != 0).count();
        System.out.println("The length of the new array without duplicates : " + length);
    }
}
