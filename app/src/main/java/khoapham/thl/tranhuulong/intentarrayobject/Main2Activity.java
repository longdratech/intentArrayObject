package khoapham.thl.tranhuulong.intentarrayobject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        ArrayList<SinhVien> sinhViens = intent.getParcelableArrayListExtra("sv");
        Log.d("BBB",sinhViens.size()+"");

        for(SinhVien sv : sinhViens){
            Log.d("BBB",sv.getTen()+sv.getLop() +sv.getTuoi());
        }
      //  Log.d("BBB",);



    }
}
