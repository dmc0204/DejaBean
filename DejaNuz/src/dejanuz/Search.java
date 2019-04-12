package dejanuz;
/**
 *
 * @author DCummins
 *  * 
 * Programming Fundamentals Using JAVA by McAllister and Fritz 
 * 
 * 
 */
public class Search {       

      //.match(termIn, getDat) -dc
   
        public static int match(String termIn, String getDat){
        
            String str = new String();
            String findStr = new String();
                   
            str = getDat;
            findStr = termIn;
            
                        
        //int to hold the the returned index from the indexOf method
        //and count to count each time it returns an index. -dc
        int lstInd = 0;
        int count = 0;

        try{
        while(lstInd != -1){

            lstInd = str.indexOf(findStr,lstInd);

        if(lstInd != -1){
            count ++;
            lstInd += findStr.length();
                }
            }
         
        //returns total matches as a string -dc
        System.out.println("Search Class: <Passed>" + Time.tTime("Found some =>" + termIn));
        return count;} 
        catch(Exception e){
            System.out.println("Search Class: <Bug>" + Time.tTime("Something Went Wrong."));
            return 0;
        }
        
        }
}      


