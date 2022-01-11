import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ARQuestion5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        System.out.println("Please enter the elements of the array where 0's need to be pushed to the end and sorted in Relative order  :");
        while (scan.hasNextInt()) {
            li.add(new Integer(scan.nextInt()));
        }
        l2 = li.stream().filter(n -> n == 0).collect(Collectors.toList());
        li.sort(Comparator.naturalOrder());
        li.removeAll(l2);
        li.addAll(l2);
        System.out.println("The resultant list is : " + li);


       /* Integer[] array1 = new Integer[]{1,2,3,0,0,4,8};
        Arrays.stream(array1).filter(a -> a==0).forEach(System.out::println);
        List<Integer> list = new ArrayList<>(Arrays.asList(array1));
        li.stream().filter(b -> b==0).forEach(System.out::println);*/

        //System.out.println(li);
    }
}
