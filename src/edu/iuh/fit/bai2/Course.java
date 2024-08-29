package edu.iuh.fit.bai2;

public class Course {
    public String id;
    public String tenkhoahoc;
    public String khoaphutrach;
    public int sotinchi;
    public Course ()
    {
//		setersotinchi(sotinchi);
//		seterkhoaphutrach(khoaphutrach);
//		seterid(id);
//		setertenkhoahoc(tenkhoahoc);
    }
    public Course(int sotinchi, String khoaphutrach,String id, String tenkhoahoc)
    {
        this.sotinchi = sotinchi;
        this.khoaphutrach = khoaphutrach;
        this.id = id;
        this.tenkhoahoc = tenkhoahoc;
    }
    public int gettersotinchi()
    {
        return sotinchi;
    }
    public String getterkhoaphutrach()
    {
        return khoaphutrach;
    }
    public String getterid()
    {
        return id;
    }
    public String gettertenkhoahoc()
    {
        return tenkhoahoc;

    }
    public void setersotinchi(int sotinchi)
    {
        if(sotinchi<0)
        {
            throw new IllegalArgumentException("So Tin Chi Phai Lon Hon 0");
        }
        this.sotinchi=sotinchi;
    }
    public void seterkhoaphutrach(String khoaphutrach)
    {
        this.khoaphutrach=khoaphutrach;
    }
    public void seterid(String id)
    {
        if (id == null || id.length() < 3)
            throw new IllegalArgumentException("ID must have at least 3 characters");
        for (int i = 0; i < id.length(); i++) {
            if (!Character.isLetterOrDigit(id.charAt(i)))
                throw new IllegalArgumentException("ID must contain only letters or digits");
        }
        this.id=id;
    }
    public void setertenkhoahoc(String tenkhoahoc)
    {
        this.tenkhoahoc=tenkhoahoc;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%10s %10s %10s %d",id,tenkhoahoc,khoaphutrach,sotinchi);
    }



}
