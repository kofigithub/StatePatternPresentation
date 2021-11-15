package turntabl.io;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GarbageItemData {
    static Long count;
    static Double wtcount;


    static List<GarbageItem> garblist = Arrays.asList(
            new GarbageItem(1, "Coca Cola", Type.Plastic,0.50),
            new GarbageItem(2, "Voltic Mineral Water", Type.Plastic,0.45),
            new GarbageItem(3, "Bucket", Type.Plastic,0.95),
            new GarbageItem(4, "Ideal Milk Tin", Type.Metallic,0.34),
            new GarbageItem(5, "Aerosol Spray Can", Type.Hazardous,0.25),
            new GarbageItem(6, "Lithium Sulphur Batteries", Type.Hazardous,0.20),
            new GarbageItem(7, "Saucepan", Type.Metallic,1.5),
            new GarbageItem(8, "Aluminium Foil", Type.Metallic,0.15),
            new GarbageItem(9, "Teaspoon", Type.Metallic,0.20));


    public static void getPlasticItems() {


        {
            //Fetching GarbageItem data as a Set
            Set<GarbageItem> garbset = garblist.stream()
                    .filter(c -> c.getType() == Type.Plastic)
                    .collect(Collectors.toSet());

            //Iterating Set
            for (GarbageItem gr : garbset) {
                System.out.println("Item ID: " + gr.getID() + "  Name: " + gr.getName() + "  Wt: " + gr.getWeight() + "kg");
            }

            count = garblist.stream().filter(c -> c.getType() == Type.Plastic)
                    .map(GarbageItem::getName)
                    .distinct().count();
            //.collect(Collectors.counting());

            wtcount = garblist.stream().filter(c -> c.getType() == Type.Plastic)
                    .map(GarbageItem::getWeight)
                    .mapToDouble(x -> x)
                    .sum();


            System.out.println("Plastic Count: " + count);
            System.out.println("Plastic Weight Count:  " + wtcount+"kg");


        }


    }

    public static void getMetallicItems() {


        {

            //Fetching GarbageItem data as a Set
            Set<GarbageItem> garbset = garblist.stream()
                    .filter(c-> c.getType()==Type.Metallic)
                    .collect(Collectors.toSet());

            //Iterating Set
            for(GarbageItem gr : garbset) {
                System.out.println("Item ID: "+gr.getID()+"  Name: "+gr.getName()+"  Wt: "+gr.getWeight()+"kg");
            }

            count = garblist.stream().filter(c -> c.getType() == Type.Metallic)
                    .map(GarbageItem::getName)
                    .distinct().count();
            //.collect(Collectors.counting());

            wtcount = garblist.stream().filter(c -> c.getType() == Type.Metallic)
                    .map(GarbageItem::getWeight)
                    .mapToDouble(x -> x)
                    .sum();

            System.out.println("Metallic Count: " + count);
            System.out.println("Metallic Weight Count:  " + wtcount+"kg");
        }



    }

    public static void getHazardousItems() {


        {

            //Fetching GarbageItem data as a Set
            Set<GarbageItem> garbset = garblist.stream()
                    .filter(c-> c.getType()==Type.Hazardous)
                    .collect(Collectors.toSet());

            //Iterating Set
            for(GarbageItem gr : garbset) {
                System.out.println("Item ID: "+gr.getID()+"  Name: "+gr.getName()+"  Wt: "+gr.getWeight()+"kg");

            }

            count = garblist.stream().filter(c -> c.getType() == Type.Hazardous)
                    .map(GarbageItem::getName)
                    .distinct().count();
            //.collect(Collectors.counting());

            wtcount = garblist.stream().filter(c -> c.getType() == Type.Hazardous)
                    .map(GarbageItem::getWeight)
                    .mapToDouble(x -> x)
                    .sum();

            System.out.println("Hazardous Count: " + count);
            System.out.println("Hazardous Weight Count:  " + wtcount+"kg");

        }



    }


}
