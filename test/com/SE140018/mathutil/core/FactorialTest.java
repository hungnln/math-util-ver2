/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SE140018.mathutil.core;


import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author SE140018
 */
public class FactorialTest {
     
        @Test // bien 1 ham thanh ham main
        public void checkFactorialGivenRightArgumentReturnsWell(){
        long expected =120;
        long actual = MathUtil.getFactorial(5);
        
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
    }
        //test xem ham co nem ve ngoai le nhu ki vong hay ko
        //vi du neu ta tinh getF(5), phair nem ra ngoai le
        // neu dung goi ham getF(5) ma ham nem ra ngoai le tuong ung > ham viet dung
        // ta co mau xanh
        //ham duoc thiet ke dua am nen ngoai le
        //Jnunit4 ko coi ngoai le la gia tri, ko asserEquals (ngoai le,actual) duoc
        @Test(expected =IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException(){
    MathUtil.getFactorial(-5); //phai nem ngoai le thi moi dung
    
    
    //CHot ha cho xanh do
    // Tat ca tinh huong test phai la mau xanh, tuc expected va actual khop nhau
    //chi can 1 cai do, tat ca coi nhu do
}
}
