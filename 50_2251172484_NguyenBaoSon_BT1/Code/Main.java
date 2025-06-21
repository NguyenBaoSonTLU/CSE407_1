public class Main {
    public static void main(String[] args) {
        // Create doctors
        BacSi bs1 = new BacSi("Nguyen Dac Hai");
        BacSi bs2 = new BacSi("Tran Minh Hoang");

        // Create patients
        BenhNhan bn1 = new BenhNhan("Lo Thi Mai");
        BenhNhan bn2 = new BenhNhan("Trinh Van An");

        // Assign patients to doctors and vice versa
        bs1.themBenhNhan(bn1);
        bs1.themBenhNhan(bn2);
        bn1.themBacSi(bs1);
        bn2.themBacSi(bs1);
        bn2.themBacSi(bs2);
        bs2.themBenhNhan(bn2);

        // Display lists
        bs1.HienThiDanhSach();
        bs2.HienThiDanhSach();
        bn1.HienThiDanhSach();
        bn2.HienThiDanhSach();
    }
}