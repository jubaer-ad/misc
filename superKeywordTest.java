
/**This is for practicing JAVA super keyword.
 * super keyword has three usage cases
 * 1. to call superclass attribute
 * 2. to call superclass method
 * 3. to call superclass constructor 
*/

class Human{
    String state = "Not born yet"; //to test super attribute call
    int noOfHands;
    int noOfLegs;
    int noOfEyes; 
    boolean isHaired; 
    String gender;
    Human(int noOfHands, int noOfLegs){
        this.noOfHands = noOfHands;
        this.noOfLegs = noOfLegs;
    }
    Human(int noOfHands, int noOfLegs, int noOfEyes, boolean isHaired){
        this.noOfHands = noOfHands;
        this.noOfLegs = noOfLegs;
        this.noOfEyes = noOfEyes;
        this.isHaired = isHaired;
    }
    Human(boolean isHaired){
        this.isHaired = isHaired;
    }

    Human(int noOfHands, int noOfLegs, int noOfEyes, boolean isHaired, String gender){
        this.noOfHands = noOfHands;
        this.noOfLegs = noOfLegs;
        this.noOfEyes = noOfEyes;
        this.isHaired = isHaired;
        this.gender = gender;
    }

    void display(){
        System.out.println("Hands: " + noOfHands);
        System.out.println("Legs: " + noOfLegs);
        System.out.println("Eyes: " + noOfEyes);
    }
}

class Male extends Human{
    String name;
    boolean isHaired;
    String state = "Hurrah! Born."; //to test super attribute call
    Male(int noOfHands, int noOfLegs, int noOfEyes, boolean isHaired, String gender,String name){
        //3. example of super constructor call                                                                     /////////////////////3///////////////////////////

        //super build up object with the contructor of super class by matching the #parameters
        //2 lines under are not the same
        super(noOfHands, noOfLegs, noOfEyes, isHaired, gender); //constructor with many parameters
        //super(noOfHands, noOfLegs); //constructor with few parameters
        this.name = name;
    }

    @Override
    void display(){
        //2. example of super method call                                                                         /////////////////////////2///////////////////////
        super.display();
        System.out.println("Haired: " + isHaired);
        System.out.println("Gender: " + gender);

        //1. example of super attribute call                                                                      //////////////////////////1//////////////////////
        System.out.println(state); // take state from Male class
        System.out.println(super.state); // take state from Human class
    }

}


public class superKeywordTest {
    public static void main(String[] args){
        Male male1 = new Male(2, 2, 2, true, "Male", "Anubis");
        male1.display();     
    }
}
