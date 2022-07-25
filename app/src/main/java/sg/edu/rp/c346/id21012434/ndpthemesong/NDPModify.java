package sg.edu.rp.c346.id21012434.ndpthemesong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class NDPModify extends AppCompatActivity {
    TextView tvID, tvTitle, tvSing, tvyear, tvStars;
    EditText etID, etSongTitle, etSingers,etYear;
    RadioGroup rg;
    RadioButton option1, option2, option3, option4, option5;
    Button btnUpdate, btnDelete, btnCancel;
    Song data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndpmodify);

        tvID=findViewById(R.id.tvID);
        tvTitle=findViewById(R.id.tvTitle);
        tvSing=findViewById(R.id.tvSing);
        tvyear=findViewById(R.id.tvyear);
        tvStars=findViewById(R.id.tvStars);
        etID=findViewById(R.id.etSongID);
        etSongTitle=findViewById(R.id.etTitle);
        etSingers=findViewById(R.id.etSingers);
        etYear=findViewById(R.id.etYear);
        rg=findViewById(R.id.RadioGroup);
        option1=findViewById(R.id.option1);
        option2=findViewById(R.id.option2);
        option3=findViewById(R.id.option3);
        option4=findViewById(R.id.option4);
        option5=findViewById(R.id.option5);
        btnUpdate=findViewById(R.id.btnUpdate);
        btnDelete=findViewById(R.id.btnDelete);
        btnCancel=findViewById(R.id.btnCancel);

        Intent i = getIntent();
        data = (Song) i.getSerializableExtra("data");

        tvID.setText("ID: " + data.getId());
        etID.setText(data.getSongContent());


    }
}