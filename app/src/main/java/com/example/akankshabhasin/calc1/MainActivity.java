package com.example.akankshabhasin.calc1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText e1, e2;
    TextView t;                                                            //object char form me store
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);                              //id
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
        t = findViewById(R.id.textView);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
    }



    public void add(View v) {
        String n1 = e1.getText().toString();
        String n2 = e2.getText().toString();                //to perform opern in double form
        double d1, d2, d3;
        //Integer.parseInt()
        d1 = Double.parseDouble(n1);
        d2 = Double.parseDouble(n2);
        d3 = d1 + d2;
        t.setText(d3 + "");
    }

    public void subtract(View v) {
        String n1 = e1.getText().toString();
        String n2 = e2.getText().toString();                //to perform opern in double form
        double d1, d2, d3;
        //Integer.parseInt()
        d1 = Double.parseDouble(n1);
        d2 = Double.parseDouble(n2);
        d3 = d1 - d2;
        t.setText(d3 + "");
    }

    public void multiply(View v) {
        String n1 = e1.getText().toString();
        String n2 = e2.getText().toString();                //to perform opern in double form
        double d1, d2, d3;
        //Integer.parseInt()
        d1 = Double.parseDouble(n1);
        d2 = Double.parseDouble(n2);
        d3 = d1 * d2;
        t.setText(d3 + "");
    }
    public void mod(View v) {
        String n1 = e1.getText().toString();
        String n2 = e2.getText().toString();                //to perform opern in double form
        double d1, d2, d3;
        //Integer.parseInt()
        d1 = Double.parseDouble(n1);
        d2 = Double.parseDouble(n2);
        d3 = d1%d2;
        t.setText(d3 + "");
    }

    public void divide(View v) {
        String n1 = e1.getText().toString();
        String n2 = e2.getText().toString();                //to perform opern in double form
        double d1, d2, d3;
        //Integer.parseInt()
        d1 = Double.parseDouble(n1);
        d2 = Double.parseDouble(n2);
        d3 = d1 / d2;
        t.setText(d3 + "");
    }
}
