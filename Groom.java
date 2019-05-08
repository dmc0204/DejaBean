package dejanuz;
import javax.swing.JOptionPane;
/**
 *
 * @author DCummins
 */
public class Groom {

    public static String barber(String hippyIn) {
        
        String preppyOut = new String();
        //This is the substring search method. If you use the circumflex's on the term, it doesn't add the spaces -dc 
        try {

            if (hippyIn.startsWith("^") && hippyIn.endsWith("^")) {

                preppyOut = hippyIn.replace("^", "");

            } else if (hippyIn.startsWith("!")) {

                preppyOut = hippyIn.toUpperCase();

            } else {

                preppyOut = new String(" " + hippyIn + " ");

            }
            System.out.println("Groom.barber: Passed" + Time.tTime("for input: " + hippyIn));
            return preppyOut;
        } catch (Exception e) {
            System.out.println("Groom.barber: Bug" + Time.tTime("for input: " + hippyIn));
            return "error";
        }
    }
   
    //This is a test method used to check the users URL input -dc
    public static Boolean urlCheck(String url) {

        if (url.startsWith("www") || url.startsWith("news") && url.endsWith(".com")) {
            System.out.println("Groom.urlCheck: <Passed>" + Time.tTime(url));
            return true;
        } else {
            System.out.println("Groom.urlCheck: <Bug>" + Time.tTime(url));
            JOptionPane.showMessageDialog(null, "Please use www.(Website).com", "Just checking.", JOptionPane.WARNING_MESSAGE);
            return false;
        }

    }

}
