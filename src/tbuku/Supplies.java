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
public class Supplies {
    public String supCode,supName,supBrand,supPrice;
    
    public Supplies(String supCode,String supName,String supBrand,String supPrice){
        this.supCode=supCode;
        this.supName=supName;
        this.supBrand=supBrand;
        this.supPrice=supPrice;
    }
    public void detail(){
        System.out.println("Detail Barang Transaksi \n");
        System.out.println("Barang Dibeli = "+this.supName);
        System.out.println("Kode Barang = "+this.supCode);
        System.out.println("Merk Barang = "+this.supBrand);
        System.out.println("Harga Barang = "+this.supPrice);
        System.out.println("\nSilahkan periksa kembali ");
        
    }
}
