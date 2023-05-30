public class Toy {
    private int id;
    private String toyName;
    private int quantity;
    private int dropFrequency;

    public Toy(int id, String toyName, int quantity, int dropFrequency) {
        this.id = id;
        this.toyName = toyName;
        this.quantity = quantity;
        this.dropFrequency = dropFrequency;
    }

    @Override
    public String toString() {
        return "Toy{" + "id=" + id + ", toyName='" + toyName + '\'' + ", quantity=" + quantity + ", dropFrequency="
                + dropFrequency + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDropFrequency() {
        return dropFrequency;
    }

    public void setDropFrequency(int dropFrequency) {
        this.dropFrequency = dropFrequency;
    }

}
