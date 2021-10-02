package com.example.a210929;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit;
    TextView text;
    Button btn;

    String EditedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));

        setContentView(baseLayout, params);

        Button btn = new Button(this);
        btn.setText("버튼입니다");
        baseLayout.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "TEST", Toast.LENGTH_SHORT).show();
            }
        });*/

        edit = (EditText) findViewById(R.id.Edit1);
        text = (TextView) findViewById(R.id.Text1);
        btn = (Button) findViewById(R.id.Btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                EditedText = edit.getText().toString();
                if(EditedText.length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "입력을 해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                text.setText(EditedText);
            }
        });





    }
}