import java.util.Arrays;


public class sach {
    protected int id;
    protected String name;
    protected String[] authors = new String[10];
    
    public sach() {
    }

    public sach(String name, String[] authors, int id) {
		this.id = id;
		this.name = name;
		this.authors = authors;
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String[] getauthors() {
        return authors;
    }


    public void display() {
        System.out.println("Ma sach la: " + id);
        System.out.println("Ten sach la: " + name);
        System.out.println("Tac gia cua sach la: " + Arrays.toString(authors));
    }

}
