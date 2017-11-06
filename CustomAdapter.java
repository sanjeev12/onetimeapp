package com.sabdakosh.san.onetimeapp;


import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DUDBC-GIS on 11/6/2017.
 */

public class CustomAdapter extends BaseAdapter implements View.OnClickListener {
    private Activity activity;
    private ArrayList data;
    private static LayoutInflater inflater = null;
    public Resources res;
    List tempValues = null;
    int i = 0;

    public CustomAdapter(Activity a, ArrayList d, Resources resLocal) {
        activity = a;
        data = d;
        res = resLocal;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        if (data.size() <= 0)
            return 1;
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    /********* Create a holder Class to contain inflated xml file elements *********/
    public static class ViewHolder {

        public TextView projectName;
        public TextView developer;
        public ImageView image, like, dislike;
        public Button Link;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        ViewHolder holder;

        if (convertView == null) {

            /****** Inflate tabitem.xml file for each row ( Defined below ) *******/
            vi = inflater.inflate(R.layout.item, null);

            /****** View Holder Object to contain tabitem.xml file elements ******/

            holder = new ViewHolder();
            holder.projectName = (TextView) vi.findViewById(R.id.text);
            holder.developer = (TextView) vi.findViewById(R.id.text1);
            holder.image = (ImageView) vi.findViewById(R.id.image);
            holder.like = (ImageView) vi.findViewById(R.id.like);
            holder.dislike = (ImageView) vi.findViewById(R.id.dislike);
            holder.Link = (Button) vi.findViewById(R.id.link);

            /************  Set holder with LayoutInflater ************/
            vi.setTag(holder);
        } else
            holder = (ViewHolder) vi.getTag();

        if (data.size() <= 0) {
            holder.projectName.setText("No Data");

        } else {
            /***** Get each Model object from Arraylist ********/
            tempValues = null;
            tempValues = (List) data.get(position);

            /************  Set Model values in Holder elements ***********/

            holder.projectName.setText(tempValues.getProjectName());
            holder.developer.setText(tempValues.getDeveloper());
            holder.Link.setText(tempValues.getUrl());
            holder.image.setImageResource(
                    res.getIdentifier(
                            "com.androidexample.customlistview:drawable/" + tempValues.getImage()
                            , null, null));

            /******** Set Item Click Listner for LayoutInflater for each row *******/

            vi.setOnClickListener(new OnItemClickListener(position));
        }
        return vi;
    }

    @Override
    public void onClick(View view) {

    }

    private class OnItemClickListener implements View.OnClickListener {
        private int mPosition;

        OnItemClickListener(int position) {
            mPosition = position;
        }

        @Override
        public void onClick(View arg0) {


            CustomListView sct = (CustomListView) activity;

            /****  Call  onItemClick Method inside CustomListViewAndroidExample Class ( See Below )****/

            sct.onItemClick(mPosition);
        }
    }
}
