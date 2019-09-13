package com.dian.proyekutama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Aktifitas";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void munculToast(View view){
        Toast.makeText(getApplicationContext(),"Sisfo OK", Toast.LENGTH_SHORT).show();

    }

    public void munculLog(View view){
        Log.i(TAG, "Ini mestinya muncul di logcat");
    }

    public void menujuKedua(View view){
        Intent intent = new Intent(this, KeduaActivity.class);
        startActivity(intent);

    }


}
