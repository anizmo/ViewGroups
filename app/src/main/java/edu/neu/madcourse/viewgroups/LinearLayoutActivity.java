package edu.neu.madcourse.viewgroups;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class LinearLayoutActivity extends AppCompatActivity {

    private View redBlock;
    private View greenBlock;
    private View blueBlock;

    private CheckBox redCheckBox;
    private CheckBox greenCheckBox;
    private CheckBox blueCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        redBlock = findViewById(R.id.redBlock);
        greenBlock = findViewById(R.id.greenBlock);
        blueBlock = findViewById(R.id.blueBlock);

        redCheckBox = findViewById(R.id.redCheckBox);
        greenCheckBox = findViewById(R.id.greenCheckBox);
        blueCheckBox = findViewById(R.id.blueCheckBox);

        redCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    redBlock.setVisibility(View.VISIBLE);
                } else {
                    redBlock.setVisibility(View.GONE);
                }
            }
        });

        greenCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    greenBlock.setVisibility(View.VISIBLE);
                } else {
                    greenBlock.setVisibility(View.GONE);
                }
            }
        });

        blueCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    blueBlock.setVisibility(View.VISIBLE);
                } else {
                    blueBlock.setVisibility(View.GONE);
                }
            }
        });

    }
}