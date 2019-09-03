package khoapham.thl.tranhuulong.intentarrayobject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                ArrayList<SinhVien> sinhViens = new ArrayList<>();
                sinhViens.add(new SinhVien("Long dep trai", "AT12L",22));
                 sinhViens.add(new SinhVien("Long xau trai", "AT12K",24));

                 Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                 intent.putExtra("sv", sinhViens);
                 startActivity(intent);
             }
         });


    }
}
