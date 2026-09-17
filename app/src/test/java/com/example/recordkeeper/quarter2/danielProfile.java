BunoProfileTest.javaBunoProfileTest.javapackage com.example.danielbuno.quarter2;

import org.junit.Test;

public class bunoProfileTest {
    @test
    public void printMyProfile() {
        String myName = "daniel";
        String favGame = "Mobile legends";
        String favFood = "chicken";
        int myAge = 18;

        System.out.println("--- MY DIGITAL PROFILE---");
        System.out.println("Hello. my name is " + myName + " and I am " + myAge + " years old.");
        System.out.println("My favorite game to play is " + favGame+"Mobile legends");
        System.out.println("To play basketball " + favFood + " every single day!");
    }
}