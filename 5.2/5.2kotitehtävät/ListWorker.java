public class ListWorker implements Runnable {
    private SafeList list;
    private int id;
    private int operations;

    public ListWorker(SafeList list, int id, int operators) {
        this.list = list;
        this.id = id;
        this.operations = operators;
    }

    @Override
    public void run() {
        for (int i = 0; i < operations; i++) {
            String value = "Worker-" + id + "-Value-" + i;
            list.add(value);

            if (i % 2 == 0) {
                list.remove(value);
            }
        }
        System.out.println("Worker " + id + " finished.");
    }
}
