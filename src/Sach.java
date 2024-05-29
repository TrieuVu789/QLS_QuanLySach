public class Sach {
    private String tenSach;
    private float giaBan;
    private int namXuatBan;
    private TacGia tacGia;

    public Sach(String tenSach, float giaBan, int namXuatBan, TacGia tacGia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }
    /*public void setTacgia(TacGia tacGia) {
        this.tacGia = tacGia;
    }*/
    public void inTenSach(){
        System.out.println(this.tenSach);
    }
    public boolean kiemTraSach(Sach sachKhac){
        return this.namXuatBan == sachKhac.namXuatBan;
    }
    public double giaSachSauKhiGiam(double x){
     return this.giaBan *(1-x/100);
    }
    }

