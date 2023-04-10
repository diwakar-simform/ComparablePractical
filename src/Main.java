import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> custList = new ArrayList<>();

        custList.add(new Customer(1211,"Diwakar","Memnagar"));
        custList.add(new Customer(1209,"Hinal","Shelaj"));
        custList.add(new Customer(1222,"Nimit","Sanad Circle"));
        custList.add(new Customer(1201,"Hardeek","Prahlad Nagar"));
        custList.add(new Customer(1200,"Shruti","Shivranjani"));



        System.out.println("-------------Before Sorting--------------");
        custList.forEach(System.out::println);

        Collections.sort(custList);
        System.out.println("-------------After sorting---------------");
        custList.forEach(System.out::println);

    }
}
