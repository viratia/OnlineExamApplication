package org.techhub.helper;
import org.techhub.question.*;
import java.util.*;
public class OnlineExamHelper
{
	List list=new ArrayList();
	int count;
	public void addNewQuestion(Question question)
	{
		list.add(question);
	}
	public void viewAllQuestions() 
	{
		for(Object obj:list)
		{
			Question q=(Question)obj;
			System.out.println(q.getId()+"\t"+q.getName()+"\t"+q.getOption1()+"\t"+q.getOption2()+"\t"+q.getOption3()+"\t"+q.getOption4()+"\t"+q.getAnswer());
		}
	}
	
	public void removeQuestion(int QuestionId)
	{
		for(int i=0;i<list.size();i++)
		{
				Question qq = (Question)list.get(i);
				if(qq.getId() == QuestionId) {
					list.remove(i);
					break;
				}
		}
	}
	
//	public void searchQuestion(int qid2)
//	{
//		for(Object obj:list)
//		{
//			Question q=(Question)obj;
//			int qid=q.getId();
//			if(qid==qid2)
//			{
//				int index=list.indexOf(q);
//				if(index!=-1)
//				{
//					list.contains(q);
//					System.out.println(q.getId()+"\t"+q.getName()+"\t"+q.getOption1()+"\t"+q.getOption2()+"\t"+q.getOption3()+"\t"+q.getOption4()+"\t"+q.getAnswer());
//				}
//			}
//		}
//	}
	
	public boolean searchQuestion(String questionName)
	{
		Iterator i=list.iterator();
		boolean b=false;
		while(i.hasNext())
		{
			Object obj=i.next();
			Question q=(Question)obj;
			String question=q.getName();
			if(question.equals(questionName))
			{
				b=true;
				break;
			}
		}
		return b;
	}

	
	public void attemptQuestion(int questionId,String answer)
	{
		for(Object obj:list)
		{
			Question q=(Question)obj;
			int qid=q.getId();
			String ans=q.getAnswer();
			if(qid==questionId && ans.equals(answer))
			{
				count++;//1
			}
		}
	}
	
	public void showResult()
	{
		if(list.size()!=0)
		{
		float totalQuestion=list.size();//2
		float incorrectQuestion=(totalQuestion-count);
		float per=count/totalQuestion;
		System.out.println("Percentage Achieved by Student"+(per*100));
		}
		else
		{
			System.out.println("please add question in test then you get result");
		}
	}
}



















