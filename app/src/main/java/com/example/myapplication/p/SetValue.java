package com.example.myapplication.p;

import com.example.myapplication.m.XCount;
import com.example.myapplication.m.CountValue;
import com.example.myapplication.m.DoubleValue;

public class SetValue {
    DoubleValue doubleValue;
    CountValue countValue;
    XCount x_count;

    public SetValue(DoubleValue doubleValue, CountValue countValue, XCount x_count) {
        this.doubleValue = doubleValue;
        this.countValue = countValue;
        this.x_count = x_count;
    }

    public void setfpi() {
        while (countValue.getFp1_count()<280000){
            doubleValue.setFp1(doubleValue.getCount(countValue.getFp1_count()),x_count.getE1());
            countValue.setFp1_count(countValue.getFp1_count()+32);
            x_count.setE1(x_count.getE1()+1);
        }
    }

    public void setfp2() {
        while (countValue.getFp2_count()<280000){
            doubleValue.setFp2(doubleValue.getCount(countValue.getFp2_count()),x_count.getE2());
            countValue.setFp2_count(countValue.getFp2_count()+32);
            x_count.setE2(x_count.getE2()+1);
        }
    }

    public void setf7() {
        while (countValue.getF7_count()<280000){
            doubleValue.setF7(doubleValue.getCount(countValue.getF7_count()),x_count.getE3());
            countValue.setF7_count(countValue.getF7_count()+32);
            x_count.setE3(x_count.getE3()+1);
        }
    }
    public void setf8() {
        while (countValue.getF8_count()<280000){
            doubleValue.setF8(doubleValue.getCount(countValue.getF8_count()),x_count.getE4());
            countValue.setF8_count(countValue.getF8_count()+32);
            x_count.setE4(x_count.getE4()+1);
        }
    }public void setf3() {
        while (countValue.getF3_count()<280000){
            doubleValue.setF3(doubleValue.getCount(countValue.getF3_count()),x_count.getE5());
            countValue.setF3_count(countValue.getF3_count()+32);
            x_count.setE5(x_count.getE5()+1);
        }
    }public void setf4() {
        while (countValue.getF4_count()<280000){
            doubleValue.setF4(doubleValue.getCount(countValue.getF4_count()),x_count.getE6());
            countValue.setF4_count(countValue.getF4_count()+32);
            x_count.setE6(x_count.getE6()+1);
        }
    }
    public void sett3() {
        while (countValue.getT3_count()<280000){
            doubleValue.setT3(doubleValue.getCount(countValue.getT3_count()),x_count.getE7());
            countValue.setT3_count(countValue.getT3_count()+32);
            x_count.setE7(x_count.getE7()+1);
        }
    }public void sett4() {
        while (countValue.getT4_count()<280000){
            doubleValue.setT4(doubleValue.getCount(countValue.getT4_count()),x_count.getE8());
            countValue.setT4_count(countValue.getT4_count()+32);
            x_count.setE8(x_count.getE8()+1);
        }
    }
    public void setc3() {
        while (countValue.getC3_count()<280000){
            doubleValue.setC3(doubleValue.getCount(countValue.getC3_count()),x_count.getE9());
            countValue.setC3_count(countValue.getC3_count()+32);
            x_count.setE9(x_count.getE9()+1);
        }
    }public void setc4() {
        while (countValue.getC4_count()<280000){
            doubleValue.setC4(doubleValue.getCount(countValue.getC4_count()),x_count.getE10());
            countValue.setC4_count(countValue.getT4_count()+32);
            x_count.setE10(x_count.getE10()+1);
        }
    }public void sett5() {
        while (countValue.getT5_count()<280000){
            doubleValue.setT5(doubleValue.getCount(countValue.getT5_count()),x_count.getE11());
            countValue.setT5_count(countValue.getC3_count()+32);
            x_count.setE11(x_count.getE11()+1);
        }
    }public void sett6() {
        while (countValue.getT6_count()<280000){
            doubleValue.setT6(doubleValue.getCount(countValue.getT6_count()),x_count.getE12());
            countValue.setT6_count(countValue.getT6_count()+32);
            x_count.setE12(x_count.getE12()+1);
        }
    }public void setp3() {
        while (countValue.getP3_count()<280000){
            doubleValue.setP3(doubleValue.getCount(countValue.getP3_count()),x_count.getE13());
            countValue.setP3_count(countValue.getP3_count()+32);
            x_count.setE13(x_count.getE13()+1);
        }
    }public void setp4() {
        while (countValue.getP4_count()<280000){
            doubleValue.setP4(doubleValue.getCount(countValue.getP4_count()),x_count.getE14());
            countValue.setP4_count(countValue.getP4_count()+32);
            x_count.setE14(x_count.getE14()+1);
        }
    }public void set_01() {
        while (countValue.get_01_count()<280000){
            doubleValue.set_01(doubleValue.getCount(countValue.get_01_count()),x_count.getE15());
            countValue.set_01_count(countValue.get_01_count()+32);
            x_count.setE15(x_count.getE15()+1);
        }
    }public void set_02() {
        while (countValue.get_02_count()<280000){
            doubleValue.set_02(doubleValue.getCount(countValue.get_02_count()),x_count.getE16());
            countValue.set_02_count(countValue.get_02_count()+32);
            x_count.setE16(x_count.getE16()+1);
        }
    }public void seta1() {
        while (countValue.getA1_count()<280000){
            doubleValue.setA1(doubleValue.getCount(countValue.getA1_count()),x_count.getE17());
            countValue.setA1_count(countValue.getA1_count()+32);
            x_count.setE17(x_count.getE17()+1);
        }
    }public void seta2() {
        while (countValue.getA2_count()<280000){
            doubleValue.setA2(doubleValue.getCount(countValue.getA2_count()),x_count.getE18());
            countValue.setA2_count(countValue.getA2_count()+32);
            x_count.setE18(x_count.getE18()+1);
        }
    }public void setfz() {
        while (countValue.getFz_count()<280000){
            doubleValue.setFz(doubleValue.getCount(countValue.getFz_count()),x_count.getE19());
            countValue.setFz_count(countValue.getFz_count()+32);
            x_count.setE19(x_count.getE19()+1);
        }
    }public void setcz() {
        while (countValue.getCz_count()<280000){
            doubleValue.setCz(doubleValue.getCount(countValue.getCz_count()),x_count.getE20());
            countValue.setCz_count(countValue.getCz_count()+32);
            x_count.setE20(x_count.getE20()+1);
        }
    }public void setpz() {
        while (countValue.getPz_count()<280000){
            doubleValue.setPz(doubleValue.getCount(countValue.getPz_count()),x_count.getE21());
            countValue.setPz_count(countValue.getPz_count()+32);
            x_count.setE21(x_count.getE21()+1);
        }
    }public void setex1() {
        while (countValue.getEx1_count()<280000){
            doubleValue.setEx1(doubleValue.getCount(countValue.getEx1_count()),x_count.getE22());
            countValue.setEx1_count(countValue.getEx1_count()+32);
            x_count.setE22(x_count.getE22()+1);
        }
    }public void setex2() {
        while (countValue.getEx2_count()<280000){
            doubleValue.setEx2(doubleValue.getCount(countValue.getEx2_count()),x_count.getE23());
            countValue.setEx2_count(countValue.getEx2_count()+32);
            x_count.setE23(x_count.getE23()+1);
        }
    }public void setex3() {
        while (countValue.getEx3_count()<280000){
            doubleValue.setEx3(doubleValue.getCount(countValue.getEx3_count()),x_count.getE24());
            countValue.setEx3_count(countValue.getEx3_count()+32);
            x_count.setE24(x_count.getE24()+1);
        }
    }public void setEx4() {
        while (countValue.getEx4_count()<280000){
            doubleValue.setEx4(doubleValue.getCount(countValue.getEx4_count()),x_count.getE25());
            countValue.setEx4_count(countValue.getEx4_count()+32);
            x_count.setE25(x_count.getE25()+1);
        }
    }public void setEx5() {
        while (countValue.getEx5_count()<280000){
            doubleValue.setEx5(doubleValue.getCount(countValue.getEx5_count()),x_count.getE26());
            countValue.setEx5_count(countValue.getEx5_count()+32);
            x_count.setE26(x_count.getE26()+1);
        }
    }public void setex6() {
        while (countValue.getEx6_count()<280000){
            doubleValue.setEx6(doubleValue.getCount(countValue.getEx6_count()),x_count.getE27());
            countValue.setEx6_count(countValue.getEx6_count()+32);
            x_count.setE27(x_count.getE27()+1);
        }
    }public void setex7() {
        while (countValue.getEx7_count()<280000){
            doubleValue.setEx7(doubleValue.getCount(countValue.getEx7_count()),x_count.getE28());
            countValue.setEx7_count(countValue.getEx7_count()+32);
            x_count.setE28(x_count.getE28()+1);
        }
    }public void setex8() {
        while (countValue.getEx8_count()<280000){
            doubleValue.setEx8(doubleValue.getCount(countValue.getEx8_count()),x_count.getE29());
            countValue.setEx8_count(countValue.getEx8_count()+32);
            x_count.setE29(x_count.getE29()+1);
        }
    }public void setecg() {
        while (countValue.getEcg_count()<280000){
            doubleValue.setEcg(doubleValue.getCount(countValue.getEcg_count()),x_count.getE30());
            countValue.setEcg_count(countValue.getEcg_count()+32);
            x_count.setE30(x_count.getE30()+1);
        }
    }public void setemg() {
        while (countValue.getEmg_count()<280000){
            doubleValue.setEmg(doubleValue.getCount(countValue.getEmg_count()),x_count.getE31());
            countValue.setEmg_count(countValue.getEmg_count()+32);
            x_count.setE31(x_count.getE30()+1);
        }
    }public void setch32() {
        while (countValue.getCh32_count()<280000){
            doubleValue.setCh32(doubleValue.getCount(countValue.getCh32_count()),x_count.getE32());
            countValue.setCh32_count(countValue.getCh32_count()+32);
            x_count.setE32(x_count.getE32()+1);
        }
    }
}
