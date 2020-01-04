package com.firebaseapp.pertemuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnTambah, btnMinus, btnKali, btnBagi;
    TextView result;
    EditText edt1, edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialiasisa
        //button
        btnTambah = findViewById(R.id.tbn_tambah);
        btnMinus = findViewById(R.id.tbn_minus);
        btnKali = findViewById(R.id.tbn_kali);
        btnBagi = findViewById(R.id.tbn_bagi);

        //textview
        result = findViewById(R.id.hasil);

        //edittext
        edt1 = findViewById(R.id.edt_1);
        edt2 = findViewById(R.id.edt_2);

        //kasih event clik
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //bikin variabel
                    int nilai1, nilai2, hasil;
                    //mengambil nilai dari edittext
                    nilai1 = Integer.parseInt(edt1.getText().toString());
                    nilai2 = Integer.parseInt(edt2.getText().toString());

                    hasil = nilai1 + nilai2;
                    result.setText("Hasil : "+hasil);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Nilai yang anda masukan salah!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
