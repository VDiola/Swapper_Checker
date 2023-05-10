package com.example.a05_activity_1_diola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText Et1, Et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.btn_check);
        Et1 = (EditText) findViewById(R.id.swap_string);
        Et2 = (EditText) findViewById(R.id.check_string);

        b.setOnClickListener((view -> {
            Intent i = new Intent (getApplicationContext(), MyMessage.class);
            String swap_Btn = Et1.getText().toString();
            String check_Btn = Et2.getText().toString();

          if(swap_Btn.equalsIgnoreCase(check_Btn)){
              i.putExtra("same", "THE SAME");
              startActivity(i);
          }else{
              i.putExtra("same","NOT THE SAME");
              startActivity(i);
          }
        }));



    }

    public void onSwap(View view){
        Et1 = (EditText) findViewById(R.id.swap_string);
        Et2 = (EditText) findViewById(R.id.check_string);
        String getSwapString = String.valueOf(Et1.getText());
        String getCheckString = String.valueOf(Et2.getText());
        Et1.setText(getCheckString);
        Et2.setText(getSwapString);


    }
}