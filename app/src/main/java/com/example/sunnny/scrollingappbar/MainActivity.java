package com.example.sunnny.scrollingappbar;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str[]=new String[25];
        CollapsingToolbarLayout collapsingToolbarLayout=(CollapsingToolbarLayout)findViewById(R.id.toolbar);
        collapsingToolbarLayout.setTitle("Sunnny");
        for(int i=0;i<25;i++)
        {
            str[i]="Sunnny: "+i;
        }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,str);
        ListView listView=(ListView)findViewById(R.id.list_items);
        listView.setAdapter(arrayAdapter);
    }
}
