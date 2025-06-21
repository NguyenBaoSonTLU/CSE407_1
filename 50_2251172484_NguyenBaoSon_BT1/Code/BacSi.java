import java.util.ArrayList;
import java.util.List;

public class BacSi {
    private final String ten;
    private final List<BenhNhan> danhSachBenhNhan;

    // Constructor
    public BacSi(String ten) {
        this.ten = ten;
        this.danhSachBenhNhan = new ArrayList<>();
    }

    // Getter for ten
    public String getTen() {
        return ten;
    }

    // Add a patient to the list
    public void themBenhNhan(BenhNhan benhNhan) {
        danhSachBenhNhan.add(benhNhan);
    }

    // Display the list of patients
    public void HienThiDanhSach() {
        System.out.println("Danh sach benh nhan cua bac si " + ten + ":");
        if (danhSachBenhNhan.isEmpty()) {
            System.out.println("Khong co benh nhan nao.");
        } else {
            for (BenhNhan bn : danhSachBenhNhan) {
                System.out.println("- " + bn.getTen());
            }
        }
    }
}