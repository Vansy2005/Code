package edu.iuh.fit.bai1;

public class HinhChuNhat {
    public double chieudai;
    public double chieurong;
    public HinhChuNhat()
    {

    }
    public HinhChuNhat(double chieudai, double chieurong)
    {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    public double getterchieudai ()
    {
        return chieudai;
    }
    public void setterchieudai(double chieudai)
    {
        if (chieudai<0)
            throw new IllegalArgumentException("Length and width must be greater than 0");
        this.chieudai=chieudai;
    }
    public double getterchieurong()
    {
        return chieurong;
    }
    public void setterchieurong(double chieurong)
    {
        if(chieurong<0)
            throw new IllegalArgumentException("Length and width must be greater than 0");
        this.chieurong=chieurong;
    }
    public double Tinhdientich() {
        return (chieudai*chieurong);
    }
    public double Tinhchuvi()
    {
        return 2*(chieudai+chieurong);
    }
    @Override
    public String toString() {
        return "Dien Tich La " +Tinhdientich() +"ChuVi la "+Tinhchuvi();
    }
}
