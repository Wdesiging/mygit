package Model;

import java.util.ArrayList;

public class Slot {
	
	private int nodeId;
	private int slotId;
	private Stype type;
	
	private ArrayList<Task> tasks = new ArrayList<Task>();
	
	private long FinishTime;
	
	//slot type
	public enum Stype{Map, Reduce}
	
	public Slot(int nodeId, int slotId, Stype type) {
		this.nodeId=nodeId;
		this.slotId = slotId;
		this.type = type;
	}
	
	public int getnodeId(){
		return nodeId;
	}
	
	public void setnodeId(int nodeId){
		this.nodeId=nodeId;
	}
	
	public int getslotId(){
		return slotId;
	}
	
	public void setslotId(int slotId){
		this.slotId=slotId;
	}
	
	public Stype getType() {
		return type;
	}
	
	public void setType(Stype type) {
		this.type = type;
	}
	
	public long getFinishTime() {
		return FinishTime;
	}
	
	public void setFinishTime(long FinishTime) {
		this.FinishTime = FinishTime;
	}
	
	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
	
	public ArrayList<Task> getTasks() {
		return tasks;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
