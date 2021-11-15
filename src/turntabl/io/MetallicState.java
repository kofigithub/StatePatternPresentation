package turntabl.io;


public class MetallicState implements State {


    public String toString(){
        return "Metallic";
    }
    public void doFilter(Context context) {

        GarbageItemData.getMetallicItems();
        context.setState(this);

    }



}

