/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

import java.util.Scanner;

public class Gravity {

	public static void main(String[] args) {
        double time;
        double speed;
        double gravity = 9.8;
        double distance;
        Scanner sc = new Scanner(System.in);
        time = sc.nextDouble();
        speed = time * gravity;
        distance = 0.5 * gravity * time * time;
        System.out.println("The speed of the object at " + time + "seconds after its release is" + speed + " and the distance the object has travelled in the 6.0 seconds after the relase is " + distance);
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
