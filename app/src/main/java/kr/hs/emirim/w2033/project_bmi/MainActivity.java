package kr.hs.emirim.w2033.project_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editW, editH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editW = findViewById(R.id.edit_weight);
        editH = findViewById(R.id.edit_height);
        Button btnCheck = findViewById(R.id.btn_check);
        btnCheck.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            double weight = Double.parseDouble(editW.getText().toString());
            double height = Double.parseDouble(editH.getText().toString());
            Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
            intent.putExtra("weight",weight);
            intent.putExtra("height",height);
            startActivity(intent);
        }
    };
}