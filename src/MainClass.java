public class MainClass {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien();
        SinhVien sinhVien2 = new SinhVien();

        sinhVien1.setTuoi(23);
        sinhVien1.setTen("");

        sinhVien2.setTen("");
sinhVien2.setTuoi(17);

        System.out.println("SInh vien 1 co tên:" +sinhVien1.getTen() + ", tuổi" + sinhVien2.getTuoi());
        System.out.println("SInh viên 2 có tên :"+ sinhVien2.getTen()+ "tuổi"+ sinhVien1.getTuoi());


    }
}
