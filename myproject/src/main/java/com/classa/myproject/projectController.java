/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classa.myproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Hijjaj
 */

@Controller
public class projectController {
    
    @RequestMapping("/view")
    @ResponseBody
    public String view(){
        return "Hello World";
    }
    
    
    @RequestMapping("/conversi")
    @ResponseBody
    public String gramtokg () {
        
        int gram = 1000;
        
        int result = gram/1000;
        return "Gram = " + gram + "Hasil ke KG = " + result;
    }
    
    @RequestMapping("/tampil")
    public String tampilkan(){
        return"tampilan";
    } 
    
    @RequestMapping("/Pertambahan")
    @ResponseBody
    public String tambah () {
        int a = 10, b = 2;
        
        int hasiltambah = a + b;
        return " a = " + a + " b = " + b + " a+b = " + hasiltambah;
    }
    
    @RequestMapping ("/Pengurangan")
    @ResponseBody
    public String kurang () {
        int c = 12, d = 3;
        
        int hasilkurang = c - d;
        return " c = " + c + " d = " + d + " c-d =  " +hasilkurang;
    }
    
    @RequestMapping ("/Perkalian")
    @ResponseBody
    public String kali () {
        int e = 4, f = 5;
        
        int hasilkali = (e*f);
        return " e = " + e + " f = " + f + " e * f = " +hasilkali;
    }
    
    @RequestMapping ("/Pembagian")
    @ResponseBody
    public String bagi () {
        int g =14, h = 7;
        
        int hasilbagi = (g/h);
        return " g = " + g + " h = " + h + " g/h = " +hasilbagi;
    }
    
    @RequestMapping ("/cgantisuhuk")
    @ResponseBody
    public String celciuskekelvin () {
        int i = 20;
        
        int jadikelvin = i + 273;
        return " celcius = " + i + " kelvin = " + jadikelvin; 
    }
}
