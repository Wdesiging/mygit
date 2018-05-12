package Model;

import java.util.List;
import java.util.ArrayList;

public class Workflow {
	
	private int flowId;
	private int jobNum;
	private int edgeNum;
	
	private List<Edge> edgeSet=new ArrayList<Edge>();
	
	private long deadline;
	private int benefit;
	private int penalty;//per second
	
	private long finishTime;
	private long startTime;
	
    public Workflow(int flowId, int jobNum, int edgeNum, long deadline, int benefit, int penalty) {
		this.flowId = flowId;
		this.jobNum = jobNum;
		this.edgeNum = edgeNum;
		this.deadline = deadline;
		this.benefit = benefit;
		this.penalty = penalty;
	}
		
   public int getflowId(){
	   return flowId;
   }
   
   public void setflowId(int flowId){
	   this.flowId=flowId;
   }
   
   public int getjobNum(){
	   return jobNum;
   }
   
   public void setjobNum(int jobNum){
	   this.jobNum=jobNum;
   }
   
   public int getedgeNum(){
	   return edgeNum;
   }
   
   public void setedgeNum(int edgeNum){
	   this.edgeNum=edgeNum;
   }
   
   public List<Edge> getedgeSet(){
	   return edgeSet;
   }
   
   public void setedgeSet(List<Edge> edgeSet){
	   this.edgeSet=edgeSet;
   }
   
   public long getdeadline(){
	   return deadline;
   }
   
   public void setdeadline(long deadline){
	   this.deadline=deadline;
   }
   
   public int getbenefit(){
	   return benefit;
   }
   
   public void setbenefit(int benefit){
	   this.benefit=benefit;
   }
   
   public int getpenalty(){
	   return penalty;
   }
   
   public void setpenalty(int penalty){
	   this.penalty=penalty;
   }
   
   public long getfinishTime(){
	   return finishTime;
   }
   
   public void setfinishTime(long finishTime){
	   this.finishTime=finishTime;
   }
   
   public long getstartTime(){
	   return startTime;
   }
   
   public void setstartTime(long startTime){
	   this.startTime=startTime;
   }
}
