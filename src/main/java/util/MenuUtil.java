/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;
import static util.MenuEnum.LOGIN;

/**
 *
 * @author dell
 */
public class MenuUtil {

    public static void menuDesign() {
        while (true) {
            
            int choice;
            Scanner sc = new Scanner(System.in);
            ShowMenu.showMenu();
            System.out.println("Please enter an operation number: ");
            choice = sc.nextInt();
            MenuEnum me = MenuEnum.find(choice);
            me.process();
           
            

        }
    }
}
