import java.util.Scanner;

public class app81 {
    public static void main(String[] args) {
        int m, n; // khai báo số dòng và số cột của ma trận
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua ma tran: ");
        m = scanner.nextInt();
        System.out.println("Nhap vao so cot cua ma tran: ");
        n = scanner.nextInt();
        int A[][] = new int[m][n];// khai báo ma trận A có m dòng, n cột
        System.out.println("Nhap cac phan tu cho ma tran: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = scanner.nextInt();
            }
        }
        // tìm phần tử có giá trị lớn nhất trong ma trận
        // giả sử phần tử tại vị trí (0,0) là phần tử lớn nhất
        int max = A[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran = " + max);
    }

}
