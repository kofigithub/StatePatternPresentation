package turntabl.io;

public class GarbageItem {
    private int ID;
    private String Name;
    private Type type;
    private Double weight;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public GarbageItem(int id, String name, Type type,Double weight) {
        this.ID = id;
        this.Name = name;
        this.type = type;
        this.weight = weight;
    }


}
