package dejanuz;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author DCummins
 */
public class Time {
    
    public static String tTime(String msg){
        
        //centralized way to add time to the tests -dc        
        return " " + msg + " " + new SimpleDateFormat("mm:ss:SS").format(new Date()) + " mm:ss:SS";
    }
    
}
