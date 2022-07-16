import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    @Test
    public void test_problem1() {
        Map<String, Color> colors = new TreeMap<>();
        colors.put("Juliet", Color.BLUE);
        colors.put("Adam", Color.RED);
        colors.put("Eve", Color.BLUE);
        Main tester = new Main();
        List<Pair<String, Color>> list = tester.problem1_mapToList(colors);
        Iterator<Pair<String, Color>> iter = list.iterator();
        Pair<String, Color> item = iter.next();
        assertEquals("Adam", item.getFirst());
        assertEquals(Color.RED, item.getSecond());
        item = iter.next();
        assertEquals("Eve", item.getFirst());
        assertEquals(Color.BLUE, item.getSecond());
    }

    @Test
    public void test_problem2() {
        Main tester = new Main();
        String sentence = "Mary had a little lamb";
        Iterable it = Arrays.asList(sentence.split(" "));
        assertEquals("Mary, had, a, little, lamb", tester.problem2_getElements(it));
    }

    @Test
    public void test_problem3() {
        Main tester = new Main();
        ArrayList<String> a = new ArrayList<>();
        a.add("apple");
        a.add("orange");
        a.add("apple");
        assertEquals(true, tester.problem3_isPalindrome(a));
        ArrayList<Color> b = new ArrayList<>();
        b.add(Color.RED);
        b.add(Color.GREEN);
        assertEquals(false, tester.problem3_isPalindrome(b));
        ArrayList<Color> c = new ArrayList<>();
        c.add(Color.RED);
        c.add(Color.GREEN);
        c.add(Color.BLUE);
        c.add(Color.GREEN);
        c.add(Color.RED);
        assertEquals(true, tester.problem3_isPalindrome(c));
    }

    @Test
    public void test_problem4() {
        Main tester = new Main();
        ArrayList<String> a = new ArrayList<>();
        a.add("cupcake");
        a.add("banana");
        a.add("apple");
        assertEquals(false, tester.problem4_isIncreasing(a));
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(4);
        b.add(4);
        b.add(6);
        b.add(8);
        assertEquals(true, tester.problem4_isIncreasing(b));
    }

    @Test
    public void test_problem5() {
        Main tester = new Main();
        Integer[] nums = { 10, 100, 50, 15, 8, 99 };
        Pair<Integer, Integer> mm = tester.problem5_minmax(nums);
        assertEquals(8, mm.getFirst());
        assertEquals(100, mm.getSecond());
    }
}
