package turntabl.io;


public class PlasticState implements State {
    public String toString(){
        return "Plastic";
    }

    public void doFilter(Context context) {

        GarbageItemData.getPlasticItems();
        context.setState(this);

    }


}
