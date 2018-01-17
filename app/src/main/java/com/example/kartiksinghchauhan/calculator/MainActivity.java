package com.example.kartiksinghchauhan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add (View a){
    if(a.getId() == R.id.badd){
        EditText a1 = (EditText)findViewById(R.id.TFnumber1);
        EditText a2 = (EditText)findViewById(R.id.TFnumber2);
        a1.setTransformationMethod(null);
        a2.setTransformationMethod(null);

        int num1,num2;
        num1 = Integer.parseInt(a1.getText().toString());
        num2 = Integer.parseInt(a2.getText().toString());
        int ans = num1 + num2;

        TextView t = (TextView)findViewById(R.id.TVresult);
        t.setText("" + ans);
    }
    }

    public void subtract (View a){
        if(a.getId() == R.id.bsub){
            EditText a1 = (EditText)findViewById(R.id.TFnumber1);
            EditText a2 = (EditText)findViewById(R.id.TFnumber2);
            a1.setTransformationMethod(null);
            a2.setTransformationMethod(null);

            int num1,num2;
            num1 = Integer.parseInt(a1.getText().toString());
            num2 = Integer.parseInt(a2.getText().toString());
            int ans = num1 - num2;

            TextView t = (TextView)findViewById(R.id.TVresult);
            t.setText("" + ans);
        }
    }

    public void multiply (View a){
        if(a.getId() == R.id.bmult){
            EditText a1 = (EditText)findViewById(R.id.TFnumber1);
            EditText a2 = (EditText)findViewById(R.id.TFnumber2);
            a1.setTransformationMethod(null);
            a2.setTransformationMethod(null);

            int num1,num2;
            num1 = Integer.parseInt(a1.getText().toString());
            num2 = Integer.parseInt(a2.getText().toString());
            int ans = num1 * num2;

            TextView t = (TextView)findViewById(R.id.TVresult);
            t.setText("" + ans);
        }
    }

    public void divide (View a){
        if(a.getId() == R.id.bdivd){
            EditText a1 = (EditText)findViewById(R.id.TFnumber1);
            EditText a2 = (EditText)findViewById(R.id.TFnumber2);
            a1.setTransformationMethod(null);
            a2.setTransformationMethod(null);

            double num1,num2;
            num1 = Double.parseDouble(a1.getText().toString());
            num2 = Double.parseDouble(a2.getText().toString());
            double ans = num1 / num2;
            double precision = Math.pow(10, 5);
            double answer = (int) (ans * precision);
            ans = answer;
            ans /= precision;

            TextView t = (TextView)findViewById(R.id.TVresult);
            t.setText("" + ans);
        }
    }


}
