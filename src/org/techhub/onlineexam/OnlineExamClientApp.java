package org.techhub.onlineexam;
import java.util.*;

import org.techhub.helper.OnlineExamHelper;
import org.techhub.question.Question;
public class OnlineExamClientApp {

	public static void main(String[] args) 
	{
		OnlineExamHelper helper=new OnlineExamHelper();
		
		do
		{
		Scanner xyz=new Scanner (System.in);
		System.out.println("1.Add Questions");
		System.out.println("2.View All Questions");
		System.out.println("3.Remove Question");
		System.out.println("4.Search Question");
		System.out.println("Attemt Qusetion");
		System.out.println("Attempt question ");
		System.out.println("Show Results in percentage");
		System.out.println("Enter your Choice:");
		int choice=xyz.nextInt();
		switch(choice)
		{
		case 1:
			xyz.nextLine();
			System.out.println("Enter the Question Id:");
			int qid=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter the Question:");
			String question=xyz.nextLine();
			System.out.println("Enter the Option 1:");
			String option1=xyz.nextLine();
			System.out.println("Enter the Option 2:");
			String option2=xyz.nextLine();
			System.out.println("Enter the Option 3:");
			String option3=xyz.nextLine();
			System.out.println("Enter the Option 4:");
			String option4=xyz.nextLine();
			System.out.println("Enter the Answer:");
			String ans=xyz.next();
			Question q=new Question();
			q.setId(qid);
			q.setName(question);
			q.setOption1(option1);
			q.setOption2(option2);
			q.setOption3(option3);
			q.setOption4(option4);
			q.setAnswer(ans);
			helper.addNewQuestion(q);
			break;
		case 2:
			System.out.println("-----------------------------------------------------");
			System.out.println("Display all data:");
			helper.viewAllQuestions();
			break;
		case 3:
			System.out.println("Enter Question ID which want to delete:");
			int QuestionId=xyz.nextInt();
			helper.removeQuestion(QuestionId);
			break;
		case 4:
			xyz.nextLine();
//			System.out.println("Enter Question Id for Serach:");
//			int qid2=xyz.nextInt();
//			helper.searchQuestion(qid2);
			
			System.out.println("Enter the Question");
			
			question=xyz.nextLine();
			boolean b= helper.searchQuestion(question);
			if(b)
			 {
				 System.out.println("Question Found");
			 }
			 else
			 {
				 System.out.println("Question not Found");
			 }
			break;
		case 5:
			xyz.nextLine();
			System.out.println("Enter the Answer:");
			ans=xyz.nextLine();//a
			System.out.println("Enter the Question number");
			qid=xyz.nextInt();//101
			helper.attemptQuestion(qid, ans);
			break;
			
		case 6:
			helper.showResult();
			break;
		default :
			System.out.println("Wrong choice");
		}
		}while(true);
	}

}
