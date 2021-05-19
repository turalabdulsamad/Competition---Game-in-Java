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
public enum MenuEnum {

    LOGIN(1, "Login", new LoginService()),
    REGISTER(2, "Register", new RegisterService()),
    STARTCOMPETITION(3, "Start competition", new CompetitionService()),
    LOGOUT(4, "Logout", new LogoutService()),
    EXIT(5, "Exit", new ExitService()),
    UNKNOWN(6, null, null);

    private MenuService service;
    private String meaning;
    private int number;

    MenuEnum(int number, String meaning, MenuService service) {
        this.meaning = meaning;
        this.service = service;
        this.number = number;
    }
    public MenuService getService() {
        return service;
    }

    public void setService(MenuService service) {
        this.service = service;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public static MenuEnum find(int num) {

        MenuEnum[] arr = MenuEnum.values();
        if (LoginService.pass == false) {
            return LOGIN;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].getNumber() == num) {
                    return arr[i];
                }

            }
            return MenuEnum.UNKNOWN;
        }
    }

    

    public void process() {
        service.process();
    }
}
