import java.util.Arrays;

public class SachVanHoc extends Sach {
    protected String loai;

    public SachVanHoc() {
    };

    public SachVanHoc(int id, String name, String[] authors, String theloai) {
        super(id, name, authors);
        this.theloai = theloai;
    }

    public String getthe() {
        return theloai;
    }

    @Override
    public void display() {
        System.out.println("Ma sach la: " + id);
        System.out.println("Ten sach la: " + name);
        System.out.println("Tac gia cua sach la: " + Arrays.toString(authors));
    }
}