package ru.netology.javaqamvn;

import ru.netology.javaqamvn.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualSum = service.sumAllSales(sales);
        System.out.println("Сумма всех продаж = " + actualSum);

        long averageMonthSales = service.averageMonthSales(sales);
        System.out.println("Средняя сумма продаж = " +averageMonthSales);

        int maxMonth = service.maxMonth(sales);
        System.out.println("Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму: " + maxMonth);

        int minMonth = service.minMonth(sales);
        System.out.println("Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму: " + minMonth);

        int amountMonthBelowAverage = service.amountMonthBelowAverage(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего значения за все месяцы: " + amountMonthBelowAverage);

        int amountMonthAboveAverage = service.amountMonthAboveAverage(sales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего значения за все месяцы: " + amountMonthAboveAverage);

    }


}