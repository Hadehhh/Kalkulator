package com.example.kalkulatorsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kalkulatorsederhana.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btnTambah.setOnClickListener() {
            tambah()
        }
        binding.btnKurang.setOnClickListener() {
            kurang()
        }
        binding.btnKali.setOnClickListener() {
            kali()
        }
        binding.btnBagi.setOnClickListener() {
            bagi()
        }
        binding.btnClear.setOnClickListener() {
            clear()
        }
        setContentView(binding.root)
        supportActionBar?.title = "Kalkulator"
    }

    private fun tambah() {
        var angka1 = binding.etAngka1.text.toString().toInt()
        var angka2 = binding.etAngka2.text.toString().toInt()
        var angka3 = angka1 + angka2
        binding.tvHasil.text = "${angka1} + ${angka2} = ${angka3}"
    }

    private fun kurang() {
        var angka1 = binding.etAngka1.text.toString().toInt()
        var angka2 = binding.etAngka2.text.toString().toInt()
        var angka3 = angka1 - angka2
        binding.tvHasil.text = "${angka1} - ${angka2} = ${angka3}"
    }

    private fun kali() {
        var angka1 = binding.etAngka1.text.toString().toInt()
        var angka2 = binding.etAngka2.text.toString().toInt()
        var angka3 = angka1 * angka2
        binding.tvHasil.text = "${angka1} * ${angka2} = ${angka3}"
    }

    private fun bagi() {
        var angka1 = binding.etAngka1.text.toString().toInt()
        var angka2 = binding.etAngka2.text.toString().toInt()
        var angka3 = angka1.toDouble()/ angka2.toDouble()
        binding.tvHasil.text = "${angka1} / ${angka2} = ${angka3}"
    }

    private fun clear() {
        binding.etAngka1.text.clear()
        binding.etAngka2.text.clear()
        binding.tvHasil.text = "Hasil"
    }
}