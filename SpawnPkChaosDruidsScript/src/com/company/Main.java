package com.company;

import java.awt.*;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.MouseInfo;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;

public class Main {
    public static Robot robot = null;
    public static void main(String[] args) {
	    try{
	        robot = new Robot();
        }catch(AWTException e){
	        e.printStackTrace();
        }

	    while(true){
	        robot.delay(1000);
	        //Teleporting Home
	        klick(748, 313); //Klick teleport
            robot.delay(2500);
            klick(571, 348); //Klick home teleport
            //Deposit gear/ regear
            klick(755, 248); //deposit
            robot.delay(4500);
            klick(832, 180); //spawnGear
            robot.delay(4500);
            klick(731, 273); //heal

            //Turn on prayer
            robot.delay(4500);
            klick(710, 307);
            robot.delay(4000);
            klick(640, 388);

            //back to inven
            robot.delay(4000);
            klick(649, 307);
            robot.delay(4000);

            // Move to chaos druids, place
            klick(748, 313); //Klick teleport
            robot.delay(4000);
            klick(597, 371);// mini game tele
            robot.delay(4000);
            klick(92, 167);  //medium
            robot.delay(4000);
            klick(82, 271); //choose chaos druids
            robot.delay(4000);
            klick(206, 390); //teleport to chaos druids
            robot.delay(4500);
            klick(252, 520); // teleport
            robot.delay(4500);

            //back to inven
            robot.delay(4000);
            klick(649, 307);
            robot.delay(4000);

            klick(646, 248);//move into position
            robot.delay(4000);
            klick(653, 247);
            robot.delay(100);
            klick(655, 223);
            robot.delay(1000);
            klick(655, 238);
            robot.delay(1000);
            klick(651, 215);



            //Drink prayer potions
            robot.delay(5000);
            //potion 1
            for(int i = 0; i <= 5; i++){
                robot.delay(35000);
                klick(583, 362);
                i++;
            }

            //potion 2
            for(int j = 0; j <= 5; j++){
                robot.delay(35000);
                klick(624, 355);
                j++;
            }

            //potion 3
            for(int k = 0; k <= 5; k++){
                robot.delay(35000);
                klick(669, 356);
            }

            //potion 4
            for(int m = 0; m <= 5; m++){
                robot.delay(15000);
                klick(708, 352);
                m++;
            }


        }

    }
    public static void klick(int x, int y){
        robot.mouseMove(x, y);
        robot.delay(1000);
        robot.mousePress(MouseEvent.BUTTON1_MASK);
        robot.mouseRelease(MouseEvent.BUTTON1_MASK);

    }
}
