package Model;

import java.util.ArrayList;
import java.util.List;

public class Cloud {
	
	private int nodeNum;
	
	private List<Slot> mapSlots = new ArrayList<Slot>();//map�б�
	private List<Slot> reduceSlots = new ArrayList<Slot>();//reduce�б�
	
	public Cloud(int nodeNum) {
		this.nodeNum = nodeNum;
	}
	
	public List<Slot> getmapSlots(){
		return mapSlots;
	}
	
	public void setmapSlots(List<Slot> mapSlots){
		this.mapSlots=mapSlots;
	}
	
	public List<Slot> getreduceSlots(){
		return reduceSlots;
	}
	
	public void setreduceSlots(List<Slot> reduceSlots){
		this.reduceSlots=reduceSlots;
	}

}
