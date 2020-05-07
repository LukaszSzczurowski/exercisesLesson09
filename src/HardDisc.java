public class HardDisc extends Components {

    private int capacity;

    public HardDisc(String name, String producer, String id, int capacity) {
        super(name, producer, id);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
