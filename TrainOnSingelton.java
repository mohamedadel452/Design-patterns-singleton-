/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trainonsingelton;

/**
 *
 * @author hp
 */
public class TrainOnSingelton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account account=Account.getAccount();
        account.setName("mohamed");
        account.setLastname("adel");
        account.setSalary("1000");
        account.data();
        Account account1=Account.getAccount();
        System.out.println("--------------------------------------");
        account.setName("ahmed");
        account.setLastname("del");
        account.setSalary("2000");
        account1.data();
        System.out.println("--------------------------------------");
        account.data();
        
        
    }
    
}
