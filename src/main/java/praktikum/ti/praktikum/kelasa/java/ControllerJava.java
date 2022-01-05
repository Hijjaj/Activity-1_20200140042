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
@Controller
public class ControllerJava {
    
    
    
    @RequestMapping("/kasir")
    public String getdata(HttpServletRequest data, Model kurir){
        String NamaBuah = data.getParameter("NamaBuah");
        String HargaPerkilo = data.getParameter("HargaPerkilo");
        String JumlahBeli = data.getParameter("JumlahBeli");
        
        Proses ps = new Proses();
        Double Hitungan = ps.hitung(HargaPerkilo, JumlahBeli);
        Double Harga = ps.harga(Hitungan);
        String Diskon = ps.Diskon(Hitungan);
        
        kurir.addAttribute("namabuah",NamaBuah);
        kurir.addAttribute("hargakiloan", HargaPerkilo);
        kurir.addAttribute("jumlah", JumlahBeli);
        kurir.addAttribute("hitung", Hitungan);
        kurir.addAttribute("potongan", Diskon);
        kurir.addAttribute("total", Harga);
        return "Hijjaj";
        
    }
    
        
    }
        
    
    
    
    

