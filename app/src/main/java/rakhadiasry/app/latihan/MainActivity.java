package rakhadiasry.app.latihan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Rakha Diasry on 01/10/2018.
 */

public class MainActivity extends AppCompatActivity {
    private EditText edtData;
    private Button btnsubmit;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtData = (EditText) findViewById(R.id.edt_data);
        btnsubmit = (Button) findViewById(R.id.btn_submit);
        btnSubmitClicked();
    }

    private void btnSubmitClicked(){
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtData.getText().toString();
                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                detailIntent.putExtra("dataku", data );
                startActivity(detailIntent);

            }
        });
    }
}
