package Model;

import java.util.List;
import java.util.ArrayList;

public class Task {
	
	public static final int DUPLICATE = 3;
	public static final int BLOCK_SIZE = 256;
	
	private int flowId;
	private int jobId;
	private int taskId;
	private TaskType type;
	
	private long processTime;//任务执行时间
	private long finishTime;//截止时间
	private long startTime;//开始时间
	private long transTime;//传输时间
	
	private List<Node> inputSet=new ArrayList<Node>();
	private List<Node> outputSet=new ArrayList<Node>();
	
	public enum TaskType {MAP, REDUCE}
	
	public Task(int flowId, int jobId, int taskId, long processTime, TaskType type,
			List<Node> inputSet, List<Node> outputSet) {//map task
		this.flowId = flowId;
		this.jobId = jobId;
		this.taskId = taskId;
		this.processTime = processTime;
		this.type = type;
		this.inputSet = inputSet;
		this.outputSet = outputSet;
	}
	
	
	public Task(int flowId, int jobId, int taskId, long processTime, TaskType type,
			List<Node> outputSet) {//reduce task
		super();
		this.flowId = flowId;
		this.jobId = jobId;
		this.taskId = taskId;
		this.processTime = processTime;
		this.type = type;
		this.outputSet = outputSet;
	}

	public int getflowId(){
		return flowId;
	}
	
	public void setflowId(int flowId){
		this.flowId=flowId;
	}
	
	public int getjobId(){
		return jobId;
	}
	
	public void setjobId(){
		this.jobId=jobId;
	}
	
	public int gettaskId(){
		return taskId;
	}
	
	public void settaskId(int taskId){
		this.taskId=taskId;
	}
	
	public TaskType gettype(){
		return type;
	}
	
	public void settype(TaskType type){
		this.type=type;
	}
	
	public long getprocessTime() {
		return processTime;
	}
	
	public void setprocessTime(long processTime) {
		this.processTime = processTime;
	}
	
	public long getfinishTime() {
		return finishTime;
	}
	
	public void setfinishTime(long finishTime) {
		this.finishTime = finishTime;
	}
	
	public void setstartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getstartTime() {
		return startTime;
	}
	
	public long gettransTime(){
		return transTime;
	}
	
	public void settransTime(long transTime){
		this.transTime=transTime;
	}
	
	public List<Node> getinputSet(){
		return inputSet;
	}
	
	public void setinputSet(List<Node> inputSet){
		this.inputSet=inputSet;
	}
	
	public List<Node> getoutputSet(){
		return outputSet;
	}
	
	public void setoutputSet(List<Node> outputSet){
		this.outputSet=outputSet;
	}
	
}

