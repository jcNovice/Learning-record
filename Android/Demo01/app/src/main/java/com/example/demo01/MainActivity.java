package com.example.demo01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.et_1);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("111", "改前");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("111", "改中");
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("111", "改后");
            }
        });

        radioGroup = findViewById(R.id.rg_1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                Toast.makeText(MainActivity.this,radioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showToast(View view) {
        Toast.makeText(this,"我被点击了",Toast.LENGTH_SHORT).show();
    }
}