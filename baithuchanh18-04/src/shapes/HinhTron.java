package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float banKinh;

    public HinhTron() {
        ten = "Hinh Tron";
    }

    public void nhapBanKinh() {
        System.out.println("Ban Kinh =");
        Scanner Scanner = new Scanner(System.in);
        banKinh = Scanner.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
}
