import java.util.ArrayList;
public class SafeList {
    private ArrayList<Object> list;

    public SafeList() {
        list = new ArrayList<>();
    }

    public synchronized void add(String item){
        list.add(item);
    }
    public synchronized boolean remove(String item){
        return list.remove(item);
    }
    public synchronized int size(){
        return list.size();
    }
}
