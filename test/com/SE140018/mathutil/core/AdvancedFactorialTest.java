/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SE140018.mathutil.core;

import static com.SE140018.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author SE140018
 */
//ta dung ki thua Data Driven Testing/Parameterzed testing
//tham so hoa bo du lieu text
//la ki thua tach bo du lieu test ra han cau lenh kiem thu
//Bo data: dat o txt, excel, table
// 0>1;
//1>1;
//2>2;
//...
//5>125;
//nhoi bo data vao trong loi goi ham getF() + assertEqual
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {

    //chuan bi bo data truoc o txt,excel,database
    //neu de file ngoia phai viet them doan code doc data vao
    @Parameters
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 7200},//bo sung test CI
        };
    }

    @Parameter(value = 0)
    public int n; // ban muon linh may giai thua

    @Parameter(value = 1)
    public long expected; // ban ki vong giai thua tra ve may

    @Test // bien 1 ham thanh ham main
    public void checkFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, getFactorial(n));
    }

}
