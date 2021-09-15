package com.example.myapplication.v;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.m.CountValue;
import com.example.myapplication.m.DoubleValue;
import com.example.myapplication.m.Strings;
import com.example.myapplication.m.XCount;
import com.example.myapplication.p.CallSetValue;
import com.example.myapplication.p.Reader;
import com.example.myapplication.p.SetValue;
import com.jjoe64.graphview.GraphView;

public class MainActivity extends Activity {

CountValue countValue;
TextView textView;
Button button;
Chart chart;
XCount x_count;
DoubleValue doubleValue;
GraphView graphView;
Button buttonrest;
SetValue setValue;
CallSetValue callSetValue;
Reader reader;
Strings strings;
Show show;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph_view);
        button=findViewById(R.id.choise);
        buttonrest=findViewById(R.id.button1);
        strings=new Strings();
        show=new Show();
        x_count=new XCount();
        graphView = findViewById(R.id.idGraphView);
        doubleValue =new DoubleValue();
        countValue=new CountValue();
        setValue=new SetValue(doubleValue,countValue,x_count);
        callSetValue=new CallSetValue(setValue);
        reader=new Reader(strings.getFileName(),strings.getFileContent(),countValue.getCunter(),doubleValue);
        reader.reader(getApplicationContext());
        callSetValue.set();
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


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
                        chart=new Chart(graphView,item,doubleValue,show);
                        chart.draw();

                    return true;
                }
            });
            popup.show();//showing popup menu
        }

    });
    }




}