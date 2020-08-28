package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] month) {
        int sum = 0;
        for(int x:month){
            sum = sum + x;
        }
        return sum;
    }

    public int calculateAverageSum(int[] month) {
        int sum = 0;
        for(int x:month){
            sum = sum + x;
        }
        sum = sum/month.length;
        return sum;
    }


    public long findMax(long[] month){
        long currentMax = month[0];
        for(long x:month){
            if(currentMax<x){
                currentMax = x;
            }
        }
        return currentMax;
    }
}


//    Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
//        Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
//        Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
//        Кол-во месяцев, в которых продажи были выше среднего (см. п.2)