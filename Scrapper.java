/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scrapper;

import org.jsoup.*;
import org.jsoup.nodes.*; 
import org.jsoup.select.*;
import java.io.*;
/**
 *
 * @author HP
 */
public class Scrapper {

        public static void main(String[] args ){
        Scrap scrap = new Scrap();
		String burl = "https://www.bbc.com/urdu/topics/";
        
		System.out.println("Extracting Pakistan Stories");
		
		scrap.getData(burl+"cjgn7n9zzq7t","pakistan");
        for(int i=1;i<=10;i++)
            scrap.getData(burl+"cjgn7n9zzq7t/page/"+i,"pakistan");
        System.out.println("Extracting World Stoies");
        
		scrap.getData(burl+"cw57v2pmll9t","World");
        for(int i=1;i<=10;i++)
            scrap.getData(burl+"cw57v2pmll9t/page/"+i,"World");

        System.out.println("Extracting Khel Stories");
        scrap.getData(burl+"c340q0p2585t","Khel");
        for(int i=1;i<=10;i++)
            scrap.getData(burl+"c340q0p2585t/page/"+i,"Khel");
        System.out.println("Extracting Fun Funkar Stories");
        
		scrap.getData(burl+"ckdxnx900n5t","Fun Funkar");
        for(int i=1;i<=10;i++)
            scrap.getData(burl+"ckdxnx900n5t/page/"+i,"Fun Funkar");
        System.out.println("Extracting Science Stories");
        
		scrap.getData(burl+"c40379e2ymxt","Science");
		for(int i=1;i<=10;i++)
            scrap.getData(burl+"c40379e2ymxt/page/"+i,"Science");
        
		scrap.saveData();
    }
}
class Scrap{
    StringBuilder text = new StringBuilder();
    public void getData(String url,String label){
		try{
			Document doc = Jsoup.connect(url).get();
			
			Elements ele = doc.getElementsByClass("qa-heading-link");
			for (Element str : ele) {
				text.append(str.text()+", "+label+"\n");
			}
		}catch(Exception e){
			System.out.println(e);
		}
    }
    public void saveData(){
		try{
			FileWriter filewriter = new FileWriter("web-scaping.csv");
			filewriter.write(String.valueOf(text));
			filewriter.close();
		}catch(Exception e){
			System.out.println(e);
		}
    }
    
}
