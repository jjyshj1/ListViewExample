package com.example.listviewexample.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.listviewexample.R;
import com.example.listviewexample.data.Store;

import java.util.List;


public class StoreAdapter extends ArrayAdapter<Store> {
        Context mContext;
        List<Store> mList;
        LayoutInflater inf;


    public StoreAdapter(Context context, List<Store> list){
        super(context, R.layout.store_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        View row = convertView;
        if(row == null){
            row = inf.inflate(R.layout.store_list_item, null);
        }
        //실제 store데이터를 잉해서 row의 적재적소에 쁘려주기
        Store data = mList.get(position);

        TextView storename = row.findViewById(R.id.storename);

        storename.setText(data.name);

        return row;
    }
}
