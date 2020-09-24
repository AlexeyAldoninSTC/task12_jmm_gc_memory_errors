package org.example.app.heavy_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class HeavyObjectOne {
    static List<String> words = new ArrayList<>();
    private Integer[] array;
    private String name;
    private final List<Integer> list;
    private final Random random;
    private final Boolean condition;

    public HeavyObjectOne() {
        String temp = "";
        random = new Random();
        name = "";
        list = new ArrayList<Integer>();
        array = new Integer[1000_000];
        Arrays.fill(array, new Integer(300));
        condition = random.nextBoolean();
        for (int i = 1; i < 1000; i++) {
            name += random.nextInt(i);
            temp += random.nextInt();
            list.add(list.size() / 2, i % 31 + i);
            if (i % 100 == 0) {
                list.remove(list.size() / 2);
            }
            words.add(temp);
        }
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyObjectOne that = (HeavyObjectOne) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(list, that.list) &&
                Objects.equals(condition, that.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, list, condition);
    }

    @Override
    public String toString() {
        return "HeavyObjectOne{" +
                "name='" + name + '\'' +
                ", list=" + list +
                ", condition=" + condition +
                '}';
    }
}
