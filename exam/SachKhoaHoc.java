import java.util.Arrays;

public class SachKhoaHoc extends sach {
    protected String theloai;

    public SachKhoaHoc() {
    };

    public SachKhoaHoc(int id, String name, String[] authors, String theloai) {
        super(id, name, authors);
        this.theloai = theloai;
    }

    public String getTheLoai() {
        return theloai;
    }

    @Override
    public void display() {
        System.out.println("Ma sach la: " + id);
        System.out.println("Ten sach la: " + name);
        System.out.println("Tac gia cua sach la: " + Arrays.toString(authors));
        System.out.println("The loai cua sach la: " + theloai);
    }
}