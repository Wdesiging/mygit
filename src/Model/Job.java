package Model;

import java.util.ArrayList;
import java.util.List;

public class Job {
	
	private int flowId;
	private int jobId;
	private int mapNum;
	private int reduceNum;
	private double MRatio;
	private double RRatio;
	
	private long ESTime;//最早开始时间
	private long EFTime;//最早完成时间
	private long LFTime;//最晚完成时间
	
	private long startTime;
	private long finishTime;
	
	private List<Task> maps = new ArrayList<Task>();
	private List<Task> reduces = new ArrayList<Task>();
	
	public Job(int flowId, int jobId, int mapNum, int reduceNum, int MRatio, int RRatio) {
		this.flowId = flowId;
		this.jobId = jobId;
		this.mapNum = mapNum;
		this.reduceNum = reduceNum;
		this.MRatio=MRatio;
		this.RRatio=RRatio;
	}
	
	public int getflowId(){
		return flowId;
	}
	
	public void setflowId(int flowId){
		this.flowId=flowId;
	}
	
	public int getjobId() {
		return jobId;
	}
	
	public void setjobId(int jobId) {
		this.jobId = jobId;
	}
	
	public int getmapNum() {
		return mapNum;
	}
	
	public void setmapNum(int mapNum) {
		this.mapNum = mapNum;
	}
	
	public int getreduceNum() {
		return reduceNum;
	}
	
	public void setreduceNum(int reduceNum) {
		this.reduceNum = reduceNum;
	}
	
	public double getMRatio() {
		return MRatio;
	}
	
	public void setMRatio(int MRatio) {
		this.MRatio = MRatio;
	}
	
	public double getRRatio() {
		return RRatio;
	}
	
	public void setRRatio(int RRatio) {
		this.RRatio = RRatio;
	}
	
	public long getESTime() {
		return ESTime;
	}
	
	public void setESTime(long ESTime) {
		this.ESTime = ESTime;
	}
	
	public long getEFTime() {
		return EFTime;
	}
	
	public void setEFTime(long EFTime) {
		this.EFTime = EFTime;
	}
	
	public long getLFTime() {
		return LFTime;
	}
	
	public void setLFTime(long LFTime) {
		this.ESTime = LFTime;
	}
	
	public long getstartTime() {
		return startTime;
	}
	
	public void setstartTime(long startTime) {
		this.startTime = startTime;
	}
	
	public long getfinishTime() {
		return finishTime;
	}
	
	public void setfinishTime(long finishTime) {
		this.finishTime = finishTime;
	}
	
	public List<Task> getmaps() {
		return maps;
	}
	
	public void setmaps(List<Task> maps) {
		this.maps = maps;
	}
	
	public List<Task> getreduces() {
		return reduces;
	}
	
	public void setreduces(List<Task> reduces) {
		this.reduces = reduces;
	}
}
