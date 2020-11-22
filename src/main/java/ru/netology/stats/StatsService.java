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
        sum = calculateSum(month) / month.length;
        return sum;
    }


    public int findMaxMonth(int[] month) {
        int monthMax = month[0];
        int counterMonth = 0;
        int returnMonth = 1;
        for (int x : month) {
            counterMonth++;
            if (monthMax <= x) {
                monthMax = x;
                returnMonth = counterMonth;
            }
        }
        return returnMonth;
    }

    public int findMinMonth(int[] month){
        int monthMin = month[0];
        int counterMonth = 0;
        int returnMonth = 1;
        for(int x : month){
            counterMonth++;
            if(monthMin >= x){
                monthMin = x;
                returnMonth = counterMonth;
            }
        }
        return returnMonth;
    }

    public int findQuantityUnderAverage(int[] month){
        int count = 0;
        int countUnder = 0;
        int averageSum = calculateAverageSum(month);
        for(int x:month){
            if (averageSum >x){
                count++;
                //countUnder = count;
            }
        }
        return count;
    }

    public int findQuantityOverAverage(int[] month){
        int count = 0;
        int countOver = 0;
        int averageSum = calculateAverageSum(month);
        for(int x:month){
            if (averageSum < x){
                count++;
                //countOver = count;
            }
        }
        return count;
    }

}



