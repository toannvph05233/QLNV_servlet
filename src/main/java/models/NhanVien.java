package models;

public class NhanVien {
    private int id;
    private String name;
    private String birthday;
    private String address;
    private String email;
    private int idPB;

    public NhanVien(int id, String name, String birthday, String address, String email, int idPB) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
        this.idPB = idPB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdPB() {
        return idPB;
    }

    public void setIdPB(int idPB) {
        this.idPB = idPB;
    }
}
