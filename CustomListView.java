package com.sabdakosh.san.onetimeapp;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by DUDBC-GIS on 11/6/2017.
 */

public class CustomListView extends Activity {
    ListView list;
    CustomAdapter adapter;
    public CustomListView CustomListView = null;
    public ArrayList<List> CustomListViewValuesArr = new ArrayList<List>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        CustomListView = this;

        /******** Take some data in Arraylist ( CustomListViewValuesArr ) ***********/
        setListData();

        Resources res = getResources();
        list = (ListView) findViewById(R.id.list);  // List defined in XML ( See Below )

        /**************** Create Custom Adapter *********/
        adapter = new CustomAdapter(CustomListView, CustomListViewValuesArr, res);
        list.setAdapter(adapter);

    }

    /****** Function to set data in ArrayList *************/
    public void setListData() {

        for (int i = 0; i < 11; i++) {

            final List sched = new List();

            /******* Firstly take data in model object ******/
            sched.setProjectName("Company " + i);
            sched.setImage("image" + i);
            sched.setUrl("http:\\www." + i + ".com");

            /******** Take Model Object in ArrayList **********/
            CustomListViewValuesArr.add(sched);
        }

    }


    /*****************  This function used by adapter ****************/
    public void onItemClick(int mPosition) {
        List tempValues = (List) CustomListViewValuesArr.get(mPosition);


        // SHOW ALERT

        Toast.makeText(CustomListView,
                "" + tempValues.getProjectName()
                        + "                Image:" + tempValues.getImage() + " Url:" + tempValues.getUrl(),
                Toast.LENGTH_LONG)
                .show();
    }
}
