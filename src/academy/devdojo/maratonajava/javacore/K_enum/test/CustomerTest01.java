package academy.devdojo.maratonajava.javacore.K_enum.test;

import academy.devdojo.maratonajava.javacore.K_enum.domain.Customer;
import academy.devdojo.maratonajava.javacore.K_enum.domain.Customer.PaymentType;
import academy.devdojo.maratonajava.javacore.K_enum.domain.CustomerType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer_01 = new Customer("Rebecca", CustomerType.FISCAL_PERSON, PaymentType.DEBIT);
        Customer customer_02 = new Customer("Megan", CustomerType.LEGAL_PERSON, PaymentType.CREDIT);

        System.out.println(customer_01);
        System.out.println(customer_02);
    }
}
