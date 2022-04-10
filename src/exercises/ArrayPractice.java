package exercises;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayList <Integer> practiceList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int[] numbersArr = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 != 0) {
                System.out.println(numbersArr[i]);
            }
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String [] words = phrase.split("\\.");
        System.out.println(Arrays.toString(words));

        //3.7.2 ArrayList Practice
        ArrayList<String> myString = new ArrayList<>(Arrays.asList("once", "upon", "a", "time", "there", "lived", "a", "princess"));

        //call the methods inside of Main, all variables must be declared above where you call a method with the variable
        System.out.println(sumEvens(practiceList));
        printWords(myString);

            }
            //outside Main
            public static Integer sumEvens(ArrayList<Integer> practiceList) {
                Integer sum = 0;
               //for (int i = 0; i < practiceList.size(); i++) {
                    //if (practiceList(i) % 2 == 0) {
                        //sum += practiceList.get(i);
                for( int practice : practiceList){
                    if (practice % 2 ==0) {
                    sum += practice;
            }
        }
                return sum;
    }
            //setting up my method, my argument is string, and I will replace that with myString when I call the method
            public static void printWords(ArrayList<String> string) {
                for(String word : string) {
                    if(word.length() == 5) {
                        System.out.println(word);
                    }
                }
            }
}
