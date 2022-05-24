package App72;

public class main72 {

    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien();
        SinhVien sinhVien2 = new SinhVien();

        sinhVien1.setTen("");
        sinhVien2.setTuoi(17);

        System.out.println("Sinh viên 1 có tên: " + sinhVien1.getTen() + ", tuổi: " + sinhVien1.getTuoi());
        System.out.println("Sinh viên 2 có tên: " + sinhVien2.getTen() + ", tuổi: " + sinhVien2.getTuoi());
    }
}
