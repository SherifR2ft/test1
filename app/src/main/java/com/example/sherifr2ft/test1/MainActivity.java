package com.example.sherifr2ft.test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void move(View view){
        String name ;
        EditText name1 = (EditText)findViewById(R.id.editText);
        name = name1.getText().toString();
        setContentView(R.layout.layout2);
        TextView name2 = (TextView)findViewById(R.id.textView2);
        name2.setText(name);
    }

public void back(View view){
    setContentView(R.layout.activity_main);
}}
