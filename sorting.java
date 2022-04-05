import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class sorting {
    public static void main(String[]args){
        Map<String,Integer> map = new HashMap<>();
       map.put("s",1020);
       map.put("b",393);
       map.put("a",459);
       map.put("z",200);
     map.forEach((s,z)-> System.out.println(z+"="+s));
     System.out.println("after sorting value");
     List<Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
     list.sort(Entry.comparingByValue());
     list.forEach(System.out::println);
  }
}