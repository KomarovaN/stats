package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldCalculateTotalAllSales () {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        StatsService service = new StatsService();
        long actual = service.getTotalAllSales (sales);
        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void shouldCalculateAverageSaleMonth () {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        StatsService service = new StatsService();
        long actual = service.getAverageSaleMonth (sales);
        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void shouldCalculateMaxSales () {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        StatsService service = new StatsService();
        long actual = service.getMaxSales (sales);
        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void shouldCalculateMinSales () {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        StatsService service = new StatsService();
        long actual = service.getMinSales (sales);
        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void shouldCalculateCountMinMonths () {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        StatsService service = new StatsService();
        long actual = service.getCountMinMonths (sales);
        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void shouldCalculateCountMaxMonths () {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        StatsService service = new StatsService();
        long actual = service.getCountMaxMonths (sales);
        Assertions.assertEquals (expected, actual);
    }
}
