package machine;

import java.util.*;
public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int water_supply = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk_supply = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans_supply = scanner.nextInt();


        System.out.println("Write how many cups of coffee you will need: ");
        int n = scanner.nextInt();
        int neededWater = n * 200;
        int neededMilk = n * 50;
        int neededBeans = n * 15;
        int small = 0;
        if ((water_supply >= neededWater && milk_supply >= neededMilk) && beans_supply >= neededBeans) {
            water_supply = water_supply - neededWater;
            milk_supply = milk_supply - neededMilk;
            beans_supply = beans_supply - neededBeans;

            small = cupCalculator(water_supply, milk_supply, beans_supply);
            if (small > 0) {
                System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", small);
            } else {
                System.out.println("Yes, I can make that amount of coffee");
            }
        } else {
            small = cupCalculator(water_supply, milk_supply, beans_supply);
            System.out.printf("No, I can make only %d cup(s) of coffee", small);
        }
    }



//        System.out.println("For " +n+" cups of coffee you will need: \n" +
//               water+" ml of water\n"+
//                milk+" ml of milk\n"+
//                beans+" g of coffee beans");


    public static int cupCalculator(int water, int milk, int beans){
        int w = water / 200;
        int m = milk / 50;
        int b = beans / 15;
        if((w < m || w==m ) && (w< b) || w == b){
            return w;
        }
        else if(((m < w) || m ==w) && ((m<b)|| m==b)){
            return m;
        }
        else{
            return b;
        }
    }
}
