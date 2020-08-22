public class Teste {

    public static String monthName(int num) {
        String monthName;

       switch (num) {
            case  1: monthName= "January";
                break;
            case  2: monthName= "February";
                break;
            case  3: monthName= "March";
                break;
            case  4: monthName= "April";
                break;
            case  5:  monthName= "May";
                break;
            case  6: monthName= "June";
                break;
            case  7: monthName= "July";
                break;
            case  8: monthName= "August";
                break;
            case  9: monthName= "September";
                break;
            case 10: monthName= "Octomber";
                break;
            case 11: monthName= "November";
                break;
            case 12: monthName= "December";
                break;
            default: monthName= "Number must be between 1 - 12";
                break;
        } return monthName;
    }

    public static boolean match (String str1, String str2) {
        if(str1.toLowerCase() == str2.toLowerCase()) {
            return true;
        } return false;
    }


}
