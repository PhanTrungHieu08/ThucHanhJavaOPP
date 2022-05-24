import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;

public class App67 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> TreeSetInteger = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        TreeSetInteger.add(0);
        TreeSetInteger.add(3);
        TreeSetInteger.add(4);
        TreeSetInteger.add(2);
        TreeSetInteger.add(8);
        System.out.println("cac phan tu trong treeSetInteger: ");
        System.out.println(TreeSetInteger);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();
        if (!TreeSetInteger.contains(number)) {
            TreeSetInteger.add(number);
            System.out.println("them thanh cong");
            System.out.println("Cac phan tu trong treeSetInteger:");
            System.out.println(TreeSetInteger);
        } else {
            System.out.println("phan tu " + number + " da ton tai");
        }
    }
}
