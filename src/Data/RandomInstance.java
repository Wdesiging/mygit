package Data;

import java.util.Random;

public class RandomInstance {
    
	private String instName;//���������
	private Parameters params;//����ʵ���������
	private String outputPath;//�ؼ�·�����
	private int Job_MapNum;//ִ��������M
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
    private static final java.text.DecimalFormat df = new java.text.DecimalFormat("0.000");
	public void setParams(Parameters params) {
		this.params = params;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getInstName() {
		return instName;
	}
	private static void printTo()throws Exception{
		
	}
}

