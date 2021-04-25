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
public class LogoutService extends MenuService{

    @Override
    public void process() {
        System.out.println("You logged out!");
        MenuEnum.LOGIN.process();
        }
    
}
