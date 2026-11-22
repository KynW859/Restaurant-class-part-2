import java.util.ArrayList;
public class Restaurant {
    //fields
    private String restaurantName, hours = " ";
    private int waitTime = 0;
    private double restaurantStars, priceMin, priceMax = 0.0;

    //Constructor
    public void restaurantConstructor(String n,int wt,double s,double pma,double pmi,String h){
        //calling fields
        this.restaurantName = n;
        this.waitTime = wt;
        this.restaurantStars = s;
        this.priceMin = pma;
        this.priceMax = pmi;
        this.hours = h;
    }//end constructor method

    //override any pesky ToString with a tidy String
    @Override
    public String toString(){
        return "Restaurant name: " + getName() +
                "\nWait time: " + getWaitTime() + " minutes" +
                "\nStar rating: " + getStars() + " stars" +
                "\nPricing average: " + getPriceAvg() +
                "\nWorking hours: " + getHours();
    }

    //Getter Methods
    public String getName(){return restaurantName;}
    public int getWaitTime(){return waitTime;}
    public double getStars(){return restaurantStars;}
    //public double getPriceMin(){return priceMin;} these 2 aren't necessary
    //public double getPriceMax(){return priceMax;}
    public double getPriceAvg(){return (priceMin + priceMax) / 2;}
    public String getHours(){return hours;}
    //Setter Methods
    public void setName(String name){this.restaurantName = name;}
    public void setWaitTime(int waitTime){this.waitTime = waitTime;}
    public void setStars(double stars){this.restaurantStars = stars;}
    public void setPriceMin(double priceMin){this.priceMin = priceMin;}
    public void setPriceMax(double priceMax){this.priceMax = priceMax;}
    public void setHours(String hours){this.hours = hours;}
}//end class



        /* old stuff :P
        public static void Menu(){ //code for the menuItems method
    ArrayList<String> menuItems = new ArrayList<>();

        System.out.println("Chunky Tuna - $40");
    System.out.println("Slimy Bread Chowder - $37");
    System.out.println("Chocolate Dump - $44");
    System.out.println("Creamed Corn Gelatin Stew - $53");
    System.out.println("The Chuck Special - $55");
    System.out.println("Add more sludge to any soup - +$15");
    System.out.println("Build your own soup with choice of slop or slime - ask for pricing");
    }//end menuItems method

        //strings for open hours
        String hoursMidweek = "11 AM - 10 PM";
        String hoursWeekend = "12 PM - 3 AM";
        String hoursHoliday = "9 AM - 8 PM";
        //print statements start here
        System.out.println("Welcome to " + restaurantName + "!");
        System.out.println("Wait time: " + waitTime + " minutes (unless staff is on strike)");
        System.out.println("Current rating: " + restaurantStars + " out of 5 stars");
        System.out.println("Price range: $" + priceMin + " - $" + priceMax + " ($" + priceAvg + " average)");
        //Menu items with method containg the menu items
        System.out.println("Top menu items:");
        Menu();
        //list of open times throughout the week
        System.out.println("Open hours:");
        System.out.println("Monday " + hoursMidweek);
        System.out.println("Tuesday " + hoursMidweek);
        System.out.println("Wednesday " + hoursMidweek);
        System.out.println("Thursday " + hoursMidweek);
        System.out.println("Friday " + hoursMidweek);
        System.out.println("Saturday " + hoursWeekend);
        System.out.println("Sunday " + hoursWeekend);
        System.out.println("Holidays " + hoursHoliday);
        */
