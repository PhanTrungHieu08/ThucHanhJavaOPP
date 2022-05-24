import java.util.Scanner;

public class App30 {
    public static void main(String[] args) throws Exception {
        int number, soDu, tong =0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap so : ");
        number = sc.nextInt();
        for(;number>0;){
            soDu = number%10;
            number /= 10;
            tong += soDu;
        }
        System.out.println("Tong cac chu so = "+tong);
    }
}