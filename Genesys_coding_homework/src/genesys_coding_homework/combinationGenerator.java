package genesys_coding_homework;

import java.util.*;


public class combinationGenerator {

    public static void main(String[] args) {
        String[] letterTable = {"0", "1", "abc", "def", "ghi", "jkl", "mno",  "pqrs", "tuv", "wxyz"};
        while (true) {
            String numbers = inputNumbers();
            combinationGenerating(numbers, letterTable);
        }

    }
    public static String inputNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digits = ");
        String numbers = sc.nextLine();
        while (numbers.length() > 4 || numbers.contains("1") || numbers.contains("0")){
            System.out.print("Too long, the length can't be more than 4, and you can't use the 0 or 1 in your input\nDigits = ");
            numbers = sc.nextLine();
        }
        return numbers;

    }



    public static void combinationGenerating(String numbers, String[] letters){

        List<String> combinationList = new LinkedList<>();
        Queue<String> combinationQ = new LinkedList<>();

        combinationQ.add("");

        while (!combinationQ.isEmpty()){
            String letterComb = combinationQ.remove();

            if (letterComb.length() == numbers.length() && numbers.length()!=0){
                combinationList.add(letterComb);
            }else if (numbers.length()==0){
            }
            else{
                String givenChars = letters[Character.getNumericValue(numbers.charAt(letterComb.length()))];
                for (int i = 0; i < givenChars.length(); i++) {
                        combinationQ.add(letterComb+""+givenChars.charAt(i));

                }
            }
        }
        combinationsOnTerminal(combinationList);
    }

    public static void combinationsOnTerminal(List<String> combinations){
        System.out.print("[");
        for (String element : combinations){
            System.out.print("\""+element+"\", ");
        }
        System.out.println("]");
        System.out.println("Number of combinations: "+combinations.size());

    }



}
