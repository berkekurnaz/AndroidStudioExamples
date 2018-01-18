package com.example.berke.hesapla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText TxtVize;
    EditText TxtFinal;
    Button BtnHesap;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtVize=(EditText)findViewById(R.id.TxtVize);
        TxtFinal=(EditText)findViewById(R.id.TxtFinal);
        BtnHesap=(Button)findViewById(R.id.BtnHesap);
        sonuc=(TextView)findViewById(R.id.sonuc);
    }

    public void hesapla(View view)
    {
        double vize,fnal;
        double ortalama;

        vize = Integer.parseInt(TxtVize.getText().toString())*0.40;
        fnal =Integer.parseInt(TxtFinal.getText().toString())*0.60;

        ortalama=(vize+fnal);

        sonuc.setText(Double.toString(ortalama));

    }
}
