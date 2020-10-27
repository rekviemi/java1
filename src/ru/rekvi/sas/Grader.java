package ru.rekvi.sas;

//        1 - VERYBAD
//        2 - BAD
//        3 - SATISFACTORILY
//        4 - GOOD
//        5 - EXCELLENT
//        все остальное NOTDEFINED

public class Grader {
    enum Grade {
        VERYBAD,
        BAD,
        EXCELLENT,
        GOOD,
        NOTDEFINED,
        SATISFACTORILY,
    }
    static Grade intToGrade(int grade){
            switch (grade){
                case 1: return Grade.VERYBAD;
                case 2: return Grade.BAD;
                case 3: return Grade.SATISFACTORILY;
                case 4: return Grade.GOOD;
                case 5: return Grade.EXCELLENT;
                default: return Grade.NOTDEFINED;
            }
        }
    public static void main(String[] args) {
        System.out.println(intToGrade(55));
    }
}

