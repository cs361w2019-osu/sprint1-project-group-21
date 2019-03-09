package cs361.battleships.models;
import java.util.Random;

//Nolan Nichols
//Prototyping functions for the new Weapon class

public class Weapon {

    private String weaponName= "";
    private int damage  = 0;
    private int weaponCode;
    //Set the name of the weapon
    public void setWeaponName(String name){

        weaponName = name;
    }

    //Get the name of the weapon
    public String getWeaponName(){

        return weaponName;

    }

    //Set initial weapon damage value
    public void setDamageRate(int dmg){

        damage = dmg;

    }

    //Get weapon damage
    public int getDamageRate(){

        return damage;
    }

    //Check to see if user has sunk at least one ship
    boolean hasSunk(Class res){

        if(res.getResult() >= 1){
            return true;
        }
        else{
            return false;
        }
    }


    //Generate random int for weapon activation
    public void setWeaponActCode(){

        if(hasSunk()){

            Random randy = new Random();
            weaponCode = randy.nextInt(100);


        }


    }

    public int getWeaponCode(){

        return weaponCode;
    }

}
