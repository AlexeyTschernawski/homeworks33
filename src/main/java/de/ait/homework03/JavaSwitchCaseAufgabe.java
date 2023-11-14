package de.ait.homework03;

public class JavaSwitchCaseAufgabe {

    /*
    switch (expression) {
    case value1:
        // код для случая 1
        break;

    case value2:
        // код для случая 2
        break;

    // можно добавить сколько угодно case

    default:
        // код, который будет выполняться, если ни один из case не сработает
}
     */
    public static void main(String[] args) {

        int day = 5;
        String dayOfWeek;
        switch (day){
            case 1:
                dayOfWeek = "Montag";
                break;
            case 2:
                dayOfWeek = "Dienstag";
                break;
            case 3:
                dayOfWeek = "Mittwoch";
                break;
            case 4:
                dayOfWeek = "Donnerstag";
                break;
            case 5:
                dayOfWeek = "Freitag";
                break;
            case 6:
                dayOfWeek = "Samstag";
                break;
            case 7:
                dayOfWeek = "Sontag";
                break;
            default:
                dayOfWeek = "ERROR!!!";
        }
        //System.out.println(dayOfWeek);

        String dayOfWeekNew;
        dayOfWeekNew = switch (day){
            case 1 -> "Montag";
            case 2 -> "Dienstag";
            case 3 -> "Mittwoch";
            case 4 -> "Donnerstag";
            default -> "falsche Angabe";
        };
        System.out.println(dayOfWeekNew);


    }
}
