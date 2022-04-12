import java.util.Scanner;

public class HinhTron  extends HinhHoc{
    protected float banKinh;
    private Scanner scanner;

    public HinhTron(){
        super();
        scanner = new Scanner(System.in);
    }
public nhapBanKinh (){
    System.out.println("bạn dùng đơn vị tính nào:?");
    System.out.println("\t1 - Centimet");
    System.out.println("\t2 - Inch");
    Configs.donVI = scanner.nextInt();

    System.out.println("Hãy Nhập vào bán kính hình tròn:");
    banKinh = scanner.nextFloat();

}
public inThongTin (){
        if (Configs.donVI == Configs.DON_VI_CM){
            System.out.println("HÌnh tròn có bán kính "+ banKinh+"cm");
            System.out.println("Tương đương "+Configs.ChuyenCenSangInch(banKinh)+"inch");

        }
else
        {
            System.out.println("Hình tròn có bán kính:" +banKinh + "inch");
            System.out.println(" Tương Đương" +Configs.ChuyenInchSangCen(banKinh)+ "cm");

        }
}

}
