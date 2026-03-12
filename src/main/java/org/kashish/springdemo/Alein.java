package org.kashish.springdemo;

public class Alein {
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    private   int sno;
   private String sname;

    @Override
    public String toString() {
        return "Alein{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                '}';
    }
}
