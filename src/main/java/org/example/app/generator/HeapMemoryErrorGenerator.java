package org.example.app.generator;

import org.example.app.heavy_object.HeavyObjectOne;

import java.util.ArrayList;
import java.util.List;

public class HeapMemoryErrorGenerator implements ErrorGenerator {
    public void generate (int amount) {
        List<HeavyObjectOne> heavyList = new ArrayList<HeavyObjectOne>();
        for (int i = 0; i < amount; i++) {
            heavyList.add(heavyList.size() / 2, new HeavyObjectOne());
            if (i % 53 == 6) {
                heavyList.remove(heavyList.size() / 2);
            }
            System.out.println("heavyList.size() = " + heavyList.size());
        }
        System.out.println("heavyList.size() = " + heavyList.size());
    }
}
