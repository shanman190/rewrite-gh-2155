package demo;

import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.List;

import demo.utils.Thingie;

public class Sample1 {
    public static void main(String[] args) {
        Thingie thing = new Thingie();
        List<String> list = new ArrayList<>();
        sort(list);
        System.out.println(list);
    }
}
