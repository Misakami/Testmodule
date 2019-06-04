package com.example.testmodule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.mylibrary.MySdkTest;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sdk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        sdk = (Button) findViewById(R.id.sdk);

        sdk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sdk:
                Intent intent = new Intent(MainActivity.this, MySdkTest.class);
                startActivity(intent);
                break;
            default:
        }
    }
}
