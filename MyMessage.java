package com.example.a05_activity_1_diola;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyMessage extends MainActivity{
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);
        Intent secondActivity = getIntent();
        t = (TextView) findViewById(R.id.msg_TextView);
        String msg_Result = secondActivity.getStringExtra("same");
        t.setText(msg_Result);
    }
}
