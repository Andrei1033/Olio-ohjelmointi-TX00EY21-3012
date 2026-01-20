public class Customer {
    private int id;
    private long startTime;
    private long endTime;
    private static int costomerCounter = 1;

    public Customer() {
        this.id = costomerCounter++;
    }

    public int getId() {
        return id;
    }

    public void enterTime(){
        startTime = System.currentTimeMillis();
    }
    public void leaveTime(){
        endTime = System.currentTimeMillis();
    }


    public int Elapsed(){
        return (int)(endTime - startTime)/3000;
    }
    public static void main(String[] args) {
        Customer c = new Customer();
        Customer c2 = new Customer();

        System.out.println("asiakas " + c.getId() + " saapui");
        System.out.println("on olemsaas toinenkin asiakas " );
        c.enterTime();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("Sleep interrupted");
        }
        c.leaveTime();
        System.out.println("asiakas valmis");

        System.out.println("Aika asiakale kului: " + c.Elapsed());

    }
}
