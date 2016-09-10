package id.sch.smktelkom_mlg.tugas01.xirpl6033.tugas1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    RadioGroup rgOrgan;
    CheckBox cbBasket;
    CheckBox cbPaski;
    CheckBox cbMetic;
    CheckBox cbBdi;
    Spinner spKelas;
    Button bDaftar;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.editTextNama);
        rgOrgan = (RadioGroup) findViewById(R.id.radioGroupOrgan);
        cbBasket = (CheckBox) findViewById(R.id.checkBoxBasket);
        cbPaski = (CheckBox) findViewById(R.id.checkBoxPaski);
        cbMetic = (CheckBox) findViewById(R.id.checkBoxMetic);
        cbBdi = (CheckBox) findViewById(R.id.checkBoxBdi);
        spKelas = (Spinner) findViewById(R.id.spinnerKelas);
        bDaftar = (Button) findViewById(R.id.buttonDaftar);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        bDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
            }

            private void doClick() {
                String hasil = null;
                String tugas = "";
                String tugas2 = "";
                String tugas3 = "";
                String tugas4 = "";

                String nama = etNama.getText().toString();
                if (cbBasket.isChecked()) {
                    tugas = cbBasket.getText().toString();
                }
                if (cbPaski.isChecked()) {
                    tugas = cbPaski.getText().toString();
                }
                if (cbMetic.isChecked()) {
                    tugas = cbMetic.getText().toString();
                }
                if (cbBdi.isChecked()) {
                    tugas = cbBdi.getText().toString();
                }
                if (rgOrgan.getCheckedRadioButtonId() != -1) {
                    RadioButton rb = (RadioButton)
                            findViewById(rgOrgan.getCheckedRadioButtonId());
                    hasil = rb.getText().toString();
                    tvHasil.setText(nama + " " + spKelas.getSelectedItem().toString() + hasil + " Mengikuti " + tugas + " " + tugas2 +
                            " " + tugas3 + " " + tugas4);
                }
            }
        });

    }
    }


