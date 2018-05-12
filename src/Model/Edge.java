package Model;

public class Edge {
	
	private Job source;
	private Job destination;
	private double dataSize;    

	public Edge(Job source, Job destination) {
		this.source = source;
		this.destination = destination;
	}
	
	public double getdatasize() {
		return dataSize;
	}
	
	public void setdatasize(double dataSize) {
		this.dataSize = dataSize;
	}
	
	public Job getSource() {
		return source;
	}
	
	public void setsource(Job source){
		this.source=source;
	}
	
	public Job getdestination() {
		return destination;
	}
	
	public void setdestination(Job destination){
		this.destination=destination;
	}

}
