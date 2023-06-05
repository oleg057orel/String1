package ru.netology.stats;
public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales){
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        if (sales.length > 0) {
            return sum(sales) / sales.length;
        }
        return 0;
    }

    public long monthMaximumSale(long[] sales) {
        int monthMaximum = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }


    public long monthMinimumSale(long[] sales) {
        int monthMinimum = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }
    public long monthsBellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);

        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
            
        }
        return counter;
    }
}


