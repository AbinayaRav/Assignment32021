import java.util.*;

public class ARQuestion3 {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the size of the array :");
            int size = scan.nextInt();
            Integer[] array1 = new Integer[size];
            System.out.println("Please enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                array1[i] = scan.nextInt();
            }
            List<Integer> li = new ArrayList<>(Arrays.asList(array1));
            Optional<Integer> minNo = li.stream().min((i, j) -> i.compareTo(j));
            li.remove(li.indexOf(minNo.get()));
            Optional<Integer> secMin = li.stream().min((i, j) -> i.compareTo(j));
            System.out.println("The second smallest number is : "+secMin.get());
        } catch (Exception e) {
            System.out.println("Its an exception !! Please try again !!");
        }
    }
}
