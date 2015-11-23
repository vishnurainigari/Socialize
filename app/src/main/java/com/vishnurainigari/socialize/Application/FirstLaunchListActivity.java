package com.vishnurainigari.socialize.Application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.vishnurainigari.socialize.R;

public class FirstLaunchListActivity extends AppCompatActivity {

    TextView descriptionTextview;
    Button workbtn;
    Button personalbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_launch_list);

        descriptionTextview = (TextView) findViewById(R.id.descriptionTextView);
        descriptionTextview.setText(getResources().getString(R.string.description_text_view));
        workbtn = (Button) findViewById(R.id.work_btn);
        workbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstLaunchListActivity.this,"work button clicked",Toast.LENGTH_LONG).show();
            }
        });
        personalbtn = (Button) findViewById(R.id.personal_btn);
        personalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstLaunchListActivity.this,"personal button clicked",Toast.LENGTH_LONG).show();
            }
        });
    }
}
