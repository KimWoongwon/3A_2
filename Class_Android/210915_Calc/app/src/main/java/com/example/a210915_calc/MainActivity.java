package com.example.a210915_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button add, sub, div, mul;
    TextView textResult;
    Float num1, num2;
    Float result;

    void GetFloat()
    {
        num1 = Float.parseFloat(edit1.getText().toString());
        num2 = Float.parseFloat(edit2.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기");
        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        add = (Button) findViewById(R.id.BtnAdd);
        sub = (Button) findViewById(R.id.BtnSub);
        div = (Button) findViewById(R.id.BtnDiv);
        mul = (Button) findViewById(R.id.BtnMul);

        textResult = (TextView) findViewById(R.id.TextResult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GetFloat();
                result = num1 + num2;
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GetFloat();
                result = num1 - num2;
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GetFloat();
                if(num1 == 0 || num2 == 0)
                {
                    Toast.makeText(getApplicationContext(), "0으로 나눌수 없습니다.", Toast.LENGTH_SHORT).show();
                    return;
                }
                result = num1 / num2;
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GetFloat();
                result = num1 * num2;
                textResult.setText("계산 결과 : " + result.toString());
            }
        });



    }
}