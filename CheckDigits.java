package com.company.base.accenture.bullsncows;

import java.util.ArrayList;
import java.util.List;

public class CheckDigits {
    public static boolean checkDigitsUniqueness(String input) {
        char[] c_arr = input.toCharArray();
        for (int i=0; i<c_arr.length;i++){
            for (int k=0; k<c_arr.length;k++){
                if((c_arr[i]==c_arr[k])&&(i!=k)){
                    return false;
                }
            }
        }
        return true;
    }
    public int getCountOfDigits(String input) {
        char[] c_arr = input.toCharArray();
        return c_arr.length;
    }
    public static boolean isDigit(String input) {
        String digit_reg="[-+]?\\d+";
        if(input.matches(digit_reg)){
            return true;
        }
        return false;
    }
}
