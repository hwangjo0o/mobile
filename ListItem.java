package com.example.ws.myapplication;

import android.app.Activity;

/**
 * Created by ws on 2016-05-13.
 */
public class ListItem extends Activity {
    private String[] mData;

    public ListItem(String[] data ){


        mData = data;
}

    public ListItem(String imgUrl, String txt1){

        mData = new String[3];
        mData[0] = imgUrl;
        mData[1] = txt1;


    }

    public String[] getData(){
        return mData;
    }

    public String getData(int index){
        return mData[index];
    }

    public void setData(String[] data){
        mData = data;
    }



}
