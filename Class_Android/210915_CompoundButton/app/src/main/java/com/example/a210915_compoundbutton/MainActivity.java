package com.example.a210915_compoundbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt1, txt2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rDog, rCat, rRabbit;
    Button btnOK;
    ImageView ImagePet;

    void GetActions()
    {
        txt1 = (TextView) findViewById(R.id.Text1);
        chkAgree = (CheckBox) findViewById(R.id.ChkAgree);

        txt2 = (TextView) findViewById(R.id.Text2);

        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rDog = (RadioButton) findViewById(R.id.RbtnDog);
        rCat = (RadioButton) findViewById(R.id.RbtnCat);
        rRabbit = (RadioButton) findViewById(R.id.RbtnRabbit);

        btnOK = (Button) findViewById(R.id.BtnOK);

        ImagePet = (ImageView) findViewById(R.id.ImagePet);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("애완동물 사진 보기");

        GetActions();

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkAgree.isChecked())
                {
                    txt2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    ImagePet.setVisibility(View.VISIBLE);
                }
                else
                {
                    txt2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    ImagePet.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rGroup1.getCheckedRadioButtonId())
                {
                    case R.id.RbtnDog:
                        ImagePet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.RbtnCat:
                        ImagePet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.RbtnRabbit:
                        ImagePet.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "동물을 먼저 선택해주세요", Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}