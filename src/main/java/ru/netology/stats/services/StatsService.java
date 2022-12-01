package ru.netology.stats.services;

public class StatsService {
    // 1. Сумма всех продаж
    public long getTotalAllSales (long[] sales) {
      long totalAllSales = 0;
      for (long sale : sales) {
          totalAllSales = totalAllSales + sale;
      }
      return totalAllSales;
    }

    // 2. Средняя сумма продаж в месяц
    public long getAverageSaleMonth (long[] sales) {
        return getTotalAllSales(sales) / 12;
    }

    // 3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int getMaxSales (long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
               maxMonth = month;
            }
            month ++;
        }
        return maxMonth + 1;
    }

    // 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int getMinSales (long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month ++; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // 5. Количество месяцев, в которых продажи были ниже среднего
    public int getCountMinMonths (long[] sales) {
        int countMinMonths = 0;
        long averageSaleMonth = getAverageSaleMonth (sales);
        for (long sale : sales) {
            if (sale < averageSaleMonth) {
                countMinMonths ++;
            }
        }
        return countMinMonths;
    }

    // 6. Количество месяцев, в которых продажи были выше среднего
    public int getCountMaxMonths (long[] sales) {
        int countMaxMonths = 0;
        long averageSaleMonth = getAverageSaleMonth (sales);
        for (long sale : sales) {
            if (sale > averageSaleMonth) {
                countMaxMonths ++;
            }
        }
        return countMaxMonths;
    }

}
