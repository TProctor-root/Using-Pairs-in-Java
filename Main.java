import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    
    public static <T, S> List <Pair<T, S>> problem1_mapToList(Map<T, S> c) {
        List<Pair<T, S>> x;
        S b;
        x = new ArrayList<>();
        T a;
        Pair<T, S> y;
        for(Map.Entry<T, S> z : c.entrySet()) {
        	b = z.getValue();
        	a = z.getKey();
            y = new Pair<T, S>(a, b);
            x.add(y);
        }
        return x;
    }
    
    public static <Y> String problem2_getElements(Iterable<Y> x) {
        Iterator<Y> z;
        String a = "";
        z = x.iterator();
        if(null == x.iterator() || null == x) {
            return a;
        }
        while(z.hasNext()) {
            a = a + z.next();
            if(z.hasNext()) {
                a = a + ", ";
            }
        }
        return a;
    }
    
    public static boolean problem3_isPalindrome(ArrayList x) {
        int i = 0;
        while(x.size() / 2 > i) {
            if(false == x.get(i).equals(x.get(x.size() - 1 - i))) {
                return false;
            }
            i++;
        }
        return true;
    }
    
    public static <Y extends Comparable<Y>> boolean problem4_isIncreasing(ArrayList<Y> x) {
        int i = 0;
        boolean z = true;
        while(x.size() - 1 > i) {
            if(0 < x.get(i).compareTo(x.get(i + 1))) {
                z = false;
                return z;
            }
            i++;
        }
        return z;
    }
    
    public static Pair<Integer, Integer> problem5_minmax(Integer[] x) {
        Integer b = x[0];
        int i = 1;
        Integer a = x[0];
        while(x.length > i) {
            if(0 < a.compareTo(x[i])) {
                a = x[i];
            }
            if(0 > b.compareTo(x[i])) {
                b = x[i];
            }
            i++;
        }
        return new Pair<Integer, Integer>(a, b);
    }

	public static void main(String[] args) {
		Map<String, Color> colors = new TreeMap<>();
        colors.put("Juliet", Color.BLUE);
        colors.put("Adam", Color.RED);
        colors.put("Eve", Color.BLUE);
        List<Pair<String, Color>> list = problem1_mapToList(colors);
        Iterator<Pair<String, Color>> iter = list.iterator();
        Pair<String, Color> item = iter.next();
        System.out.println(item.getFirst()); // Adam
        System.out.println(item.getSecond()); //java.awt.Color[r=255,g=0,b=0]
        item = iter.next();
        System.out.println(item.getFirst()); // Eve
        System.out.println(item.getSecond()); //java.awt.Color[r=0,g=0,b=255] // etc...
        
        System.out.println();
        
        String sentence = "Mary had a little lamb";
        Iterable<String> it = Arrays.asList(sentence.split(" ")); 
        System.out.println(problem2_getElements(it)); // Mary, had, a, little, lamb
        
        System.out.println();
        
        ArrayList<String> a = new ArrayList<>();
        a.add("apple");
        a.add("orange");
        a.add("apple");
        System.out.println(problem3_isPalindrome(a)); // true
        ArrayList<Color> b = new ArrayList<>();
        b.add(Color.RED);
        b.add(Color.GREEN);
        System.out.println(problem3_isPalindrome(b)); // false
        ArrayList<Color> c = new ArrayList<>();
        c.add(Color.RED);
        c.add(Color.GREEN);
        c.add(Color.BLUE);
        c.add(Color.GREEN);
        c.add(Color.RED);
        System.out.println(problem3_isPalindrome(c)); // true
        
        System.out.println();
        
        ArrayList<String> one = new ArrayList<>();
        one.add("cupcake");
        one.add("banana");
        one.add("apple");
        System.out.println(problem4_isIncreasing(one)); // false
        ArrayList<Integer> two = new ArrayList<>();
        two.add(2);
        two.add(4);
        two.add(4);
        two.add(6);
        two.add(8);
        System.out.println(problem4_isIncreasing(two)); // true
        
        System.out.println();
        
        Integer[] nums = { 10, 100, 50, 15, 8, 99 };
        Pair<Integer, Integer> mm = problem5_minmax(nums); 
        System.out.println(mm.getFirst()); // 8 
        System.out.println(mm.getSecond()); // 100
	}
}