package Encapsulation;

import java.util.Arrays;

// this file illustrates a class where encapsulation is not implemented.
// As constructor values can be initialized from outside the parent
//class. Also changes made to the parent class might be difficult to carryout
// in large scale applications. it is also made of public fields
public class Player {

    public String name;
    public int health;
    public String[] skills;
    public String weapon;

    public void showSkills() {
        System.out.println(Arrays.toString(this.skills));
    }

    public void loseHealth(int damage) {
        if(damage > this.health){
            System.out.println("Never possible");
        }
        else if(this.health <= 0) {
            System.out.println("player knocked out");
        }
        else {
            this.health = this.health - damage;
        }
    }
    public int healthRemaining() {
        return this.health;
    }
}
