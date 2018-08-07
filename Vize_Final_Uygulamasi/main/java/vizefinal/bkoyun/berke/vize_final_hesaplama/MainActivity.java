package vizefinal.bkoyun.berke.vize_final_hesaplama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public Button BtnHesapla;

    public EditText TxtVizeNot;
    public EditText TxtFinalNot;

    public TextView LblOrtalama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnHesapla = (Button)findViewById(R.id.BtnHesapla);
        TxtVizeNot = (EditText)findViewById(R.id.TxtVize);
        TxtFinalNot = (EditText)findViewById(R.id.TxtFinal);
        LblOrtalama = (TextView)findViewById(R.id.LblSonuc);

        BtnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double vizeNot;
                double finalNot;
                double ortalama;

                vizeNot = Integer.parseInt(TxtVizeNot.getText().toString()) * 0.40;
                finalNot = Integer.parseInt(TxtFinalNot.getText().toString()) * 0.60;

                ortalama = (vizeNot + finalNot);
                if(vizeNot <0 || vizeNot>100 || finalNot<0 || finalNot>100)
                {
                    LblOrtalama.setText("Geçersiz Değer Girildi...");
                }
                else {
                    LblOrtalama.setText("Ortalama : " + Double.toString(ortalama));
                }
            }
        });

    }
}
