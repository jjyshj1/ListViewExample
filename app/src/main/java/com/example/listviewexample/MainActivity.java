package com.example.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.listviewexample.data.Store;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Store> mystoreList = new ArrayList<>();
    private android.widget.ListView storeListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        setupEvents();
        bindView();

    }


    void setValues(){
        fillStores();
    }

    //ArrayList에 가게를 채우는것...실무에서는 서버에서 가져옴

    void fillStores(){
        mystoreList.add(new Store("서향","월계동 411","09:00","21:00"));
        mystoreList.add(new Store("상호각","마들로","09:00","21:00"));
        mystoreList.add(new Store("중국성","장위동","09:00","21:00"));
    }

    void setupEvents(){

    }

    void bindView(){

    }
}
