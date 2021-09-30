/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SE140018.mathutil.main;

import com.SE140018.mathutil.core.MathUtil;

/**
 *
 * @author SE140018
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("0! = 1?"+MathUtil.getFactorial(0));
        System.out.println("1! = 1?"+MathUtil.getFactorial(1));
        System.out.println("5! = 120?"+MathUtil.getFactorial(5));
        System.out.println("6! = 720?"+MathUtil.getFactorial(6));//Modify by someone
        //tu nhien tu so sanh, tu ket luan cho tung truong hop va cho all
    }
}
