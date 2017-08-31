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
public class MiscPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        dog.setAge(19);
        
        System.out.println(dog.getCount());
    }
    
}
