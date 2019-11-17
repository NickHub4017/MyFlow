package com.nickhub.cashflow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nickhub.cashflow.dao.TagDao;
import com.nickhub.cashflow.dblayer.HandleDB;
import com.nickhub.cashflow.entity.Tag;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
