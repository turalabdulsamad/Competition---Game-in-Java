/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bean.Competitor;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class RegisterService extends MenuService {

    @Override
    public void process() {
        Competitor[] arr = register();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public Competitor[] register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many competitors will participate in the competition?");
        int howManyCompetitors = sc.nextInt();

        String name;
        String surname;
        Competitor[] arr = new Competitor[howManyCompetitors];
        for (int i = 0; i < howManyCompetitors; i++) {
            sc = new Scanner(System.in);
            System.out.println("Enter a name:");
            name = sc.nextLine();
            System.out.println("Enter a surname:");
            surname = sc.nextLine();
            Competitor c = new Competitor(name, surname);
            arr[i] = c;
        }
        System.out.println("Competitors have been registered successfully!");
        return arr;
    }
}
