/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.ti.praktikum.kelasa.java;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Hijjaj
 */
public class Proses{
     
    public Double hitung(String hp, String jb){
        Double HargaPerkilo = Double.parseDouble(hp);
        Double JumlahBeli = Double.parseDouble(jb);
        Double hitungan = HargaPerkilo * JumlahBeli;
        return hitungan; 
    }                    
    public String Diskon(Double hitungan){
        String Diskon = null;
        if (hitungan < 16000) {
            Diskon = "0%";
        }
        else if (hitungan >= 16000 && hitungan <= 25000){
            Diskon = "10%";
        }
        else if (hitungan > 25000){
            Diskon = "15%";
        }
        return Diskon;

        
        
        
        
    }
    public Double harga(Double hitungan){
        Double Harga = null;
        if (hitungan < 16000) {
            Harga = hitungan;
        }
        else if (hitungan >= 16000 && hitungan <= 25000){
            Harga = hitungan - (hitungan*10/100);
        }
        else if (hitungan > 25000){
            Harga = hitungan - (hitungan*15/100);
        }
        return Harga;
        
    }
    
    
    
}

        
    
    
    
    
