package ru.netology.javaqamvn.stats;

public class StatsService {
    //Сумма всех продаж:
    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //Средняя сумма продаж в месяц:
    public long averageMonthSales(long[] sales) {
        long sum = sumAllSales(sales);
        long avarage = sum / sales.length;
        return avarage;
    }

    //Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму:
    public int maxMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму:
    public int minMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month +1;
        }
        return minMonth + 1;
    }

    //Количество месяцев, в которых продажи были ниже среднего значения за все месяцы:
    public int amountMonthBelowAverage(long[] sales) {
        long average = averageMonthSales(sales);
        int amount = 0;
        for (long sale : sales) {
            if (sale < average) {
                ++amount;
            }
        }
        return amount;
    }

    // Количество месяцев, в которых продажи были выше среднего значения за все месяцы:
    public int amountMonthAboveAverage(long[] sales) {
        long average = averageMonthSales(sales);
        int amount = 0;
        for (long sale : sales) {
            if (sale > average) {
                ++amount;
            }
        }
        return amount;
    }
}