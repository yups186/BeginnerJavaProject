import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        String[] chars = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                          "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                          "!", "£", "$", "%", "&", "*"};


        for (int i = 0; i < 10; i++) {

            int pick = random.nextInt(0,chars.length);
            
            System.out.print(chars[pick]);

        }


    }
}
