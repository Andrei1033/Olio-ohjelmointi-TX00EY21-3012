package P_5;

// Main test class that demonstrates the queuing system with 5 customers
public class P_5Test {
    public static void main(String[] args) {

        ServicePoint servicePoint = new ServicePoint();

        CustomerGenerator.generate(servicePoint, 5);

        servicePoint.service();
    }
}
