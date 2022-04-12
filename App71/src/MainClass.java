public class MainClass {
    public static void main(String[] args) {
        HInhTron hInhTron = new HInhTron();
        hInhTron.setBanKinh(10);

        float chuVi = hInhTron.tinhChuVi();
        float dienTich = hInhTron.tinhDienTich();
        System.out.println("Chu vi hinh tron:" +chuVi +"; và Diện Tích:" + dienTich);
    }
}
