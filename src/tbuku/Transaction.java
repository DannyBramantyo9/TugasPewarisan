/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbuku;

/**
 *
 * @author SMK TELKOM
 */
public class Transaction {
    public static void main(String[] args) {
        Buyer akhir = new Buyer("B4BA","PBO itu Mudah","Cahaya Dunia","5000","MGK11","Tyo","Sawopisah","911");
        akhir.detail();
        Transaction cashier = new Transaction();
        cashier.setKasir("Yoyok");
        cashier.setDate("4/5/2018");
        cashier.setTotal("Rp. 5.000,00");
        cashier.date();
        cashier.Total();
        cashier.namaKasir();
    }
    private String Kasir,Date,Total;
    public void setTotal(String total){
        Total = total;
    }
    public String getTotal(){
        return Total;
    }
    public void setDate(String date){
        Date = date;
    }
    public String getDate(){
        return Date;
    }
    public void setKasir(String kasir){
        Kasir = kasir;
    }
    public String getKasir(){
        return Kasir;
    }
    public void namaKasir(){
        System.out.println("Kasir = "+getKasir());
    }
    public void date(){
        System.out.println("\n Pembayaran \n");
        System.out.println("Tanggal = "+getDate());
    }
    public void Total(){
        System.out.println("Total pembayaran = "+getTotal());
    }
}
