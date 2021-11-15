package turntabl.io;

public class HazardousState implements State {
    public String toString(){
        return "Hazardous";
    }

    public void doFilter(Context context) {

        GarbageItemData.getHazardousItems();
        context.setState(this);

    }


}
