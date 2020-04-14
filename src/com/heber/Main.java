package com.heber;

public class Main {

    public static void main(String[] args) {
	// Demonstration of FuelEfficency class, and how it works
    FuelEfficency f = new FuelEfficency();
    f.calcMPG(10,2);
    System.out.println("returnTrue says: "+f.returnTrue());


    //Demonstration of JUMPER class, and how it works
    Jumper j = new Jumper(2);  //starting on level2
    System.out.println("Current Level is: "+ Integer.toString(j.getLevel())  );
    j.doJump(); //should progress to 3rd level
    System.out.println("Current Level is: "+ Integer.toString(j.getLevel())  );
    j.doJump(); //should progress to 4th level
    System.out.println("Current Level is: "+ Integer.toString(j.getLevel())  );
    j.doJump(); //already at 4th, should STAY at 4th level (since 4=MAXLEVEL)
    System.out.println("Current Level is: "+ Integer.toString(j.getLevel())  );
    j.doFall(); //fall from 4th to 3rd level
    System.out.println("Current Level is: "+ Integer.toString(j.getLevel())  );




    }
}

