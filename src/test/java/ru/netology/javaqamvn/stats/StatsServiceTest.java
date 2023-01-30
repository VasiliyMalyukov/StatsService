package ru.netology.javaqamvn.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

    //Сумма всех продаж:
    @Test
    public void testSumAllSales() {
        StatsService service = new StatsService();

        long expectedSum = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actualSum = service.sumAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    //Средняя сумма продаж в месяц:
    @Test
    public void testAverageMonthSales() {
        StatsService service = new StatsService();

        long expectedAverage = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;
        long actualAverage = service.averageMonthSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    //Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму:
    @Test
    public void testMaxMonth(){
        StatsService service = new StatsService();

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    //Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму:
    @Test
    public void testMinMonth() {
        StatsService service = new StatsService();

        int expectedMinMonth = 9;
        int actualMinMonth = service.minMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    //Количество месяцев, в которых продажи были ниже среднего значения за все месяцы:
    @Test
    public void testAmountMonthBelowAverage() {
        StatsService service = new StatsService();

        int expextedAmountMonthBelow = 5;
        int actualAmountMonthBelow = service.amountMonthBelowAverage(sales);

        Assertions.assertEquals(expextedAmountMonthBelow, actualAmountMonthBelow);
    }

    // Количество месяцев, в которых продажи были выше среднего значения за все месяцы:
    @Test
    public void testAmountMonthAboveAverage() {
        StatsService service = new StatsService();

        int expectedAmountMonthAbove = 5;
        int actualAmountMonthAbove = service.amountMonthAboveAverage(sales);

        Assertions.assertEquals(expectedAmountMonthAbove, actualAmountMonthAbove);
    }
}
