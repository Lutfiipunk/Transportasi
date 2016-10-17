package id.sch.smktelkom_mlg.xiirpl2025.tugas001.transportasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama, etLokasi;
    TextView tvHasil;
    Button bOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editText2);
        etLokasi = (EditText) findViewById(R.id.editText);
        bOk = (Button) findViewById(R.id.button2);
        tvHasil = (TextView) findViewById(R.id.textView);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHasil();
            }
        });

    }

    private void goHasil() {
        String nama = etNama.getText().toString();
        tvHasil.setText("Pelanggan yang bernama" + nama);

    }
}