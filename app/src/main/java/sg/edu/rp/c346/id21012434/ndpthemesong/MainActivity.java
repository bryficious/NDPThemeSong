package sg.edu.rp.c346.id21012434.ndpthemesong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvSongTitle, tvSingers, tvYear, tvRating;
    EditText etSongTitle, etSingers, etYear;
    RadioButton option1, option2, option3, option4, option5;
    Button btnAdd, btnShowList;
    Song data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSongTitle=findViewById(R.id.tvSongTitle);
        tvSingers=findViewById(R.id.tvSinger);
        tvYear=findViewById(R.id.tvYear);
        tvRating=findViewById(R.id.tvRating);
        etSongTitle=findViewById(R.id.tvEditSongtitle);
        etSingers=findViewById(R.id.tvEditSingers);
        etYear=findViewById(R.id.tvEditYear);
        option1=findViewById(R.id.option1);
        option2=findViewById(R.id.option2);
        option3=findViewById(R.id.option3);
        option4=findViewById(R.id.option4);
        option5=findViewById(R.id.option5);
        btnAdd=findViewById(R.id.btnAdd);
        btnShowList=findViewById(R.id.btnShowList);
        Intent i = getIntent();
        data = (Song) i.getSerializableExtra("data");

    }
}