/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author dell
 */
public class ShowMenu {

    public static void showMenu() {
        MenuEnum[] arr = MenuEnum.values();
        if (LoginService.pass == false) {
            for (int i = 0; i < 1; i++) {

                System.out.println(arr[i].getNumber() + "." + arr[i].getMeaning());
            }
        } else {
            for (int i = 1; i < arr.length - 1; i++) {

                System.out.println(arr[i].getNumber() + "." + arr[i].getMeaning());
            }
        }
    }

}
