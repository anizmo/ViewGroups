package edu.neu.madcourse.viewgroups;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

/**
 * Here, we will see the usage of a Linear Layout, play with the application by toggling the
 * checkbox values and see the behaviour of the view-group layout.
 */
public class ConstraintLayoutActivity extends AppCompatActivity {

    private View redBlock;

    private View greenBlock;

    private View blueBlock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        // Initializing the colored blocks
        redBlock = findViewById(R.id.redBlock);
        greenBlock = findViewById(R.id.greenBlock);
        blueBlock = findViewById(R.id.blueBlock);

        // Initializing the checkboxes
        CheckBox redCheckBox = findViewById(R.id.redCheckBox);
        CheckBox greenCheckBox = findViewById(R.id.greenCheckBox);
        CheckBox blueCheckBox = findViewById(R.id.blueCheckBox);

        // Set a listener to get updates of the checkbox
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

        // Set a listener to get updates of the checkbox
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

        // Set a listener to get updates of the checkbox
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