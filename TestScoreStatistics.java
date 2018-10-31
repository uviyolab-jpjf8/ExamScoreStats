/* 
CH6- Loops EX6-8
Write an application that allows a user to enter any number of student test scores until the user enters 999. 
If the score entered is less than 0 or more than 100, display an appropriate message and do not use the score. 
After all the scores have been entered, display the number of scores entered, the highest score, the lowest score, and the arithmetic average. 
Save the file as TestScoreStatistics.java.
*/

import java.util.*;

public class TestScoreStatistics {

  public static void main(String args[]) {
    int examScore;
    int total = 0;
    int count = 0;
    int highestScore, lowestScore;
    final int QUIT = 999;
    final int MIN = 0;
    final int MAX = 100;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a score >> ");
    examScore = input.nextInt();
    highestScore = examScore;
    lowestScore = examScore;
    while (examScore != QUIT) {
      if (examScore >= MIN && examScore <= MAX) {
        ++count;
        total += examScore;
        if (examScore > highestScore)
          highestScore = examScore;
        if (examScore < lowestScore)
          lowestScore = examScore;
      } else
        System.out.print("Score must be between " + MAX + " and " + MIN + "   ");
      System.out.print("Enter another score >> ");
      examScore = input.nextInt();
    }
    System.out.println(count + " scores were entered");
    System.out.println("Highest was " + highestScore);
    System.out.println("Lowest was " + lowestScore);
    System.out.println("Average was " + (total * 1.0 / count));
  }
}
