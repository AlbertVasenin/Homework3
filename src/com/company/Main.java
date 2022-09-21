package com.company;

public class Main {
    public static void main(String[] args){
        // Задание 1
        System.out.println("Задание №1");
        int twoHundred = 200;
        byte one = 1;
        short oneHundred = 100;
        long oneMillion = 1_000_000L;
        float zeroSeven = 2.3654f;
        double zero16 = 6.3564854687452;
        System.out.println("Значение переменной twoHundred с типом int равно: " + twoHundred);
        System.out.println("Значение переменной one с типом byte равно: " + one);
        System.out.println("Значение переменной oneHundred с типом short равно: " + oneHundred);
        System.out.println("Значение переменной oneMillion с типом long равно: " + oneMillion);
        System.out.println("Значение переменной zeroSeven с типом float равно: " + zeroSeven);
        System.out.println("Значение переменной zero16 с типом double равно: " + zero16);
        // Задание 2
        System.out.println("Задание №2");
        float q = 27.12f;
        long w = 987_678_965_549L;
        byte e = 2;
        short r = 786;
        boolean t = 5 > 10;
        short y = 569;
        short u = -159;
        int i = 27897;
        byte o = 67;
        System.out.print(q+","+w+","+e+","+r+","+t+","+y+","+u+","+i+","+o);
        System.out.println();
        // Задание 3
        System.out.println("Задание №3");
        byte ludaPupils = 23;
        byte annaPupils = 27;
        byte ekaterinaPupils = 30;
        short papers = 480;
        int totalPupils = annaPupils+ludaPupils+ekaterinaPupils;
        int papersOnePupil = papers / totalPupils;
        System.out.println("На каждого ученика рассчитано " + papersOnePupil + " листов бумаги");
        // Задание 4
        System.out.println("Задание №4");
        byte performanceMachineMinute1 = 16/2; // производит машина за 1 минуту
        System.out.println("За 1 минуту работы машина произвела бутылок " + performanceMachineMinute1 + " штук");
        int performanceMachineMinute20 = performanceMachineMinute1 * 20; // производит машина за 20 минут
        System.out.println("За 20 минут работы машина произвела бутылок " + performanceMachineMinute20 + " штук");
        int oneDayMinute = 24 * 60; // общее количество минут в сутках
        int performanceMachineOneDay = performanceMachineMinute1 * oneDayMinute; // производит машина за сутки
        System.out.println("За сутки работы машина произвела бутылок " + performanceMachineOneDay + " штук");
        System.out.println("За трое суток работы машина произвела бутылок " + performanceMachineOneDay * 3 + " штук");
        System.out.println("За месяц работы машина произвела бутылок " + performanceMachineOneDay * 31 + " штук");
        // Задание 5
        System.out.println("Задание №5");
        byte bottlePaint = 120; // банок краски всего
        byte whitePaintOneClassroom = 2; // белой краски уходит на один класс
        byte brownPaintOneClassroom = 4; // коричневой краски уходит на один класс
        int totalClassroom = bottlePaint / (whitePaintOneClassroom + brownPaintOneClassroom); // всего классов в школе
        int whitePaintBuy = totalClassroom * whitePaintOneClassroom; // куплено белой краски всего
        int brownPaintBuy = totalClassroom * brownPaintOneClassroom; // куплено коричневой краски всего
        System.out.println("В школе, где " + totalClassroom + " классов, нужно " + whitePaintBuy + " банок белой краски и " + brownPaintBuy + " банок коричневой краски");
        // Задание 6
        System.out.println("Задание №6");
        int oneBananaWeight = 80; // вес одного банана
        int milk100ml = 105; // вес 100 мл молока
        int iceCreamBriquetteOne = 100; // вес одного брикета мороженого
        int oneEgg = 70; // вес одного яйца
        int totalBananaWeight = oneBananaWeight * 5; // общий вес  5 бананов
        int totalMilk = milk100ml * 2; // общий вес 200 мл молока
        int totalIceCreamBriquette = iceCreamBriquetteOne * 2; // общий вес 2х брикетов мороженого
        int totalEggs = oneEgg * 4; // общий вес 4х яиц
        int totalWeightAllProducts = totalBananaWeight + totalMilk + totalIceCreamBriquette + totalEggs; // общий вес всех продуктов
        System.out.println("Вес всех продуктов " + totalWeightAllProducts/1000 + " кг " + totalWeightAllProducts % 1000 + " грамм");
        // Задание 7
        System.out.println("Задание №7");
        int goal = 7;
        goal = goal *1000; // цель в граммах
        int oneDayWeight = 250; // терять в весе каждый день 250гр
        int oneDayWeight2 = 500; // терять в весе каждый день 500гр
        int day = goal / oneDayWeight; // дней потребуется,чтобы терять в весе каждый день по 250гр до цели
        int day2 = goal / oneDayWeight2; // дней потребуется,чтобы терять в весе каждый день по 500гр до цели
        System.out.println(day + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(day2 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
        int average = (day + day2) / 2; // среднее количество дней для потери веса в день
        System.out.println(average + " день уйдёт на похудение в среднем, если спортсмен будет худеть в день на " + goal/average + " гр " + goal%average+" мг");
        // Задание 8
        System.out.println("Задание №8");
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        int masha10 = masha + (masha * 10) / 100; // новая зп Маши
        int denis10 = denis + (denis * 10) / 100; // новая зп Дениса
        int kris10 = kris + (kris * 10) / 100; // новая зп Кристины
        int mashaYearOld = masha * 12; // годовой доход по старой зп Маши
        int denisYearOld = denis * 12; // годовой доход по старой зп Дениса
        int krisYearOld = kris *12; // годовой доход по старой зп Кристины
        System.out.println("Маша теперь получает " + masha10 + " рублей. Годовой доход вырос на " + (masha10 * 12 - mashaYearOld) +" рублей");
        System.out.println("Денис теперь получает " + denis10 + " рублей. Годовой доход вырос на " + (denis10 * 12 - denisYearOld) +" рублей");
        System.out.println("Кристина теперь получает " + kris10 + " рублей. Годовой доход вырос на " + (kris10 * 12 - krisYearOld) +" рублей");

    }
}
