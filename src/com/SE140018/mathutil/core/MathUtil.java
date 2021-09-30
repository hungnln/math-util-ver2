/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SE140018.mathutil.core;

/**
 *
 * @author SE140018
 */
public class MathUtil {

    /**
     * @param n
     * @return
     */
//    public static long getFactorial(int  n){
//        if(n <0 || n>20){
//            throw new IllegalArgumentException("n must be between 0..20");
//        }
//        if(n==0||n==1){
//            return 1;
//        }
//        long product =1;
//        for (int i = 1; i <= n; i++) {
//            product *= i;
//        }
//    return product;
    //De quy, recursion, goi lai chinh minh voi 1 quy mo khac
    //n!=n*(n-1)!
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n between 1 and 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
