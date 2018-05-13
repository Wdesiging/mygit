package Data;

import java.util.Random;

public class RandomInstance {
    
	private String instName;//工作流标记
	private Parameters params;//生成实例具体参数
	private String outputPath;//关键路径标记
	private int Job_MapNum;//执行数据量M
	private Random rand = new Random(System.nanoTime());//生成随机实例
	
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

