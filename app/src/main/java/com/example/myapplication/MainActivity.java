package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends Activity {
int z=0;
int n=0;
int fp1_count=0;
int e1=0;
    int e2=0;
    int e3=0;
    int e4=0;
    int e5=0;
    int e6=0;
    int e7=0;
    int e8=0;
    int e9=0;
    int e10=0;
    int e11=0;
    int e12=0;
    int e13=0;
    int e14=0;
    int e15=0;
    int e16=0;
    int e17=0;
    int e18=0;
    int e19=0;
    int e20=0;
    int e21=0;
    int e22=0;
    int e23=0;
    int e24=0;
    int e25=0;
    int e26=0;
    int e27=0;
    int e28=0;
    int e29=0;
    int e30=0;
    int e31=0;
    int e32=0;

    int fp2_count=1;
    int f7_count=2;
    int f8_count=3;
    int f3_count=4;
    int f4_count=5;
    int t3_count=6;
    int t4_count=7;
    int c3_count=8;
    int c4_count=9;
    int t5_count=10;
    int t6_count=11;
    int p3_count=12;
    int p4_count=13;
    int _01_count=14;
    int _02_count=15;
    int a1_count=16;
    int a2_count=17;
    int fz_count=18;
    int cz_count=19;
    int pz_count=20;
    int ex1_count=21;
    int ex2_count=22;
    int ex3_count=23;
    int ex4_count=24;
    int ex5_count=25;
    int ex6_count=26;
    int ex7_count=27;
    int ex8_count=28;
    int ecg_count=29;
    int emg_count=30;
    int ch32_count=31;


    int e;
    float w= (float) 0.002;

    int cunter=0;
TextView textView;
Button button;


    DoubleValue doubleValue;
    int colmn = 0;
    int row = 0;
    double u;
GraphView graphView;
Button buttonrest;

    private final String fileName = "f.txt";
    String fileContent = "";
    int g=0;
int o;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph_view);
        button=findViewById(R.id.choise);
        buttonrest=findViewById(R.id.button1);

        textView=findViewById(R.id.clickhear);
        graphView = findViewById(R.id.idGraphView);
        doubleValue =new DoubleValue();
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
//graphView.removeAllSeries();
//graphView.removeSeries();
            }
        });
textView.setOnClickListener(new OnClickListener() {
    @Override
    public void onClick(View v) {
        for(int m=0;m<8000;m++) {
            Log.e("gggggggg", "" +doubleValue.getF7(m));
        }
    }
});

        reader(getApplicationContext());

        setfpi();
        setfp2();
        setf7();
        setf8();
        setf3();
        setf4();
        sett5();
        //sett6();
        setp3();
        setp3();
        set_01();
        set_02();
        seta1();
        seta2();
        setfz();
        setcz();
        //setpz();
        setex1();
        setex2();
        setex3();
        setEx4();
        setEx5();
        //sett6();
        setf7();
        setf8();
        setp3();
        setp4();
        setecg();
        setemg();
        setch32();




















        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int t=0;t<9000;t++) {
                 //  Log.e("hhhhhhhhhhhhhh", "" + doubleValue.getFp1(t));
                }



                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    button.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            PopupMenu popup = new PopupMenu(MainActivity.this, button);
            //Inflating the Popup using xml file
            popup.getMenuInflater().inflate(R.menu.pop_menu, popup.getMenu());

            //registering popup with OnMenuItemClickListener
            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem item) {
                    graphView.removeAllSeries();
                    textView.setText(""+item.getTitle());
                    if(item.getItemId()==R.id.fp1){

                        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showFp1(item,series);
                    }
                    if(item.getItemId()==R.id.fp2){
                        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showFp2(item,series);
                    }if(item.getItemId()==R.id.f7){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showF7(item,series);
                    }if(item.getItemId()==R.id.f8){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showF8(item,series);
                    }if(item.getItemId()==R.id.f3){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showF3(item,series);
                    }if(item.getItemId()==R.id.f4){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showF4(item,series);
                    }if(item.getItemId()==R.id.t3){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showt3(item,series);
                    }if(item.getItemId()==R.id.t4){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showt4(item,series);
                    }if(item.getItemId()==R.id.t5){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showt5(item,series);
                    }if(item.getItemId()==R.id.t6){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showt6(item,series);
                    }if(item.getItemId()==R.id.p3){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showp3(item,series);
                    }if(item.getItemId()==R.id.p4){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showt6(item,series);
                    }if(item.getItemId()==R.id.p3){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showp3(item,series);
                    }if(item.getItemId()==R.id.p4){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showp4(item,series);
                    }if(item.getItemId()==R.id._01){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        show_01(item,series);
                    }if(item.getItemId()==R.id._02){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        show_02(item,series);
                    }if(item.getItemId()==R.id.a1){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showa1(item,series);
                    }if(item.getItemId()==R.id.a2){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showa2(item,series);
                    }if(item.getItemId()==R.id.fz){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showfz(item,series);
                    }if(item.getItemId()==R.id.cz){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showcz(item,series);
                    }if(item.getItemId()==R.id.pz){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showpz(item,series);
                    }if(item.getItemId()==R.id.ex1){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showex1(item,series);
                    }if(item.getItemId()==R.id.ex2){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showex2(item,series);
                    }if(item.getItemId()==R.id.ex4){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showex4(item,series);
                    }if(item.getItemId()==R.id.ex5){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showex5(item,series);
                    }if(item.getItemId()==R.id.ex6){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showex6(item,series);
                    }if(item.getItemId()==R.id.ex7){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showex7(item,series);
                    }if(item.getItemId()==R.id.ex8){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showex8(item,series);
                    }if(item.getItemId()==R.id.ecg){ LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                        showecg(item,series);
                    }if(item.getItemId()==R.id.emg){
                        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                          showemg(item,series);
                    }if(item.getItemId()==R.id.ch32){
                        graphView.removeAllSeries();
                        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{});

                        graphView.addSeries(series);



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

                           showch32(item,series);

                    }

                    return true;
                }
            });
            popup.show();//showing popup menu
        }

    });
    }

    private void showFp1(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getFp1(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showFp2(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getFp2(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showF7(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getF7(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showF8(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getF8(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showF3(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getF3(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showF4(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getF4(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showt3(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getT3(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showt4(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getT4(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showc3(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getC3(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showc4(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getC4(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showt5(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getT5(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showt6(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getT6(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showp3(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getP3(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showp4(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getP4(z)), false, 10000);
            w+=0.002;
        }
    }
    private void show_01(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.get_01(z)), false, 10000);
            w+=0.002;
        }
    }
    private void show_02(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.get_02(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showa1(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getA1(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showa2(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getA2(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showfz(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getFz(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showcz(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getCz(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showpz(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getPz(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showex1(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx1(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showex2(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx2(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showex3(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx3(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showex4(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx4(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showex5(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx5(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showex6(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx6(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showex7(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx7(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showex8(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEx8(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showecg(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEcg(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showemg(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getEmg(z)), false, 10000);
            w+=0.002;
        }
    }
    private void showch32(MenuItem item,LineGraphSeries<DataPoint> series) {
        for(z=0;z<8000;z++) {
            series.appendData(new DataPoint(w,doubleValue.getCh32(z)), false, 10000);
            w+=0.002;
        }
    }


    private void setfpi() {
        while (fp1_count<280000){
            doubleValue.setFp1(doubleValue.getCount(fp1_count),e);
            fp1_count+=32;
            e++;
        }
    }
    private void setfp2() {
        while (fp2_count<280000){
            doubleValue.setFp2(doubleValue.getCount(fp2_count),e1);
            fp2_count+=32;
            e1++;
        }
    }
    private void setf7() {
        while (f7_count<280000){
            doubleValue.setF7(doubleValue.getCount(f7_count),e3);
            Log.e("ggggggggggggg",""+f7_count);
            Log.e("ggggggggggggg",""+e3);

            f7_count+=32;
            e3++;
        }
    }private void setf8() {
        while (fp1_count<280000){
            doubleValue.setF8(doubleValue.getCount(f8_count),e4);
            f8_count+=32;
            e4++;
        }
    }private void setf3() {
        while (fp1_count<280000){
            doubleValue.setF3(doubleValue.getCount(f3_count),e5);
            f3_count+=32;
            e5++;
        }
    }private void setf4() {
        while (f4_count<280000){
            doubleValue.setF4(doubleValue.getCount(f4_count),e6);
            f4_count+=32;
            e6++;
        }
    }private void setc3() {
        while (fp1_count<280000){
            doubleValue.setC3(doubleValue.getCount(f3_count),e7);
            fp1_count+=32;
            e7++;
        }
    }private void setc4() {
        while (f4_count<280000){
            doubleValue.setC4(doubleValue.getCount(c4_count),e8);
            c4_count+=32;
            e8++;
        }
    }private void sett5() {
        while (t5_count<280000){
            doubleValue.setT5(doubleValue.getCount(t5_count),e9);
            t5_count+=32;
            e9++;
        }
    }private void sett6() {
        while (t6_count<280000){
            doubleValue.setT6(doubleValue.getCount(fp1_count),e10);
            t6_count+=32;
            e10++;
        }
    }private void setp3() {
        while (p3_count<280000){
            doubleValue.setP3(doubleValue.getCount(p3_count),e11);
            p3_count+=32;
            e11++;
        }
    }private void setp4() {
        while (p4_count<280000){
            doubleValue.setP4(doubleValue.getCount(p4_count),e12);
            p4_count+=32;
            e12++;
        }
    }private void set_01() {
        while (fp1_count<280000){
            doubleValue.set_01(doubleValue.getCount(_01_count),e13);
            _01_count+=32;
            e13++;
        }
    }private void set_02() {
        while (_02_count<280000){
            doubleValue.set_02(doubleValue.getCount(_02_count),e14);
            _02_count+=32;
            e14++;
        }
    }private void seta1() {
        while (a1_count<280000){
            doubleValue.setA1(doubleValue.getCount(a1_count),e15);
            a1_count+=32;
            e15++;
        }
    }private void seta2() {
        while (a2_count<280000){
            doubleValue.setA2(doubleValue.getCount(a2_count),e16);
            a2_count+=32;
            e16++;
        }
    }private void setfz() {
        while (fz_count<280000){
            doubleValue.setFz(doubleValue.getCount(fz_count),e17);
            fz_count+=32;
            e17++;
        }
    }private void setcz() {
        while (cz_count<280000){
            doubleValue.setCz(doubleValue.getCount(cz_count),e18);
            cz_count+=32;
            e18++;
        }
    }private void setpz() {
        while (pz_count<280000){
            doubleValue.setPz(doubleValue.getCount(pz_count),e19);
            fz_count+=32;
            e19++;
        }
    }private void setex1() {
        while (ex1_count<280000){
            doubleValue.setEx1(doubleValue.getCount(ex1_count),e20);
            ex1_count+=32;
            e20++;
        }
    }private void setex2() {
        while (ex2_count<280000){
            doubleValue.setEx2(doubleValue.getCount(ex2_count),e21);
            ex2_count+=32;
            e21++;
        }
    }private void setex3() {
        while (ex3_count<280000){
            doubleValue.setEx3(doubleValue.getCount(ex3_count),e22);
            ex3_count+=32;
            e22++;
        }
    }private void setEx4() {
        while (ex4_count<280000){
            doubleValue.setEx4(doubleValue.getCount(ex4_count),e23);
            ex4_count+=32;
            e23++;
        }
    }private void setEx5() {
        while (ex5_count<280000){
            doubleValue.setEx5(doubleValue.getCount(ex5_count),e24);
            ex5_count+=32;
            e24++;
        }
    }private void setex6() {
        while (ex6_count<280000){
            doubleValue.setEx6(doubleValue.getCount(ex6_count),e25);
            ex6_count+=32;
            e25++;
        }
    }private void setex7() {
        while (ex7_count<280000){
            doubleValue.setEx7(doubleValue.getCount(ex7_count),e26);
            ex7_count+=32;
            e26++;
        }
    }private void setex8() {
        while (ex8_count<280000){
            doubleValue.setEx8(doubleValue.getCount(ex8_count),e27);
            fp1_count+=32;
            e27++;
        }
    }private void setecg() {
        while (ecg_count<280000){
            doubleValue.setEcg(doubleValue.getCount(ecg_count),e28);
            ecg_count+=32;
            e28++;
        }
    }private void setemg() {
        while (emg_count<280000){
            doubleValue.setEmg(doubleValue.getCount(emg_count),e29);
            emg_count+=32;
            e29++;
        }
    }private void setch32() {
        while (ch32_count<280000){
            doubleValue.setCh32(doubleValue.getCount(ch32_count),e30);
            ch32_count+=32;
            e30++;
        }
    }


    private void texttodouble(Context context) {
        one_item(context);
        mid_item();
        //lasat_item(context);
    }

    private void lasat_item(Context context) {
       int p= fileContent.length()-1;

        for(int i=p-3;i>(p-12);i--){
            if(fileContent.charAt(i)==' '){

                  gh(i+1,p,context);
                break;
            }
        }
            }

    private void one_item(Context context) {
        String h="";
        int s=0;
        //Log.e("fffffffffffff","5555");

        double d=0;
        for(s=0;s<7;s++){
          if(fileContent.charAt(s)!=' '){
              h+=fileContent.charAt(s);

          }
          else {break;}
        }
        gh(0,s-1,context);
    }

    private void mid_item() {
        sd(0,fileContent.length(),getApplicationContext());

    }

    private void reader(Context context) {
        File extStore = Environment.getExternalStorageDirectory();
        String path = extStore.getAbsolutePath().toString() + "/Download/" + fileName;
        String s = "";
        try {
            File myFile = new File(path);
            FileInputStream fIn = new FileInputStream(myFile);
            BufferedReader myReader = new BufferedReader(
                    new InputStreamReader(fIn));
            myReader.readLine();



            while ((s = myReader.readLine()) != null)
            {
                fileContent += s + "\n";
                texttodouble(context);
                fileContent="";
        }
            myReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void gh(int i, int j, Context context) {

        String sum = "";
        String h;
        double ft = 0;
        for (int b = i; b <= j; b++) {
            sum += fileContent.charAt(b);
        }
        ft = Double.parseDouble(sum);
       //  Log.e("fffffffffffff",""+ft);
        doubleValue.setCount(ft,cunter);
        cunter++;

/*

 if (colmn == 0) {
            doubleValue.setFp2(ft, row);

            colmn = 1;
        }

        if (colmn == 1) {
            doubleValue.setFp2(ft, row);

            colmn = 2;
        }

        if (colmn == 2) {
            doubleValue.setF7(ft, row);
            colmn = 3;
        }
        if (colmn == 3) {

            doubleValue.setF8(ft, row);
            colmn = 4;
        }
        if (colmn == 4) {
            doubleValue.setF3(ft, row);
            colmn = 5;
        }
        if (colmn == 5) {
            doubleValue.setF4(ft, row);
            colmn = 6;
        }
        if (colmn == 6) {
            doubleValue.setT3(ft, row);
            colmn = 7;
        }
        if (colmn == 7) {
            doubleValue.setT4(ft, row);
            colmn = 8;
        }
        if (colmn == 8) {
            doubleValue.setC3(ft, row);
            colmn = 9;
        }
        if (colmn == 9) {
            doubleValue.setC4(ft, row);
            colmn = 10;
        }
        if (colmn == 10) {
            doubleValue.setT5(ft, row);
            colmn = 11;
        }
        if (colmn == 11) {
            doubleValue.setT6(ft, row);
            colmn = 12;
        }
        if (colmn == 12) {
            doubleValue.setP3(ft, row);
            colmn = 13;
        }
        if (colmn == 13) {
            doubleValue.setP4(ft, row);
            colmn = 14;
        }
        if (colmn == 14) {
            doubleValue.set_01(ft, row);
            colmn = 15;
        }
        if (colmn == 15) {
            doubleValue.set_02(ft, row);}
            colmn = 16;
            if (colmn == 16) {
                doubleValue.setA1(ft, row);
                colmn = 17;
            }
            if (colmn == 17) {
                doubleValue.setA2(ft, row);
                colmn = 18;
            }
            if (colmn == 18) {
                doubleValue.setFz(ft, row);
                colmn = 19;}
                if (colmn == 19) {
                    doubleValue.setCz(ft, row);
                    colmn = 20;
                }
                    if (colmn == 20) {
                        doubleValue.setPz(ft, row);
                        colmn = 21;
                    }
                        if (colmn == 21) {
                            doubleValue.setEx1(ft, row);
                            colmn = 22;
                        }
                        if (colmn == 22) {
                            doubleValue.setEx2(ft, row);
                            colmn = 23;
                        }

                        if (colmn == 23) {
                            doubleValue.setEx3(ft, row);
                            colmn = 24;
                        }
                        if (colmn == 24) {
                            doubleValue.setEx4(ft, row);
                            colmn = 25;
                        }
                        if (colmn == 25) {
                            doubleValue.setEx5(ft, row);
                            colmn = 26;
                        }
                        if (colmn == 26) {
                            doubleValue.setEx6(ft, row);
                            colmn = 27;
                        }
                        if (colmn == 27) {
                            doubleValue.setEx7(ft, row);
                            colmn = 28;
                        }
                        if (colmn == 28) {
                            doubleValue.setEx8(ft, row);
                            colmn = 29;
                        }
                        if (colmn == 29) {
                            doubleValue.setEcg(ft, row);
                            colmn = 30;
                        }
                        if (colmn == 30) {
                            doubleValue.setEmg(ft, row);
                            colmn = 31;
                        }
        if (colmn == 31) {
            doubleValue.setEmg(ft, row);
            colmn = 0;
            row++;
        }

*/

                    }





public void sd(int i,int j,Context context){
    for(int b=8;b<=j-1;b++){
        if(fileContent.charAt(b)==' '){
            for(int y=b-1;y>b-8;y--){
            if(fileContent.charAt(y)==' '){

                gh(y+1,b-1,context);
                y=-1;

                break;


            }
            }
        }

    }
}
}