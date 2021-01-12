//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package MonsterMash;
//design your Monster class
//write all code for your Monster class here
//test your Monster class with the MonsterRunner
public class Monster{

    private int height;
    private int weight;
    private int age;

    public Monster(int height, int weight, int age){
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public String isBigger(Monster other){
        if(this.height > other.height){
            return this.toString();
        }
        return other.toString();
    }

    public String isSmaller(Monster other){
        if(this.height < other.height){
            return this.toString();
        }
        return other.toString();
    }

    public int getHeight(){
        return height;
    }

    public String toString(){
        return height+" "+weight+" "+age;
    }

}