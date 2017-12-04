/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainAplication;

/**
 *
 * @author user
 */
public class Pengiriman {
    private double berat;
    private double hargaBarang;
    private String kotaTujuan;
    private double tipeReg;
    private double tipeOneNightService;
    private double tipeEconomi;
    private double tipeSingleDayService;
    private double tipeHolidayService;
    private String provinsi;
    private double hargaPaket;
    private double totalHarga;
    private double hargaAsuransi;
    
    public double hitungBiayaReg(){
        return this.tipeReg = this.berat * tipeReg ;
                
    }
    
    public double hitungBiayaOns(){
        return tipeOneNightService = this.berat * this.tipeOneNightService;
    }
    
    public double hitungBiayaEco(){
    return tipeEconomi = this.berat * this.tipeEconomi;
    }
    
    public double hitungBiayaHs(){
    return tipeHolidayService = this.berat * this.tipeHolidayService;
    }
    public double hitungBiayaSds(){
    return tipeSingleDayService = this.berat * this.tipeSingleDayService;
    }
    /**
     * @return the berat
     */
    public double getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(int berat) {
        this.berat = berat;
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the kotaTujuan
     */
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    /**
     * @param kotaTujuan the kotaTujuan to set
     */
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    /**
     * @return the tipeReg
     */
    public double getTipeReg() {
        return tipeReg;
    }

    /**
     * @param tipeReg the tipeReg to set
     */
    public void setTipeReg(double tipeReg) {
        this.tipeReg = tipeReg;
    }

    /**
     * @return the tipeOneNightService
     */
    public double getTipeOneNightService() {
        return tipeOneNightService;
    }

    /**
     * @param tipeOneNightService the tipeOneNightService to set
     */
    public void setTipeOneNightService(double tipeOneNightService) {
        this.tipeOneNightService = tipeOneNightService;
    }

    /**
     * @return the tipeEconomi
     */
    public double getTipeEconomi() {
        return tipeEconomi;
    }

    /**
     * @param tipeEconomi the tipeEconomi to set
     */
    public void setTipeEconomi(double tipeEconomi) {
        this.tipeEconomi = tipeEconomi;
    }

    /**
     * @return the tipeSingleDayService
     */
    public double getTipeSingleDayService() {
        return tipeSingleDayService;
    }

    /**
     * @param tipeSingleDayService the tipeSingleDayService to set
     */
    public void setTipeSingleDayService(double tipeSingleDayService) {
        this.tipeSingleDayService = tipeSingleDayService;
    }

    /**
     * @return the tipeHolidayService
     */
    public double getTipeHolidayService() {
        return tipeHolidayService;
    }

    /**
     * @param tipeHolidayService the tipeHolidayService to set
     */
    public void setTipeHolidayService(double tipeHolidayService) {
        this.tipeHolidayService = tipeHolidayService;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    @Override
    public String toString() {
        return getKotaTujuan();
    }

    /**
     * @return the totalHarga
     */
    public double getTotalHarga() {
        return totalHarga;
    }

    /**
     * @param totalHarga the totalHarga to set
     */
    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    /**
     * @return the totalHargaWithAsuransi
     */
    public double getTotalHargaWithAsuransi() {
        return getHargaAsuransi();
    }

    /**
     * @param totalHargaWithAsuransi the totalHargaWithAsuransi to set
     */
    public void setTotalHargaWithAsuransi(double totalHargaWithAsuransi) {
        this.setHargaAsuransi(totalHargaWithAsuransi);
    }

    /**
     * @return the hargaPaket
     */
    public double getHargaPaket() {
        return hargaPaket;
    }

    /**
     * @param hargaPaket the hargaPaket to set
     */
    public void setHargaPaket(double hargaPaket) {
        this.hargaPaket = hargaPaket;
    }

    /**
     * @return the hargaAsuransi
     */
    public double getHargaAsuransi() {
        return hargaAsuransi;
    }

    /**
     * @param hargaAsuransi the hargaAsuransi to set
     */
    public void setHargaAsuransi(double hargaAsuransi) {
        this.hargaAsuransi = hargaAsuransi;
    }
    
    
    
    
}
