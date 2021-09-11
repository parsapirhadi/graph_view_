package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Chart extends AppCompatActivity {
    GraphView graphView;
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph_view);
        graphView = findViewById(R.id.idGraphView);
        TextView show=findViewById(R.id.clickhear);
        Button choice=findViewById(R.id.choise);
        DoubleValue doubleValue=new DoubleValue();




        choice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Creating the instance of PopupMenu
                PopupMenu popup = new PopupMenu(Chart.this, choice);
                //Inflating the Popup using xml file
                popup.getMenuInflater().inflate(R.menu.pop_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        show.setText(""+item.getTitle());
                        return true;
                    }
                });
                popup.show();//showing popup menu
            }
        });

int x=0;
int y=0;
        // on below line we are adding data to our graph view.

        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                // on below line we are adding
                 // each point on our x and y axis.
                new DataPoint(0.222, 0.5),
                new DataPoint(0.225, 0.5),
                new DataPoint(0.229 , -0.5),
                new DataPoint(0.231, 0.3),
                new DataPoint(0.235, 0.75),
                new DataPoint(0.239, -0.5),
                new DataPoint(0.241, 2),
               // for(int s=0;s<6212;s++){
                 //   new DataPoint()
        //}
        });


        // after adding data to our line graph series.
        // on below line we are setting
        // title for our graph view.
        graphView.setTitle("My Graph View");

        // on below line we are setting
        // text color to our graph view.
        graphView.setTitleColor(R.color.purple_200);

        // on below line we are setting
        // our title text size.
        graphView.setTitleTextSize(18);

        // on below line we are adding
        // data series to our graph view.
        graphView.addSeries(series);
        graphView.getViewport().setXAxisBoundsManual(true);
        graphView.getViewport().setYAxisBoundsManual(true);
        graphView.getViewport().setScalable(true);
        graphView.getViewport().setScalableY(true);
        graphView.getViewport().setScrollable(true);
        graphView.getViewport().setScalableY(true);

    }
}