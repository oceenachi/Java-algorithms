package Encapsulation;

import java.util.Arrays;

public class PlayerEncapsulated {
    private String name;
    private int health = 100;
    private String weapon;
    private String[] skills = {"taekwando", "back flips", "crushes"};

    public PlayerEncapsulated(String name, int health, String weapon, String[] skills) {
        this.name = name;
        if(health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
        this.skills = skills;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getSkills() {
        return Arrays.toString(skills);
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

}
