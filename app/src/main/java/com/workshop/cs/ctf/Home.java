package com.workshop.cs.ctf;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class Home extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listView = (ListView) findViewById(R.id.listView);
        makeList();
    }

    public void makeList() {
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("This");
        arrayList.add("is");
        arrayList.add("App");
        arrayList.add("for");
        arrayList.add("Task");
        arrayList.add("two");
        final MyAdapter arrayAdapter = new MyAdapter(this, arrayList);
        listView.setAdapter(arrayAdapter);
    }

}

class MyAdapter extends  ArrayAdapter<String> {

    private Context context;
    private ArrayList<String> values;

    MyAdapter(Context context, ArrayList<String> values) {
        super(context, R.layout.rowlayout, R.id.word, values);
        this.context = context;
        this.values = values;

    }

    @Override
    public View getView(int position, View v, ViewGroup root) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.rowlayout, root, false);

        TextView tV = (TextView) rowView.findViewById(R.id.word);
        tV.setText(values.get(position));

        ImageView iV = (ImageView) rowView.findViewById(R.id.icon);
        iV.setImageResource(R.drawable.icon);

        return rowView;

    }
}
