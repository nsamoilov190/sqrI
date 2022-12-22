package ru.netology.sqr;

public class SQRService {


    public int findingSQR(int lowerBoarder, int higherBoarder) {

        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqrI = i * i;

            if (sqrI >= lowerBoarder) {
                if (sqrI <= higherBoarder) {
                    counter++;
                }

            }

        }
        return counter;

    }
}
