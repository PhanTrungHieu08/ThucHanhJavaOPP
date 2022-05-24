import java.util.ArrayList;

public class App17 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrListIntegers = new ArrayList<>();

        arrListIntegers.add(0);
        arrListIntegers.add(7);
        arrListIntegers.add(1);
        arrListIntegers.add(9);
        System.out.println("Cac phan tu co trong arrListString la :");
        for (int number : arrListIntegers) {
            System.out.println(number + "\t");
        }
    }
}
