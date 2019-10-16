package com.company.base.accenture.bullsncows;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру Быки и коровы. Введите уровень сложности: 3, 4 или 5");
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt(); //ввод уровня
        UniqueRandom new_rand=new UniqueRandom();
        CheckDigits new_check=new CheckDigits();

        BullsAndCows new_bullsAndCows=new BullsAndCows();
        String result;
        String myInput="";
        String giveUp = new String("Surrender!");
        int attemptsNum=0; //Кол-во попыток
        switch(level) {
            case 3:
                System.out.println("Введите трёхзначное число");
                break;
            case 4:
                System.out.println("Введите четырёхзначное число");
                break;
            case 5:
                System.out.println("Введите пятизначное число");
                break;
            default:
                System.out.println("Неверно выбранная сложность игры");
                System.exit(0);
                break;
        }
        {
            result = new_rand.getRandom(level); //загаданное число с разными цифрами

            while (!myInput.matches(result)) {
                myInput = sc.next();
                attemptsNum++;

                if (myInput.matches(result)) { //В случае, если угадал
                    System.out.println("Вы угадали!");
                    System.out.printf("Загаданное число: %s \n",result);
                    System.out.printf("Кол-во попыток: %d",attemptsNum);
                    System.exit(0);
                }
                if (myInput.matches(giveUp)) {//В случае, если сдался
                    System.out.printf("Загаданное число: %s",result);
                    System.exit(0);
                }
                if(new_check.isDigit(myInput)) { //Проверка на число
                    if(new_check.getCountOfDigits(myInput)==level){   //Проверка на правильность длины
                        if(new_check.checkDigitsUniqueness(myInput)){ //Проверка на то, являются ли все цифры разными
                            System.out.println("Неверно, попробуйте ещё!");
                            new_bullsAndCows.getBullsAndCows(level, myInput, result);
                        }
                        else{
                            System.out.println("Невалидное число! Число должно быть с разными цифрами!");
                        }
                    }
                    else{
                        System.out.println("Невалидное число! Число должно быть правильной длины!");
                    }
                }
                else{
                    System.out.println("Невалидное число! В числе не должно быть символов!");
                }
            }
        }
    }
}
