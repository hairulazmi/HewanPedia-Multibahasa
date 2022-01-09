package simple.example.hewanpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton btnSapi,btnMerpati,btnTurtle;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        inisialisasiView();
    }
    public void profile(View view) {
        Intent intent = new Intent(this, Profile2Activity.class);
        startActivity(intent);
    }
    ImageButton btnProfile;


    private void inisialisasiView() {
        btnSapi = findViewById(R.id.btn_buka_ras_sapi);
        btnMerpati = findViewById(R.id.btn_buka_ras_merpati);
        btnTurtle = findViewById(R.id.btn_buka_ras_turtle);
        btnProfile = findViewById(R.id.btn_profile);



        btnSapi.setOnClickListener(view -> bukaGaleri("Sapi"));
        btnMerpati.setOnClickListener(view -> bukaGaleri("Merpati"));
        btnTurtle.setOnClickListener(view -> bukaGaleri("Turtle"));
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, Profile2Activity.class);
                startActivity(intentLoadNewActivity);

            }
        });


    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity sapi");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }
}