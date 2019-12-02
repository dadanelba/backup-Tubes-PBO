/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceazycoffeeshop.Model;

/**
 *
 * @author M- Jeek
 */

import java.text.DateFormat;  
import java.text.SimpleDateFormat; 

public  class Date {  
    public static String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
        }  
     
    public String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
        }     
}
