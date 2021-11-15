package turntabl.io;



public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();


        PlasticState plasticState = new PlasticState();
        plasticState.doFilter(context);
        System.out.println("Current State is "+context.getState().toString());
        System.out.println();

        MetallicState metallicState = new MetallicState();
        metallicState.doFilter(context);
        System.out.println("Current State is "+context.getState().toString());
        System.out.println();

        HazardousState hazardousState = new HazardousState();
        hazardousState.doFilter(context);
        System.out.println("Current State is "+context.getState().toString());



    }
}
