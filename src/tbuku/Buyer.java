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
public class Buyer extends Supplies{
    public String buyerId,buyerName,alamat,phone;
    
    public Buyer(String supCode,String supName,String supBrand,String supPrice,String buyerId,String buyerName,String alamat,String phone){
        super(supCode,supName,supBrand,supPrice);
        this.buyerId=buyerId;
        this.buyerName=buyerName;
        this.alamat=alamat;
        this.phone=phone;
    }
    
    public void detail(){
        super.detail();
        System.out.println("\n Data Pembeli\n");
        System.out.println("ID Pembeli = "+this.buyerId);
        System.out.println("Nama Pembeli = "+this.buyerName);
        System.out.println("Alamat Pembeli = "+this.alamat);
        System.out.println("Nomor Telepon Pembeli = "+this.phone);
        System.out.println("\n");
        
    }
}
