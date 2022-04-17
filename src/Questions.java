import java.util.Scanner;
import java.util.ArrayList;
public class Questions {
    private ArrayList<String> questions;
    private ArrayList<String> answers;
    private Scanner sc;

    public Questions()
    {
        sc = new Scanner(System.in);
        questions = new ArrayList<String>();
        questions.add("How many Elepants are killed Each Year?");
        questions.add("How many Elepants are alive in Asia?");
        questions.add("How many turles die of polution?");
        questions.add("How many turles out of 1000 will reach adulthood"); // 1
        questions.add("Which state in the US has the most dog abuse cases"); // florida
        questions.add("How many Stray dogs are there?");
        questions.add("How many Tigers are there?");
        answers = new ArrayList<String>();
        answers.add("2038");

    }

    public boolean isCorrect(int num){
        System.out.println(questions.get(num));
        String answer = sc.nextLine();
        if(answer.equals(answers.get(num))){
            return true;
        }
        else{
            return false;
        }
    }
}
