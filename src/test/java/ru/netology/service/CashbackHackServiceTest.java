package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRecommendToAddWhenUnderBoundary() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRecommendToAddWhenOverBoundary() {
        int amount = 2500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRecommendToAdd() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldRecommendToAddWhenUnderBoundaryJUnit5() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldRecommendToAddWhenOverBoundaryJUnit5() {
        int amount = 2500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldNotRecommendToAddJUnit5() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}