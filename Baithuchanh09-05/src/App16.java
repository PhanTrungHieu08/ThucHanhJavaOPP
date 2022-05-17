import java.util.ArrayList;

public class App16 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrListString = new ArrayList<>();

        arrListString.add("java");
        arrListString.add("PHP");
        arrListString.add("C#");
        arrListString.add("C++");
        System.out.println("Cac phan tu co trong arrListString la :");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.println(arrListString.get(i) + "\t");
        }
    }
}