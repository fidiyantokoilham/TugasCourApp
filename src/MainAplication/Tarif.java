/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainAplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Tarif {
    
    public static List<Pengiriman> dataPengiriman() {
        Scanner scan;
        List<Pengiriman> model = new ArrayList<>();
        try{
        scan = new Scanner(new File("C:\\Users\\user\\Documents\\NetBeansProjects\\CourierApp\\src\\MainAplication\\harga.txt"));
        while (scan.hasNextLine()) {
            String namaDanHint = scan.nextLine();
            String[] data = namaDanHint.split(",");
            String namaKotaTujuan = data[0];
            String tipeReguler = data[1];
            double getTipeReguler = Double.parseDouble(tipeReguler);
            String tipeOneNightService = data [3];
            double getTipeOneNightService = Double.parseDouble(tipeOneNightService);
            String tipeEconomi = data [2];
            double getTipeEconomi = Double.parseDouble(tipeEconomi);
            String tipeSingleDayService = data[4];
            double getTipeSingleDayService = Double.parseDouble(tipeSingleDayService);
            String tipeHolidayService = data [5];
            double getTipeHolidayService = Double.parseDouble(tipeHolidayService);
            String provinsi = data [6];
            
            
            Pengiriman p = new Pengiriman();
              p.setKotaTujuan(namaKotaTujuan);
              p.setTipeReg(getTipeReguler);
              p.setTipeEconomi(getTipeEconomi);
              p.setTipeHolidayService(getTipeHolidayService);
              p.setTipeOneNightService(getTipeOneNightService);
              p.setTipeSingleDayService(getTipeSingleDayService);
              p.setProvinsi(provinsi);
            model.add(p);

        }}
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return model;
    }
}
