package dejanuz;
import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
/**
 *
 * @author DCummins
 */
//Parse Class using Jsoup to power getDat method -dc
public class Parse {
    
     //Test version of getDat -dc
     public static String getDat(String url){            
         
         //1.3 version update, going to pass one url at a time -dc
         String y = new String();
         Document bodyIn;
                  
                
        try {
            
            //1.3 version update, going to pass one url at a time -dc           
            url = "http://" + url;    
            //setting a timeout for connections to 10kms -dc
            bodyIn = Jsoup.connect(url).timeout(10000).get();
            y = bodyIn.body().text();            
           
            
        } catch (IOException e) {
           // e.printStackTrace();
           //Something goes wrong and it'll output an Oops -dc
           System.out.println("Parse Class: <Bug>" + Time.tTime(url));           
        }  
     
        //Sending back the data to search -dc
         if (y.length() <= 10){
                System.out.println("Connection Error @ " + url);
            }
        System.out.println("Parse Class: <Passed>" + Time.tTime(url));
         return y;
     }
     
}

