package HomeWork1;

public class Homework1 {

    public static void main(String[] args) {

        byte a = -1;
        int b = 5;
        short c = 191;
        long d = 2411L;
        float e = 73.7f;
        double g = 209.1;


        float boxerOneWeight = 78.2f;
        float boxerTwoWeight = 82.7f;
        float allBoxersWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println("Вес обоих боксероа " + allBoxersWeight + " кг");

        float boxerDifferenceWeight = boxerTwoWeight - boxerOneWeight;
        System.out.println("Разница в весе между двумя боксерами " + boxerDifferenceWeight + " кг");


        byte bananasWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggsWeight = 70;
        int bananasForBreakfastWeight =  bananasWeight * 5;
        int milkForBreakfastWeight = milkWeight * 2;
        int iceCreamForBreakfastWeight = iceCreamWeight * 2;
        int eggsForBreakfastWeight = eggsWeight * 4;
        float BreakfastWeight = bananasForBreakfastWeight + milkForBreakfastWeight + iceCreamForBreakfastWeight
                + eggsForBreakfastWeight;
        System.out.println("Вес завтрака " + BreakfastWeight + " грамм");

        float BreakfastWeightKg = BreakfastWeight / 1000;
        System.out.println("Вес завтрака " + BreakfastWeightKg + " кг");


        short excessWeight = 7000;
        short lightWeightLossInOneDay = 250;
        int daysForLightWeightLoss = excessWeight / lightWeightLossInOneDay;
        short hardWeightLossInOneDay = 500;
        int daysForHardWeightLoss = excessWeight / hardWeightLossInOneDay;
        int middleDaysForWeightLoss = (daysForLightWeightLoss + daysForHardWeightLoss) / 2;
        System.out.println("При потере веса в 250 грамм в день, для похудения потребуется "
                + daysForLightWeightLoss + " дней");
        System.out.println("При потере веса в 500 грамм в день, для похудения потребуется "
                + daysForHardWeightLoss + " дней");
        System.out.println("В среднем для похудения понадобится " + middleDaysForWeightLoss + " день");


        int mashaWage = 67760;
        int denWage = 83690;
        int krisWage = 76230;
        int mashaWageInYear = mashaWage * 12;
        int denWageInYear = denWage * 12;
        int krisWageInYear = krisWage * 12;
        double mashaWageUp = mashaWage * 1.1;
        double denWageUp = denWage * 1.1;
        double krisWageUp = krisWage * 1.1;
        double mashaWageUpInYear = mashaWageUp * 12;
        double denWageUpInYear = denWageUp * 12;
        double krisWageUpInYear = krisWageUp * 12;
        double mashaDifferenceWageInYear = mashaWageUpInYear % mashaWageInYear;
        double denDifferenceWageInYear = denWageUpInYear % denWageInYear;
        double krisDifferenceWageInYear = krisWageUpInYear % krisWageInYear;
        System.out.println("Маша теперь получает " + mashaWageUp + " рублей в месяц," +
                " а ее годовой доход вырос на " + mashaDifferenceWageInYear + " рублей");
        System.out.println("Денис теперь получает " + denWageUp + " рублей в месяц," +
                " а его годовой доход вырос на " + denDifferenceWageInYear + " рублей");
        System.out.println("Кристина теперь получает " + krisWageUp + " рублей в месяц," +
                " а ее годовой доход вырос на " + krisDifferenceWageInYear + " рублей");




















    }
}




