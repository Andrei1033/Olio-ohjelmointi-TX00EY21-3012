package P_6;

import P_5.CustomerGenerator;
import P_5.ServicePoint;

public class P_6Test {
    public static void main(String[] args) {

        ServicePointUpdate servicePoint = new ServicePointUpdate();

        CustomerGeneratorForTask6.generate(servicePoint, 5);

        servicePoint.service();

        System.out.println("\nAverage service time (ms): " + servicePoint.getAverageServiceTime()
        );
    }
}
