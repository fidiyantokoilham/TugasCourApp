/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainAplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PengirimanDao {

    Pengiriman p;

    public Pengiriman hitungHarga(String namaKota, int berat) {
        p = new Pengiriman();

        List<Pengiriman> listKota = Tarif.dataPengiriman();
        for (Pengiriman pengiriman : listKota) {
            if (namaKota.equalsIgnoreCase(pengiriman.getKotaTujuan())) {
                p.setBerat(berat);
                p.setKotaTujuan(namaKota);
                p.setTipeReg(pengiriman.getTipeReg());
                p.setProvinsi(pengiriman.getProvinsi());
                p.setTipeEconomi(pengiriman.getTipeEconomi());
                p.setTipeHolidayService(pengiriman.getTipeHolidayService());
                p.setTipeOneNightService(pengiriman.getTipeOneNightService());
                p.setTipeSingleDayService(pengiriman.getTipeSingleDayService());

                p.hitungBiayaEco();
                p.hitungBiayaHs();
                p.hitungBiayaOns();
                p.hitungBiayaSds();
                p.hitungBiayaReg();
            }
        }
        return p;
    }

    public double hitungHargaArusansi(double harga) {
        double asuransi = harga * 0.03;
        return asuransi;

    }
}
