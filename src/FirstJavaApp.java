import shop.Customer;
import shop.VIPCustomer;

import java.util.Arrays;

public class FirstJavaApp {
    public static void main(String[] args){
        Customer customer = new VIPCustomer();
        customer.setName("Isaac");
        customer.setInterests(Arrays.asList("coding"));

        System.out.println(customer.getName() + " loves " + customer.getInterests().get(0));

    }
}
