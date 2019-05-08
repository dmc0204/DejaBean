package dejanuz;
import java.util.*;
/**
 *
 * @author DCummins
 */
public class LinkExtractor {
     
    public static String dejaURLExtractResults(String feedMe){
        
        //integers for substring extracting -dc
        int findLinkStart = 0;
        int findLinkEnd = 0;
                
       String link = new String();
       
       //trying to pull out only url's that work with my methods -dc
       try{
      
            //finding the start index of the url -dc
            findLinkStart = feedMe.indexOf("www.", findLinkStart);
            //finding the end index of the url -dc
            findLinkEnd = feedMe.indexOf(" ", findLinkStart);
            //cutting out that part of the string and adding it to the links list -dc
            link = feedMe.substring(findLinkStart,findLinkEnd);
                       
          System.out.println("linkExtractor Class: <Passed>" + Time.tTime(feedMe));   
        return link;
    }catch(Exception e){
        System.out.println("linkExtractor Class: <Bug>" + Time.tTime(feedMe));
        return "error";
    }
    
    }
}
