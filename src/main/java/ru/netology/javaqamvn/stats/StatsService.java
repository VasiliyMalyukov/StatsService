package ru.netology.javaqamvn.stats;

public class StatsService {
    //Сумма всех продаж:
    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    //Средняя сумма продаж в месяц:
    public int averageMonthSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        int avarage = sum / sales.length;
        return avarage;
    }

    //Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму:
    public int maxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму:
    public int minMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month +1;
        }
        return minMonth + 1;
    }

    //Количество месяцев, в которых продажи были ниже среднего значения за все месяцы:
    public int amountMonthBelowAverage(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        int average = sum / sales.length;
        int amount = 0;
        for (int sale : sales) {
            if (sale < average) {
                ++amount;
            }
        }
        return amount;
    }

    // Количество месяцев, в которых продажи были выше среднего значения за все месяцы:
    public int amountMonthAboveAverage(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        int average = sum / sales.length;
        int amount = 0;
        for (int sale : sales) {
            if (sale > average) {
                ++amount;
            }
        }
        return amount;
    }
}