package demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("abc");
        assertTrue("The list should have size 1", list.size() == 1);
    }
}