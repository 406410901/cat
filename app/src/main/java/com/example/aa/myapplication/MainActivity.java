package com.example.aa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int size=20;
    public void response(View v){
        EditText ed1,ed2,ed3;
        TextView txv,txv2;
        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        ed3 = findViewById(R.id.editText3);
        txv = findViewById(R.id.textView);
        txv2 =findViewById(R.id.textView2);

        float height = Float.parseFloat(ed2.getText().toString());
        float weight = Float.parseFloat(ed3.getText().toString());
        float BMI1 =calculateBMI(height,weight);
        String BMI2=String.valueOf(BMI1);

        txv.setTextSize(size);
        txv.setText(ed1.getText().toString()+"您好\n"+"您的BMI是:"+BMI2);
        txv2.setTextSize(size);
        txv2.setText(standardBMI(BMI1));
    }

    private float calculateBMI(float ht,float wt){
        float BMI =(float)(wt/ Math.pow((ht/100),2));
        return BMI;
    }

    private String standardBMI(double st){
        String alert="";
        if(st>25){
            alert =String.valueOf("You are too heavy!!");
        }
        else if(st<18.5){
            alert =String.valueOf("You are too slim!!");
        }
        else{
            alert =String.valueOf("You are good!!");
        }
        return alert;
    }

}
