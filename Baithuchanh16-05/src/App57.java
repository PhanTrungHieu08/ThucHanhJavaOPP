import java.util.LinkedHashSet;
import java.util.Set;

public class App57 {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("java");
        linkedHashSet.add("C++");
        linkedHashSet.add("java");
        linkedHashSet.add("PHP");
        for (String str : linkedHashSet) {
            System.out.println(str);
        }
    }
}
