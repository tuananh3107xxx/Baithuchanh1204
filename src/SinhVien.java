public class SinhVien {
    private String ten;
    private  String tuoi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten == null || ten.isEmpty()){
            this.ten = "không biết";

        }
        else {
            this.ten = ten;
        }

    }

    public String getTuoi() {
        if (Integer.valueOf(tuoi)!= -1){
            return tuoi;

        }
        else {
            return  "tuổi không hợp";
        }


    }

    public void setTuoi(int tuoi) {
        {
            if (tuoi >18){
                this.tuoi =String.valueOf(tuoi);

            }
            else {
                this.tuoi = String.valueOf(-1);

            }
        }

    }
}
