import java.util.Scanner;

public class soThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số: ");
        int so = sc.nextInt();
        String[] soThanhChu = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "" +
                "Chín"};
        if (so < 10) {
            System.out.println(soThanhChu[so]);
        } else if (so < 1000) {
            int hangTram = so / 100;
            int hangChuc = (so % 100) / 10;
            int hangDonVi = so % 10;
            if (hangTram == 0) {
                if (hangChuc == 1) {
                    if (hangDonVi == 0) {
                        System.out.println("Mười");
                    } else if (hangDonVi == 5) {
                        System.out.println("Mười Lăm");
                    } else {
                        System.out.println("Mười " + soThanhChu[hangDonVi]);
                    }
                } else {
                    if (hangDonVi == 0) {
                        System.out.println(soThanhChu[hangChuc] + " mươi");
                    } else {

                        System.out.println(soThanhChu[hangChuc] + " mươi " + soThanhChu[hangDonVi]);
                    }
                }
            } else {
                if (hangChuc == 1) {
                    if (hangDonVi == 0) {
                        System.out.println(soThanhChu[hangTram] + " trăm " + "Mười");
                    } else if (hangDonVi == 5) {
                        System.out.println(soThanhChu[hangTram] + " trăm " + "Mười Lăm");
                    } else {
                        System.out.println("Mười " + soThanhChu[hangDonVi]);
                    }
                } else if (hangChuc == 0) {
                    if (hangDonVi == 5) {
                        System.out.println(soThanhChu[hangTram] + " trăm " + "lẻ Lăm");
                    } else if (hangDonVi == 0) {
                        System.out.println(soThanhChu[hangTram] + " trăm ");
                    } else {
                        System.out.println("lẻ " + soThanhChu[hangDonVi]);
                    }
                } else {
                    if (hangDonVi == 0) {
                        System.out.println(soThanhChu[hangTram] + " trăm " + soThanhChu[hangChuc] + " mươi");
                    } else {

                        System.out.println(soThanhChu[hangTram] + " trăm " + soThanhChu[hangChuc] + " mươi " + soThanhChu[hangDonVi]);
                    }
                }
            }
        }
    }
}
