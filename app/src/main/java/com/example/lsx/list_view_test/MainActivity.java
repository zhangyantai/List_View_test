package com.example.lsx.list_view_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView ls= (ListView) findViewById(R.id.List_view_test);
        String [] data={"apple","banana","grapes","watermelon","pear",
                "apple","banana","grapes","watermelon","pear","apple","banana",
                "grapes","watermelon","pear"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                data);
        ls.setAdapter(arrayAdapter);
    }
}
