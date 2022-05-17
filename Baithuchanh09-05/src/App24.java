import java.util.ArrayList;
import java.util.Scanner;;

public class App24 {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        int n;// so phan tu cua mang
        System.out.println("Nhap so phan tu cua ArrayList:");
        n = scanner.nextInt();
        ArrayList<Integer> arrlistNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ":");
            number = scanner.nextInt();
            arrlistNumbers.add(number);

        }
        int max = arrlistNumbers.get(0);
        for (int i = 1; i < arrlistNumbers.size(); i++) {
            if (arrlistNumbers.get(i).compareTo(max) > 0) {
                max = arrlistNumbers.get(i);
            }
        }
        System.out.println(("Phan tu lon nhat trong arrListNumbers la:" + max));

    }
}
