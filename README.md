# Restaurant-class-part-2

- For part 2, the Application file holding the main method was completely overhauled and no longer takes input.
- Two new methods were made in Application: restRead and restRandom.
- The main method only contains the call to restRead, which has the ArrayList, File object, and scanner provided through a try & catch block.
- Another scanner is made in a while loop, which reads the lines as a string
- The "," character is identified as a delimiter, which separates different values of fields through parsing when needed.
- Used the values identified to create a restaurant object through setter methods, then added that object into the ArrayList.
- The catch block activates if the provided string is incorrectly named, or if the file doesn't exist.
- After the while loop, restRead will call restRandom, which uses the ArrayList as a parameter.
- A random object is created, then an int holding the random value, which is bound based on the ArrayList's size (up to 62, but only goes up to 61).
- Finally, it prints the index based on the random value, providing a randomly presented restaurant object.
- Another try & catch block was made in restRandom, because while the first catch would work, it would mean the random method would have the improper values to work with, throwing a IllegalArgumentException. The catch block there was left blank since two errors in a row could be confusing.

  The one troubling detail was how the txt file could not be read when in src folder. So I had a second pair of eyes work on it and they just moved the file up from the src folder in the project. In order to read it, the String to put though the restRead method has to be ".//restaurant.txt" with the '.' telling the program to move up one folder and then read it there.  
