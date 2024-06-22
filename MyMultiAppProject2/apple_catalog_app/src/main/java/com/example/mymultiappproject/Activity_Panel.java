package com.example.mymultiappproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.common.Activity_PanelBase;

public class Activity_Panel extends Activity_PanelBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dataManagerBase = new DataManagerAppleCatalog();
        super.onCreate(savedInstanceState);
    }
}
