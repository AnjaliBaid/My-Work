package com.example.notepad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by anju on 14/6/17.
 */

public class MyAdapter extends BaseAdapter{

    private final Context context;
    private final List<MyItems> data;
    private final LayoutInflater inflater;

    public MyAdapter(Context context,List<MyItems>data){
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {

        return data.size();
    }

    @Override
    public Object getItem(int position) {

        return data.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        if (convertView == null)
            view =inflater.inflate(R.layout.linear,parent,false);
        else view =convertView;

        ((ImageView)view.findViewById(R.id.img)).setImageResource(data.get(position).imgid);
        ((TextView)view.findViewById(R.id.txt)).setText(data.get(position).txt);

        return view;
    }
}
