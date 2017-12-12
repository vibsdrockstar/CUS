package com.example.vibhor.contactform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OpenDetails(View view) {
        switch (view.getId()) {
            case R.id.b_dev:
                startActivity(new Intent(this, Devpage.class));
                break;

            case R.id.b_test:
                startActivity(new Intent(this, TestPage.class));
                break;
            case R.id.b_sales:
                startActivity(new Intent(this, SalesPage.class));
                break;
        }
    }
        }



