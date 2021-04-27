

import com.github.skjolber.packing.*;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // initialization
        List<Container> containers = new ArrayList<Container>();
        containers.add(new Container(10, 10, 3, 100)); // x y z and weight
        Packager packager = LargestAreaFitFirstPackager.newBuilder().withContainers(containers).build();

        List<BoxItem> products = new ArrayList<BoxItem>();
        products.add(new BoxItem(new Box("Foot", 6, 10, 2, 25), 1));
        products.add(new BoxItem(new Box("Leg", 4, 10, 1, 25), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));



        // match a single container
//        Container match = packager.pack(products);
        int maxContainers = 5;
        List<Container> fits = packager.packList(products, maxContainers);
        System.out.println(1);
    }
}
