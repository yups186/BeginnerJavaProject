// make random password generator utilising all types of characters
// strength validator to see if it contains a unique character from each array
// if weak, regenerate the password

import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Random random = new Random();

String[] lowerCase = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                      "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                      "u", "v", "w", "x", "y", "z"};

String[] upperCase = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                      "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                      "U", "V", "W", "X", "Y", "Z"};

String[] symbols = {"!", "£", "$", "%", "^", "&", "*"};

int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};




while (true) {
    boolean isLowerCase = false;
    boolean isUpperCase = false;
    boolean isSymbol = false;
    boolean isNumber = false;
    int limit = random.nextInt(3, 11);

    for (int i = 0; i < limit; i++) {

        int letterSelect = random.nextInt(0, 26);

        int symbolSelect = random.nextInt(0, symbols.length);

        int numbersSelect = random.nextInt(0, numbers.length);

        int arraySelect = random.nextInt(1, 5);

        if (arraySelect == 1) {
            System.out.print(lowerCase[letterSelect]);
            isLowerCase = true;
        } else if (arraySelect == 2) {
            System.out.print(upperCase[letterSelect]);
            isUpperCase = true;
        } else if (arraySelect == 3) {
            System.out.print(symbols[symbolSelect]);
            isSymbol = true;
        } else if (arraySelect == 4) {
            System.out.print(numbers[numbersSelect]);
            isNumber = true;
        }




    }

    System.out.println(" ");
if (isLowerCase && isUpperCase && isSymbol && isNumber && limit > 9)
    {System.out.println("STRONG PASSWORD FOUND ");
    break;}
else {System.out.println("WEAK PASSWORD ->  REGENERATING");}

}





    }
}
