/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trainonsingelton;

/**
 *
 * @author hp
 */
public class Account {
    
    private String name;
    private String lastname;
    private String salary;
    
    private static Account instance=null;
    private Account(){};
    
    public static Account getAccount(){
        if(instance==null){
            instance=new Account();
        }
        return instance;
    }
    public void data(){
        System.out.println("my name is "+name);
        System.out.println("my last name is "+lastname);
        System.out.println("my salary is "+salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    
    
    
    
}
