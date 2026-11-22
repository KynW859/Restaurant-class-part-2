import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Application {

    // --restRandom method--
    // create random object: rng
    // create int that contains a value generated from random object
    // then prints as an index of the ArrayList
    // the cap is based on the list size (in this case, up to 61)
    // any value larger would result in the out of bounds exception
    public static void restRandom(ArrayList list){
        Random rng = new Random();
        try {
            int restChoice = rng.nextInt(list.size());
            System.out.print(list.get(restChoice));
        }//end try
        catch (IllegalArgumentException e){} //blank because it should already inform the user the file is missing
    }//end rest random

    public static void restRead(String fileName){
        //objects
        ArrayList<Restaurant> restList = new ArrayList<>();
        File restTxt = new File(fileName);

        //scanner containing File object as a parameter
        //trys to read file, if it can't then catch it
        try (Scanner sc = new Scanner(restTxt)){
            // --WHILE LOOP--
            // goes through the file
            //',' is identified as a delimiter to separate fields within data
            // then, it creates a new restaurant object, and then sets the data from the text file as its fields
            // field types go in order of:
            // - String (name),
            // - int (wait time),
            // - double (star rating)
            // - two more doubles (price max and min, which are processed into the price average)
            // - String (hours)
            // the Restaurant object is then inserted into the restList
            while(sc.hasNextLine()){
                Scanner line = new Scanner(sc.nextLine());
                line.useDelimiter(",");
                Restaurant rest = new Restaurant();
                rest.setName(line.next());
                rest.setWaitTime(Integer.parseInt(line.next()));
                rest.setStars(Double.parseDouble(line.next()));
                rest.setPriceMax(Double.parseDouble(line.next()));
                rest.setPriceMin(Double.parseDouble(line.next()));
                rest.setHours(line.next());
                restList.add(rest);
            }//end while
        }//end try
        catch (FileNotFoundException e){
            System.out.println("Regrettably, the file could not be found:\n" + e);

        }//end catch

        //call restRandom method
        restRandom(restList);

    }//end restRead method

    public static void main(String[] args) {
        //call restRead method
        restRead(".\\restaurant.txt");

    }//end main
}//end class
