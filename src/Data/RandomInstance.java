package Data;

import java.util.Random;

public class RandomInstance {
    
	private String instName;//���������
	private Parameters params;//����ʵ���������
	private String outputPath;//�ؼ�·�����
	
	private Random rand = new Random(System.nanoTime());//�������ʵ��
	
	public RandomInstance(Parameters p,String name){
		
	}

    public void ScheduleNewTnstance(){
		
	}
    public void setTaskDistribution(){
    	
    }
    public Parameters getParams() {
		return params;
	}

	public void setParams(Parameters params) {
		this.params = params;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getInstName() {
		return instName;
	}
}

