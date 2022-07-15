public class WhichSeason {

    public void monthWhichSeason(Month month) {
        switch(month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("It's Winter!");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("It's Spring!");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("It's Summer!");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("It's Autumn!");
                break;
            default:
                break;
        }
    }
}
