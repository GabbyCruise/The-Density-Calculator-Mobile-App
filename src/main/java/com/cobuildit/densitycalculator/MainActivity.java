package com.cobuildit.densitycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText texInput;
    TextView disp1, disp2, disp3, disp4, disp5, disp6;

    Button btnAction, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*final ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.density_calculator);
        setContentView(imageView);*/
        setContentView(R.layout.activity_main);

        texInput = (EditText)findViewById(R.id.textInput);
        disp1 = (TextView)findViewById(R.id.disp1);
        disp2 = (TextView)findViewById(R.id.disp2);
        disp3 = (TextView)findViewById(R.id.disp3);
        disp4 = (TextView)findViewById(R.id.disp4);
        disp5 = (TextView)findViewById(R.id.disp5);
        disp6 = (TextView)findViewById(R.id.disp6);

        btnAction = (Button)findViewById(R.id.btnAction);
        btnClear = (Button)findViewById(R.id.btnClear);


        btnAction.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

               // try {

                    if (texInput.getText().toString().trim().isEmpty()){
                        Toast.makeText(getApplicationContext(), "Please Enter Plot Size to Continue", Toast.LENGTH_SHORT).show();
                    } else {
                        double hd = Double.valueOf(texInput.getText().toString());
                        double result = (hd / 750) * 8;
                        String ans = String.format("%.2f", result);
                        disp1.setText(ans);

                        // high density minimum
                        double hd1 = Double.valueOf(texInput.getText().toString());
                        double result1 = (hd1 / 750) * 6;
                        String ans1 = String.format("%.2f", result1);
                        disp2.setText(ans1);

                        //medium density maximum
                        double md = Double.valueOf(texInput.getText().toString());
                        double resultmd = (md / 1500) * 6;
                        String mdans = String.format("%.2f", resultmd);
                        disp3.setText(mdans);

                        //medium density minimum
                        double md1 = Double.valueOf(texInput.getText().toString());
                        double md1result = (md1 / 1500) * 4;
                        String md1ans = String.format("%.2f", md1result);
                        disp4.setText(md1ans);

                        //low density maximum
                        double ld = Double.valueOf(texInput.getText().toString());
                        double ldresult = (ld / 1500) * 2;
                        String ldans = String.format("%.2f", ldresult);
                        disp5.setText(ldans);

                        //low density minimum
                        double ld1 = Double.valueOf(texInput.getText().toString());
                        double ld1result = (ld1 / 1500);
                        String ld1ans = String.format("%.2f", ld1result);
                        disp6.setText(ld1ans);
                    }
                //}catch(Exception ex){
                       // return;
                   // }

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if (disp1.getText().toString().trim().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Field is Empty", Toast.LENGTH_SHORT).show();
                } else {
                disp1.setText(" ");
                disp2.setText(" ");
                disp3.setText(" ");
                disp4.setText(" ");
                disp5.setText(" ");
                disp6.setText(" ");
                texInput.setText(" ");
            }
            }
        });

    }

}