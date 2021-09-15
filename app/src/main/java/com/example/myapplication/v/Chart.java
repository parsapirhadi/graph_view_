package com.example.myapplication.v;

import android.view.MenuItem;

import com.example.myapplication.R;
import com.example.myapplication.m.DoubleValue;
import com.example.myapplication.m.Floats;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Chart{
    GraphView graphView;
    MenuItem item;
    DoubleValue doubleValue;
    Show show;
    Floats floats;

    public Chart(GraphView graphView, MenuItem item, DoubleValue doubleValue, Show show) {
        this.graphView = graphView;
        this.item = item;
        this.doubleValue = doubleValue;
        this.show = show;
    }

    public void draw(){
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});
       graphView.addSeries(series);
       floats=new Floats();
       graphView.setTitle(""+item.getTitle());
       graphView.setTitleColor(R.color.purple_200);
       graphView.setTitleTextSize(18);
       graphView.getViewport().setMaxY(-100);
       graphView.getViewport().setMaxY(100);
       graphView.getViewport().setXAxisBoundsManual(true);
       graphView.getViewport().setYAxisBoundsManual(true);
       graphView.getViewport().setScalable(true);
       graphView.getViewport().setScalableY(true);
       graphView.getViewport().setScrollable(true);
       graphView.getViewport().setScalableY(true);
       if(item.getItemId()==R.id.fp1)
           show.showFp1(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.fp2)
            show.showFp2(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.f7)
            show.showF7(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.f8)
            show.showF8(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.f3)
            show.showF3(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.f4)
            show.showF4(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.c3)
            show.showc3(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.c4)
            show.showc4(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.t5)
            show.showt5(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.t6)
            show.showt6(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.p3)
            show.showp3(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.p4)
            show.showp4(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id._01)
            show.show_01(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id._02)
            show.show_02(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.a1)
            show.showa1(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.a2)
            show.showa2(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.fz)
            show.showfz(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.cz)
            show.showcz(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.pz)
            show.showpz(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.ex1)
            show.showex1(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.ex2)
            show.showex2(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.ex3)
            show.showex3(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.ex4)
            show.showex4(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.ex5)
            show.showex5(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.ex6)
            show.showex6(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.ex7)
            show.showex7(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.ex8)
            show.showex8(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.ecg)
            show.showecg(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.emg)
            show.showemg(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.ch32)
            show.showch32(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.t3)
            show.showt3(item,series,doubleValue,floats.getW());
        if(item.getItemId()==R.id.t4)
            show.showt4(item,series,doubleValue,floats.getW());

   }
}