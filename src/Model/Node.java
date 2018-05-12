package Model;

public class Node {

	public static final int RATE = 200;//250;//300;
	
	private int nodeId;
	private int mapSlotNum;
	private int reduceSlotNum;
	private int Mspeed;
	private int Rspeed;
	
	public Node(int nodeId, int mapSlotNum, int reduceSlotNum, int Mspeed, int Rspeed) {
		this.nodeId = nodeId;
		this.mapSlotNum = mapSlotNum;
		this.reduceSlotNum = reduceSlotNum;
		this.Mspeed=Mspeed;
		this.Rspeed=Rspeed;
	}
	
	public int getnodeId(){
		return nodeId;
	}
	
	public void setnodeId(int nodeId){
		this.nodeId=nodeId;
	}
	
}
