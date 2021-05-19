/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class LoginService extends MenuService {
static boolean pass;
    @Override
    public void process() {
       System.out.println("Please login!");
        
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while (count < 10) {
            System.out.println("Please enter a username:");
            String username = sc.nextLine();
            sc = new Scanner(System.in);
            System.out.println("Please enter a password:");
            String password = sc.nextLine();

            if (username.equals("Tural") && password.equals("1907")) {
                System.out.println("Successfully login!");
                pass=true;
                break;
                
            } else {
                System.out.println("Wrong password or username!");
                pass=false;

            }
            count++;
            if (count >= 3) {
                System.out.println("You banned!");
                pass = false;
                System.exit(0);
                break;
            }

        }

    }
    

}
