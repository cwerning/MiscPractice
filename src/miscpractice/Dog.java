/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscpractice;

/**
 *
 * @author cwerning
 */
public class Dog {
    private int age;
    private static int count;

  

    public Dog(int age) {
        this.age = age;
        count++;
    }

    public Dog() {
        count++;
    }
    
    
      public static int getCount() {
        return count;
    }
    
    
    
    
    public void speak(){
        System.out.println("bark");
    }

    public int getAge() {
        return age;
    }

    /*
    age should be between 0 and 20
    */
    public void setAge(int age) {
        if(age < 0 || age > 20){
            throw new IllegalArgumentException("Value must be between 0 and 20"); 
        }
        this.age = age;
    }
    
    
}
