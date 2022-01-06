import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class ARQuestion1 {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the size of the array :");
            int size = scan.nextInt();
            String[] array1 = new String[size];
            System.out.println("Please enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                array1[i] = scan.next();
            }
            List<String> li = new ArrayList<>(Arrays.asList(array1));
            for (int j = 0; j < array1.length; j++) {
                for (int k = j + 1; k < array1.length; k++) {
                    if (array1[j].equals(array1[k])) {
                        li.remove(k);
                    }
                }
            }
            System.out.println("The resultant array without any duplicates is : ");
            li.stream().forEach(y -> {
                System.out.print(y + "\t");
            });
        } catch (Exception e) {
            System.out.println("Its an exception !! Please try again !!");
        }

    }
}
