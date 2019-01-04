package com.example.r2_l2.notes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity {
    Button mainButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            openFileInput("metaData");
        }catch(FileNotFoundException e){
            File metaData = new File(getFilesDir(),"metaData");
        }
        //for(String name : fileList()){
        //    boolean hasMetaData = false;
        //    if(name == "metaData"){
        //
        //    }
        //}
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton = findViewById(R.id.newButton);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File file = new File(getFilesDir(),"Enter Title");
                //TODO
                //Make button
                //add to the Card View Layout
                //set parameters such that it fits in the space with other buttons
                //make it permanent??? (aw jeez rick this parts gonna be rough)
            }
        });
    }
}
