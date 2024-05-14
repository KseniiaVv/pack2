package ru.netology.services;

public class CalcService {
    public int calculate(int income, int expenses, int threshold) {

        int count = 0; // счетчик месяцев отдыха
        int money = 0; //количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money < threshold) { // можем ли отдыхать?
                money = money + income - expenses;
            } else {
                money = (money - expenses) / 3; // сумма остатка
                count++; //
            }
        }
        return count;
    }
}