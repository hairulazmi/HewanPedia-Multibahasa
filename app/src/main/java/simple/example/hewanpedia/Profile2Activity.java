package simple.example.hewanpedia;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Profile2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}