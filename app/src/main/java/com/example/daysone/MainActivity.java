package com.example.daysone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etKodeBarang, etJumlahBarang;
    private Button btnHitung;
    private TextView tvNamaBarang, tvHargaBarang, tvTotalHarga, tvDiscount, tvJumlahBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etKodeBarang = findViewById(R.id.etKodeBarang);
        etJumlahBarang = findViewById(R.id.etJumlahBarang);
        btnHitung = findViewById(R.id.btnHitung);
        tvNamaBarang = findViewById(R.id.tvNamaBarang);
        tvHargaBarang = findViewById(R.id.tvHargaBarang);
        tvTotalHarga = findViewById(R.id.tvTotalHarga);
        tvDiscount = findViewById(R.id.tvDiscount);
        tvJumlahBayar = findViewById(R.id.tvJumlahBayar);

        btnHitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnHitung) {
            String kodeBarang = etKodeBarang.getText().toString().trim();
            String jumlahBarang = etJumlahBarang.getText().toString().trim();
            String kode = kodeBarang.substring(0, 3);
            String disc = kodeBarang.substring(3, 5);

            boolean isikosong = false;
            if (TextUtils.isEmpty(kodeBarang)) {
                isikosong = true;
                etKodeBarang.setError("Kode barang harap di isi");
            }
            if (TextUtils.isEmpty(jumlahBarang)) {
                isikosong = true;
                etJumlahBarang.setError("Jumlah barang harap di isi");
            }
            if (!isikosong) {
                if (kode.equalsIgnoreCase("AND")) {
                    String merk = "Android";
                    Integer harga = 1000000;
                    Integer totalHarga = Integer.parseInt(jumlahBarang) * harga;
                    Integer discount = totalHarga * Integer.parseInt(disc) / 100;
                    Integer jumlah = totalHarga - discount;
                    tvNamaBarang.setText(merk);
                    tvHargaBarang.setText(String.valueOf(harga));
                    tvTotalHarga.setText(String.valueOf(totalHarga));
                    tvDiscount.setText(String.valueOf(discount));
                    tvJumlahBayar.setText(String.valueOf(jumlah));
                } else if (kode.equalsIgnoreCase("IOS")) {
                    String merk = "Apple";
                    Integer harga = 2000000;
                    Integer totalHarga = Integer.parseInt(jumlahBarang) * harga;
                    Integer discount = totalHarga * Integer.parseInt(disc) / 100;
                    Integer jumlah = totalHarga - discount;
                    tvNamaBarang.setText(merk);
                    tvHargaBarang.setText(String.valueOf(harga));
                    tvTotalHarga.setText(String.valueOf(totalHarga));
                    tvDiscount.setText(String.valueOf(discount));
                    tvJumlahBayar.setText(String.valueOf(jumlah));
                } else if (kode.equalsIgnoreCase("BLB")) {
                    String merk = "Black Berry";
                    Integer harga = 1750000;
                    Integer totalHarga = Integer.parseInt(jumlahBarang) * harga;
                    Integer discount = totalHarga * Integer.parseInt(disc) / 100;
                    Integer jumlah = totalHarga - discount;
                    tvNamaBarang.setText(merk);
                    tvHargaBarang.setText(String.valueOf(harga));
                    tvTotalHarga.setText(String.valueOf(totalHarga));
                    tvDiscount.setText(String.valueOf(discount));
                    tvJumlahBayar.setText(String.valueOf(jumlah));
                } else if (kode.equalsIgnoreCase("WNP")) {
                    String merk = "Windows Phone";
                    Integer harga = 2500000;
                    Integer totalHarga = Integer.parseInt(jumlahBarang) * harga;
                    Integer discount = totalHarga * Integer.parseInt(disc) / 100;
                    Integer jumlah = totalHarga - discount;
                    tvNamaBarang.setText(merk);
                    tvHargaBarang.setText(String.valueOf(harga));
                    tvTotalHarga.setText(String.valueOf(totalHarga));
                    tvDiscount.setText(String.valueOf(discount));
                    tvJumlahBayar.setText(String.valueOf(jumlah));
                }
            }

        }
    }
}