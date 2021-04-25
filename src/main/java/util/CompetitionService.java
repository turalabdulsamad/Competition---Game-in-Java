/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class CompetitionService extends MenuService {

    @Override
    public void process() {
        Random r = new Random();
        int[] arr = r.ints(1, 1, 5).toArray();
        int randomNum = arr[0];
        int guessedNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Who is the chosen partcipant?");
        guessedNum = sc.nextInt();
        if (guessedNum==randomNum){
            System.out.println("Congratulations you won!");
           
        }
        else{
            System.out.println("You failed");
                    
        }
        
       
   }
    
}
