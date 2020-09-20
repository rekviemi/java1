package ru.rekvi.sas;



/*
 тест блока 4.3
 Напишите метод, вычисляющий факториал числа - n!. Сигнатура метода static long factorial(long n)
Напомним, что факториал n это произведение всех чисел от 1 до n и факториал 0 == 1

static long factorial(long n){
        if( n <= 1 )
            return 1;
        else
         return n * factorial( n - 1 );
}




 тест блока 4.2
 Напишите метод, который возвращает текстовую характеристику оценки по числовой.
0 - не оценено
1..20 - очень плохо
21..40 - плохо
41..60 - удовлетворительно
61..80 - хорошо
81..100 - отлично
в остальных случаях - не определено
Сигнатура метода static String textGrade(int grade)

Например, textGrade(45) должна вернуть "удовлетворительно"

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println(textGrade(34));

    }
    static String textGrade(int grade){
        String score;
        if(grade >= 1 & grade <= 20)
            score = "очень плохо";
        else if (grade >= 21 & grade <= 40)
            score = "плохо";
        else if (grade >= 41 & grade <= 60)
            score = "удовлетворительно";
        else if (grade >= 61 & grade <= 80)
            score = "хорошо";
        else if (grade >= 81 & grade <= 100)
            score = "отлично";
        else if (grade == 0 & grade == 0)
            score = "не оценено";
        else
            score = "не определено";
        return score;

    }
}

*/