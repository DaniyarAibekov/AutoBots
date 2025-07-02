package com.autobots.streamApi;

import java.awt.*;

import static java.lang.Math.max;

public class draft {
    public static void main(String[] args) {

    }

    public boolean firstLast6(int[] nums) {
        return nums.toString().startsWith("6") || nums.toString().endsWith("6");

    }

    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }

        return count;
    }

    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
                result = result + str.substring(i, i + 1);
            }
        }
        return result;
    }
    public boolean has23(int[] nums) {
        for (int n : nums) {
            if (n == 2 || n == 3)
                return true;
        }
        return false;
    }


}
