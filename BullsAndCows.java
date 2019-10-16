package com.company.base.accenture.bullsncows;

public class BullsAndCows {
    public static long getBullsAndCows(int count, String input, String correctNum) {
        int bulls = 0;
        int cows = 0;
        int number=Integer.parseInt(input);
        int result=Integer.parseInt(correctNum);
        int[] n = new int[count];
        int[] h = new int[count];
        for (int i = 0; i < count; i++) {
            n[i] = number % 10;
            h[i] = result % 10;
            number /= 10;
            result /= 10;
        }
        /*for (int i = 0; i < count; i++) {
            for (int k = i + 1; k < count; k++) {
                if ((n[i] == n[k]) && (i != k)) {
                    System.exit(0);
                }
            }
        }*/
        //cows
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < count; k++) {
                if ((n[i] == h[k]) && (i != k)) {
                    cows+=1;
                }
            }
        }
        //bulls
        for (int i = 0; i < count; i++) {
            if (n[i] == h[i]) {
                bulls += 1;
            }
        }
            System.out.println("Быки:" + bulls);
            System.out.println("Коровы:" + cows);

        return count;
    }
}
