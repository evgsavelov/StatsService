package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(month);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSum() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverageSum(month);
        assertEquals(expected, actual);
    }


    @Test
    void findMaxMonth(){
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMaxMonth(month);
        assertEquals(expected, actual);
    }

    @Test
    void findMinMonth() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinMonth(month);
        assertEquals(expected, actual);
    }

    @Test
    void findQuantityUnderAverage() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findQuantityUnderAverage(month);
        assertEquals(expected, actual);
    }

    @Test
    void findQuantityOverAverage() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findQuantityOverAverage(month);
        assertEquals(expected, actual);
    }
}