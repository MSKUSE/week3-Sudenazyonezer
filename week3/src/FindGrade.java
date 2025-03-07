
public class FindGrade{

    public static void main(String[] args) {
        if (args.length == 1) {
            int grade = Integer.parseInt(args[0]);
            if (grade >= 90 && grade < 100) {
                System.out.println("A");

            } else if (grade >= 80 && grade < 89) {
                System.out.println("B");
            } else if (grade >= 70 && grade < 79) {
                System.out.println("C");
            } else if (grade >= 60 && grade < 69) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }else{
            System.out.println("Grade is not given");
        }
    }
}


        //Get the score from the user as a file paramet
        //Calculate the grade based on the score
        //Print the grade to the console
        // 90 - 100 -> A
        // 80 - 89 -> B
        // 70 - 79 -> C
        // 60 - 69 -> D
        // 0 - 59 -> F