package App71;

public class main71 {

    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();

        hinhTron.setBanKinh(10);

        float chuVi = hinhTron.tinhChuVi();
        float dienTich = hinhTron.tinhDienTich();
        System.out.println("Chu vi hình tròn: " + chuVi + "; và diện tích: " + dienTich);
    }
}
