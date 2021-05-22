// Link of the problem : https://edabit.com/challenge/BxnxYJGQ9MMQn2EfR

public class YouPassedTheExam{
    public static String gradePercentage(String userScore, String passScore){
        String s = "";
        if (Integer.parseInt(userScore.substring(0,userScore.length() - 1)) >= Integer.parseInt(passScore.substring(0,passScore.length() - 1))){
            s += "PASSED";
        }
        else{
            s += "FAILED";
        }
        return "You " + s + " the Exam";
    }
}
