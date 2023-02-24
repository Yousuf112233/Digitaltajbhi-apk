package com.yousuf_digitaltajbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    Button Addonebutton;
    Button Subonebutton;
    Button resetbutton;
    int count=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =findViewById(R.id.textView);
        Addonebutton =findViewById(R.id.Addonebutton);
        Subonebutton =findViewById(R.id.Subonebutton);
        resetbutton =findViewById(R.id.resetbutton);

///...........................................................................////

       Addonebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               count++;
                textView.setText(""+count);

            }
        });

///..............................................................................//////////////

        Subonebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count--;
                textView.setText(""+count);
            }
        });

///////////////////////........................................................./////////////////...//

        resetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count=0;
                textView.setText(""+count);
            }
        });




























    }


}