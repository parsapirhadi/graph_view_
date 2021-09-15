package com.example.myapplication.p;

import android.content.Context;
import android.os.Environment;

import com.example.myapplication.m.DoubleValue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    String fileName;
    String fileContent;
    int cunter;
    DoubleValue doubleValue;

    public Reader(String fileName, String fileContent, int cunter, DoubleValue doubleValue) {
        this.fileName = fileName;
        this.fileContent = fileContent;
        this.cunter = cunter;
        this.doubleValue = doubleValue;
    }

    public void texttodouble(Context context) {
        one_item(context);
        mid_item();
        //lasat_item(context);
    }

    public void lasat_item(Context context) {
        int p= fileContent.length()-1;

        for(int i=p-3;i>(p-12);i--){
            if(fileContent.charAt(i)==' '){

                gh(i+1,p);
                break;
            }
        }
    }

    public void one_item(Context context) {
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
        gh(0,s-1);
    }

    public void mid_item() {
        sd(0,fileContent.length());

    }

    public void reader(Context context) {
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

    public void gh(int i, int j) {

        String sum = "";
        String h;
        double ft = 0;
        for (int b = i; b <= j; b++) {
            sum += fileContent.charAt(b);
        }
        ft = Double.parseDouble(sum);
        //  Log.e("fffffffffffff",""+ft);
        doubleValue.setCount(ft, cunter);
        cunter++;

    }

    public void sd(int i,int j){
        for(int b=8;b<=j-1;b++){
            if(fileContent.charAt(b)==' '){
                for(int y=b-1;y>b-8;y--){
                    if(fileContent.charAt(y)==' '){

                        gh(y+1,b-1);
                        y=-1;

                        break;


                    }
                }
            }

        }
    }
}
