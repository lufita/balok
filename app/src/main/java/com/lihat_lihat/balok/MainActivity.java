package com.lihat_lihat.balok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input_panjang,input_lebar,input_tinggi;
    Button button,hitung;
    TextView text_luas;
    String luas="Hasil Luas Permukaan Balok adalah ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_panjang=(EditText)findViewById(R.id.input_panjang);
        input_lebar=(EditText)findViewById(R.id.input_lebar);
        input_tinggi=(EditText)findViewById(R.id.input_tinggi);
        text_luas=(TextView)findViewById(R.id.text_luas);
        button=(Button)findViewById(R.id.button);
        hitung=(Button)findViewById(R.id.permukaan);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_luas.setText(luas + String.valueOf(2*(Integer.valueOf(input_panjang.getText().toString())* Integer.valueOf(input_lebar.getText().toString())
                        + Integer.valueOf(input_panjang.getText().toString())* Integer.valueOf(input_tinggi.getText().toString())
                        + Integer.valueOf(input_lebar.getText().toString())*Integer.valueOf(input_tinggi.getText().toString()))));
            }
        });

    }
    public void button(View view)
    {
        Toast.makeText(this,"Duwi Lufita Marfiana",Toast.LENGTH_SHORT).show();
    }
}
