package com.codingblocks.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etnum1;
    EditText etnum2;
    TextView tvresult;
    Button btnadd;
    Button btnsub;
    Button btnmul;
    Button btndiv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnum1=(EditText)findViewById(R.id.etnum1);
        etnum2=(EditText)findViewById(R.id.etnum2);
        tvresult=(TextView)findViewById(R.id.tvresult);
        btnadd=(Button)findViewById(R.id.btnadd);
        btnsub=(Button)findViewById(R.id.btnsub);
        btnmul=(Button)findViewById(R.id.btnmul);
        btndiv=(Button)findViewById(R.id.btndiv);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtract();
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiply();
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divide();
            }
        });




    }
    public void add(){
    int a = Integer.valueOf(etnum1.getText().toString());
    int b = Integer.valueOf(etnum2.getText().toString());
        tvresult.setText(String.valueOf(a + b));}
    public void subtract(){
        int a = Integer.valueOf(etnum1.getText().toString());
        int b = Integer.valueOf(etnum2.getText().toString());
        tvresult.setText(String.valueOf(a - b));}
    public void multiply(){
        int a = Integer.valueOf(etnum1.getText().toString());
        int b = Integer.valueOf(etnum2.getText().toString());
        tvresult.setText(String.valueOf(a * b));}
    public void divide(){
        int a = Integer.valueOf(etnum1.getText().toString());
        int b = Integer.valueOf(etnum2.getText().toString());
        tvresult.setText(String.valueOf(a / b));}
}
