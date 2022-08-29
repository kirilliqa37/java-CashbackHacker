package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerTest {
    CashbackHackerService srv = new CashbackHackerService();

    @Test
    public void shouldEqualLimit(){
        int actual = srv.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldWhenZero(){
        int actual = srv.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }
    @Test
    public void shoulEqualUnderLimit1(){
        int actual = srv.remain(900);
        int expected = 100;
        assertEquals(actual,expected);
    }
    @Test
    public void shoulEqualUnderLimit2(){
        int actual = srv.remain(600);
        int expected = 400;
        assertEquals(actual,expected);
    }
    @Test
    public void shoulEqualUnderLimit3(){
        int actual = srv.remain(999);
        int expected = 1;
        assertEquals(actual,expected);
    }
    @Test
    public void shoulEqualUnderLimit4(){
        int actual = srv.remain(1);
        int expected = 999;
        assertEquals(actual,expected);
    }
    @Test
    public void shouldWhenMoreThousand(){
        int actual = srv.remain(4700);
        int expected = 300;
        assertEquals(actual,expected);
    }

}
