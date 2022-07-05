/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scrapper;
import java.util.*;
import java.io.*;

/**
 *
 * @author HP
 */

public class PrintONScreen {
     

    public static void main(String[] args){
        try{
            Scanner scan = new Scanner(new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\Scrapper\\web-scaping.csv"));
            while(scan.hasNext()){
                System.out.println(scan.nextLine());
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
