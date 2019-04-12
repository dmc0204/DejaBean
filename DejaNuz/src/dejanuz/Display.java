package dejanuz;

//test display class -dc
public class Display {
    
    //test results method, passed int to formated output -dc
    public static String results(int y, String url){
        
        
        //catching a null result before processing it for an output -dc
       if (y <= 0) {
               return ""; 
            }
       
       String x = new String();
        //This is my way of formating the ranking and correcting for place errors when comparing strings to sort -dc
        try{
       if (y < 10){
           x = String.valueOf(y);
           x = "#....." + x;
       }
       else if(y < 100){
           x = String.valueOf(y);
           x = "#...." + x;
       }else if(y < 1000){
           x = String.valueOf(y);
           x = "#..." + x;
       }else if(y < 10000){
           x = String.valueOf(y);
           x = "#.." + x;
       }else if(y < 100000){
           x = String.valueOf(y);
           x = "#." + x;
       }else{
           x = String.valueOf(y);
       }
           System.out.println("Display Class: <Passed>" + Time.tTime(url));
            return x + " matches found at " + url + " ";
        
        }catch(Exception e){
            
            System.out.println("Display Class: <Bug>" + Time.tTime(url));
            return "error";
        }
    }
}
    

