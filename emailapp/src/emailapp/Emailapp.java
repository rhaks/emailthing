package emailapp;
/**
 *
 * @author Ramazan Hakan Aksoy 18.07.2021
 */
public class Emailapp {

    public static void main(String[] args) {
        email mail1= new email("Hakan", "Aksoy"); //datas for first email address
        
        System.out.println(mail1.showInfo());
        
        /*mail1.setAlternateEmail("hakanaksoy37@gmail.com");
        System.out.println(mail1.getAlternateEmail());*/
    }
    
}
