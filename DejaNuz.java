/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dejanuz;

/**
 *
 * @author dcummins
 */
public class DejaNuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
      
    Prompt a = new Prompt();
    Parse b = new Parse();
    Search c = new Search();
    Rank d = new Rank();
    Display e = new Display();
    
    // Test methods for each of the classes and using them in the client class
    // to lay a foundation for DejaNuz
a.test();
b.test();
c.test();
d.test();
e.test();
        
    }
    
}
