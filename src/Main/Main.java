package Main;

import Animal.*;


public class Main {
    public static void main(String[] args){
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.sizeCHanch = 12;
        d2.sizeCHanch = 12;
        System.out.println(d1.equals(d2));;
    }
}
