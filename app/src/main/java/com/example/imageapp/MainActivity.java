package com.example.imageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import com.example.imageapp.R;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private ImageButton ibutton;
    private CheckBox cbox;
    private RadioGroup rgroup;
    private RadioButton rbutton;
    private Switch Switch;
    private int i=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.img);
        ibutton=findViewById(R.id.ibutton);
        cbox=findViewById(R.id.cbox);
        rgroup=findViewById(R.id.rgroup);
        Switch=findViewById(R.id.Switch);
    }
    public void onImageClick(View view)
    {
        i=(i+1)%2;
        if(i==1)
            ibutton.setBackgroundResource(R.drawable.pause512);
        else
            ibutton.setBackgroundResource(R.drawable.play512);

    }
    public void onButtonClicked(View view)
    {
        if(!Switch.isChecked())
            img.setVisibility(View.VISIBLE);
        else
            img.setVisibility(View.INVISIBLE);

        if(cbox.isChecked())
            ibutton.setVisibility(View.VISIBLE);
        else
            ibutton.setVisibility(View.INVISIBLE);
        int id=rgroup.getCheckedRadioButtonId();
        rbutton=findViewById(id);
        boolean i=rbutton.getText().equals("Enabled");
        ibutton.setClickable(i);
    }


}
