import java.util.*;

public class ARQuestion11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        int size = scan.nextInt();
        Integer[] array1 = new Integer[size];
        List<Integer> list1 = new ArrayList<>();
        System.out.println("Please enter the elements in the array : ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = new Integer(scan.nextInt());
        }
        List<Integer> list2 = new ArrayList<>(Arrays.asList(array1));
        int val = 0;
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                val = list2.stream().max((x, y) -> x.compareTo(y)).get();
            } else {
                val = list2.stream().min((x, y) -> x.compareTo(y)).get();
            }
            list1.add(val);
            list2.remove(new Integer(val));
        }
        System.out.println("The resultant array with first max, second min, third min, fourth max and so on ..  is : ");
        list1.forEach(x -> {
            System.out.print(x + "\t");
        });
    }
}