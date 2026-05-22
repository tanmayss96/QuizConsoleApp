import java.util.Scanner;
public class QuestionService {
   Question[] questions = new Question[5];
   String selection[] = new String[5];
   public QuestionService()
   {
    questions[0] = new Question(1,"What is Java?","Lang","Animal","Car","Food","Lang");

    questions[1] = new Question(2,"What is OOP?","Concept","Food","Game","Movie","Concept");

    questions[2] = new Question(3,"JVM stands for?","Java VM","Python VM","C VM","None","Java VM");

    questions[3] = new Question(4,"Which is keyword?","class","apple","car","dog","class");

    questions[4] = new Question(5,"Which is loop?","for","eat","sleep","run","for");
    
   }

    public void playQuiz()
    {
        int i =0;
        for(Question q : questions){
        System.out.println("Question no. : "+q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());

        Scanner sc = new Scanner(System.in);
        selection[i] = sc.nextLine();
        i++;
        }
        int b =0;
        for(String s : selection )
        {
            b++;
            System.out.println("Your selected answers for Question no. : " +b);
            System.out.println(s);
        }
    }   
    public void printScore()
    {
        int score = 0;

        for(int i =0;i<questions.length;i++)
        {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAns = selection[i];

            if(actualAnswer.equals(userAns))
            {
                score++;
            }
        }
        System.out.println("Your Score is : "+score);

    } 
}
