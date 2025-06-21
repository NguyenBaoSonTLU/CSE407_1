import java.util.ArrayList;
import java.util.List;

public class BenhNhan {
    private final String ten;
    private final List<BacSi> danhSachBacSi;

    // Constructor
    public BenhNhan(String ten) {
        this.ten = ten;
        this.danhSachBacSi = new ArrayList<>();
    }

    // Getter for ten
    public String getTen() {
        return ten;
    }

    // Add a doctor to the list
    public void themBacSi(BacSi bacSi) {
        danhSachBacSi.add(bacSi);
    }

    // Display the list of doctors
    public void HienThiDanhSach() {
        System.out.println("Danh sach bac si cua benh nhan " + ten + ":");
        if (danhSachBacSi.isEmpty()) {
            System.out.println("Khong co bac si nao.");
        } else {
            for (BacSi bs : danhSachBacSi) {
                System.out.println("- " + bs.getTen());
            }
        }
    }
}