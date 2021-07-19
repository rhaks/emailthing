package emailapp;
import java.util.Scanner;

/**
 *
 * @author Ramazan Hakan Aksoy 18.07.2021
 */
public class email {
    private String companyMail;
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPwLength=9;
    private String department;
    private int mailboxCapacity=500;
    private String alternateMail;
    private String companyName="rhaks";
    
    //part which we get first and last name
    public email (String firstName, String lastName){
            this.firstName=firstName; this.lastName=lastName;
    System.out.println("E-mail Created: "+ this.firstName +" "+ this.lastName);
    
            //giving department
            this.department=chooseDepartment();
            
            //setting random password
            this.password = randomPW(defaultPwLength);
            System.out.println("Your password: "+this.password);
            
            //creting email
            if(department!=""){companyMail=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companyName+".com";}
            else{companyMail=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+companyName+".com";}
}  
    //part which we get department
    private String chooseDepartment(){
System.out.println("Enter your department:\n1 for Sales\n2 for Development\n3 for accounting\n4 for Human Resources \n0 for neither");
System.out.print("Enter Department Number: ");
        Scanner in= new Scanner(System.in);
        int departmentChoice=in.nextInt();
        if (departmentChoice==1){return "sales";}
        else if(departmentChoice==2){return "dev";}
        else if(departmentChoice==3){return "acc";}
        else if(departmentChoice==4){return "hr";}
        else {return "";}
    }
    //random password
    private String randomPW(int length){
    String pwSet="ABCDEFGHIJKLMNOPQRSTUWXVYZ0123456789!%&$#@";
    char[] password=new char[length];
    for(int i=0; i<length;i++){
        int rnd= (int)(Math.random()*pwSet.length());
        password[i]=pwSet.charAt(rnd);

    }
    return new String (password);
    }
    
    //mailbox Capacity
    public void setMailboxCapacity(int capacity){
    this.mailboxCapacity=capacity;
    }
    
    //Set the alternate email
    public void setAlternateEmail(String altEmail){
    this.alternateMail=altEmail;
    }
    
    //Change the password
    public void changePassword(String password){
    this.password=password;
    }
    
    //mailbox capacity
    public int getMailboxCapacity(){
    return mailboxCapacity;
    }
    
    public String getAlternateEmail(){return alternateMail; }
    
    public String getPassword(){return password;}

    public String showInfo(){
    return "Display Name: " + firstName + " " + lastName +
            "\nCompany Mail: " + companyMail +
            "\nMailbox Capacity: " + mailboxCapacity + "MB";
    }
    
}