package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] month) {
        int sum = 0;
        for (int x : month) {
            sum = sum + x;
        }
        return sum;
    }

    public int calculateAverageSum(int[] month) {
        int sum = 0;
        for (int x : month) {
            sum = sum + x;
        }
        sum = sum / month.length;
        return sum;
    }


    public int findMaxMonth(int[] month) {
        int monthMax = month[0];
        int a = 0;
        int b = 1;
        for (int x : month) {
            a = a + 1;
            if (monthMax <= x) {
                monthMax = x;
                b = a;
            }
        }
        return b;
    }

    public int findMinMonth(int[] month){
        int monthMin = month[0];
        int a = 0;
        int b = 1;
        for(int x : month){
            a = a+1;
            if(monthMin >= x){
                monthMin = x;
                b = a;
            }
        }
        return b;
    }

    public int findQuantityUnderAverage(int[] month){
        int count = 0;
        int countUnder = 0;
        int averageSum = calculateAverageSum(month);
        for(int x:month){
            if (averageSum >x){
                count++;
                countUnder = count;
            }
        }
        return countUnder;
    }

    public int findQuantityOverAverage(int[] month){
        int count = 0;
        int countOver = 0;
        int averageSum = calculateAverageSum(month);
        for(int x:month){
            if (averageSum < x){
                count++;
                countOver = count;
            }
        }
        return countOver;
    }

}



