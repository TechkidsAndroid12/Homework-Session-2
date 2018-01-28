package com.example.qklahpita.homeworkss2;

import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etName = findViewById(R.id.et_name);
        EditText etEmail = findViewById(R.id.et_email);
        EditText etPass = findViewById(R.id.et_pass);
        EditText etConfirm = findViewById(R.id.et_confirm);

        etName.getBackground().setColorFilter(getResources()
                .getColor(R.color.textWhite), PorterDuff.Mode.SRC_IN);
        etEmail.getBackground().setColorFilter(getResources()
                .getColor(R.color.textWhite), PorterDuff.Mode.SRC_IN);
        etPass.getBackground().setColorFilter(getResources()
                .getColor(R.color.textWhite), PorterDuff.Mode.SRC_IN);
        etConfirm.getBackground().setColorFilter(getResources()
                .getColor(R.color.textWhite), PorterDuff.Mode.SRC_IN);
    }
}
