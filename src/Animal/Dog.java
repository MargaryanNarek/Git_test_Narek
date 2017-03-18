package Animal;

import java.util.Objects;

/**
 * Created by user on 3/18/2017.
 */
public class Dog extends Animal {

    public int sizeCHanch;

    public  void dzen(){
        System.out.println("haf haf");
    }

    public boolean equals(Object obj){
        Dog dog = (Dog) obj;
        return this.sizeCHanch == dog.sizeCHanch;
    }

}
