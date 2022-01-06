import java.util.*;
import java.util.stream.Collectors;

public class ARQuestion6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        int size = scan.nextInt();
        Integer[] array1 = new Integer[size];
        System.out.println("Please enter the elements of the array where duplicates are removed and zero at the end  :");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = new Integer(scan.nextInt());
        }
        Arrays.sort(array1);
        for (int k = 0; k < array1.length; k++) {
            for (int j = k + 1; j < array1.length; j++)
                if (array1[k].equals(array1[j])) {
                    array1[j] = 0;
                }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] == 0) {
                    if (array1[j] != 0) {
                        array1[i] = array1[j];
                        array1[j] = 0;
                    }
                }
            }
        }
        System.out.println("The Resultant array is :");
        Arrays.stream(array1).forEach(System.out::println);

    }
}
