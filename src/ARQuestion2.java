import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class ARQuestion2 {

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
            Optional<Integer> maxNo = li.stream().max((i, j) -> i.compareTo(j));
            li.remove(li.indexOf(maxNo.get()));
            Optional<Integer> secMax = li.stream().max((i, j) -> i.compareTo(j));
            System.out.println("The second largest number is : "+secMax.get());
        } catch (Exception e) {
            System.out.println("Its an exception !! Please try again !!");
        }
    }
}
