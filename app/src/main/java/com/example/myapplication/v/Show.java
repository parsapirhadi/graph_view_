package com.example.myapplication.v;

import android.view.MenuItem;

import com.example.myapplication.m.DoubleValue;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Show {

    public void showFp1(MenuItem item, LineGraphSeries<DataPoint> series, DoubleValue doubleValue, float w) {

        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getFp1(z)), false, 10000);
            w+=0.002;
        }
    }

    public void showFp2(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getFp2(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showF7(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getF7(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showF8 (MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getF8(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showF3(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getF3(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showF4(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getF4(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showt3(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w){
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getT3(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showt4(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getT4(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showc3 (MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getC3(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showc4 (MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w){
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getC4(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showt5(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getT5(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showt6(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getT6(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showp3(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getP3(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showp4(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getP4(z)), false, 10000);
            w+=0.002;
        }
    }
    public void show_01(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.get_01(z)), false, 10000);
            w+=0.002;
        }
    }
    public void show_02(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w){
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.get_02(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showa1 (MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getA1(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showa2(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w){
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getA2(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showfz(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w){
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getFz(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showcz(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w){
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getCz(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showpz(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getPz(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showex1(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx1(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showex2 (MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx2(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showex3(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx3(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showex4(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx4(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showex5(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w){
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx5(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showex6(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx6(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showex7(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w){
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx7(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showex8(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx8(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showecg (MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEcg(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showemg (MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w) {
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEmg(z)), false, 10000);
            w+=0.002;
        }
    }
    public void showch32(MenuItem item, LineGraphSeries<DataPoint> series,DoubleValue doubleValue,float w){
        for(int z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getCh32(z)), false, 10000);
            w+=0.002;
        }
    }






}
