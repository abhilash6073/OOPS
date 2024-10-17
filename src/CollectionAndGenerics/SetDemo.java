package CollectionAndGenerics;

import java.util.Set;

public class SetDemo {
    Set<Integer> set;

    public SetDemo(Set<Integer> set) {
        this.set = set;
    }

    public void setActions(){
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(null);
        System.out.println("Size of the set: " + set.size());
        System.out.println("Print set: " + set);
    }
}
