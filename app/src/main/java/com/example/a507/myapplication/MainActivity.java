package com.example.a507.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

 protected  Button btCount;
    protected TextView tvCount;
    protected int nCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCount = (Button)findViewById(R.id.btCount);
        btCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nCount++;
                String sCount = String.format("Count = %d", nCount);
                tvCount.setText(sCount);
                Toast.makeText(getBaseContext(), sCount, Toast.LENGTH_SHORT).show();
            }
        });
        tvCount = (TextView) findViewById(R.id.tvCount);

        nCount = 0;

    }
}
