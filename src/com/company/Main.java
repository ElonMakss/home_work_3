package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();

        double[] nums = new double[15];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (r.nextDouble() * 1000 - 400);
        }
        //флажок для пропуска первого положительного
        boolean flag = false;
        double rezSum = 0.0;
        int i = 0;
        double rez;

        for (double item : nums) {
            if (item > 0 && flag) {
                rezSum = rezSum + item;
                i++;
            } else if (item > 0) {
                flag = true;
            }
        }
        //подсчет среднего арефметического
        rez = rezSum / i;

        System.out.println(Arrays.toString(nums));
        System.out.println(rezSum);
        System.out.println(i);
        System.out.println(rezSum + "/" + i + "=" + rez);

        //задание на сообразительность
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}





