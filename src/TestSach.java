public class TestSach {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(11,8,2005);
        Ngay ngay2 = new Ngay(11,8,2009);
        Ngay ngay3 = new Ngay(12,7,2002);

        TacGia tacgia1 = new TacGia("TrieuVu",11);
        TacGia tacgia2 = new TacGia("VanCao",31);
        TacGia tacgia3 = new TacGia("HaiBaZchung",21);

        Sach sach1 = new Sach("Cuoc doi a phu",10000,2004,tacgia1);
        Sach sach2 = new Sach("HondaWW",13212312,2024,tacgia2);
        Sach sach3 = new Sach("that long anh",19000,2044,tacgia3);

        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();

        System.out.println("Kiemtra s1 voi s2: "+ sach1.kiemTraSach(sach2));
        System.out.println("Kiemtra s1 voi s3: "+ sach1.kiemTraSach(sach3));
        System.out.println("Kiemtra s2 voi s3: "+ sach2.kiemTraSach(sach3));

        System.out.println("Gia sach sau khi duoc giam 10%: " +sach1.giaSachSauKhiGiam(10));
        System.out.println("Gia sach sau khi duoc giam 90%: " +sach2.giaSachSauKhiGiam(90));
        System.out.println("Gia sach sau khi duoc giam 50%: " +sach3.giaSachSauKhiGiam(50));
    }
}
