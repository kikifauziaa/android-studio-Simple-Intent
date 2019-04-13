package com.fauziahrizky.intent_tugas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private  static  final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.fauziahrizky.intent_tugas.extra.MESSAGE";
    private EditText namaText, AlamatText, HpText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        namaText = findViewById(R.id.editText_nama);
        AlamatText = findViewById(R.id.editText_alamat);
        HpText = findViewById(R.id.editText_hp);
    }

    public void pindah(View view){
        Log.d(LOG_TAG, "klik button");
        Intent intent = new Intent(this, activity2.class);
        String message = namaText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }
}
