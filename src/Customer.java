import java.lang.Comparable;
public class Customer implements Comparable<Customer> {
    int custId;
    String custName, custAddress;

    public Customer(int custId, String custName, String custAddress){
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
    }


    public String toString() {

        return custId+ " "+custName+" "+custAddress;
    }


    @Override
    public int compareTo(Customer cust) {
        return custId - cust.custId;
    }
}
