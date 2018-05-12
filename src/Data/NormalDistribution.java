package Data;

public class NormalDistribution {
    private double miu;
    private double sigma;//标准差的平方
    
    public NormalDistribution(double m, double s)
	{
		this.miu = m;
		this.sigma = s;
	}
    private double seftRandom(double[] r){
		double base,u,v,p,temp1,temp2,temp3;
		//基数
		base = 256.0;
		//两个常数 uv;
		u = 17.0;
		v = 139.0;
		//计算总值
		temp1 = u*(r[0])+v;
		//计算商
		temp2 = (int)(temp1/base);
		//计算余数,1到base的余数
		temp3 = temp1 - temp2*base;
		//更新随机种子，为下一次使用
		r[0] = temp3;
		//随机数赋值 ，获取[0,1]的随机数
		p = r[0]/base;
		return p;
	}
    public double randZT(double u,double t,double[]r,double n){
		int i;
		double total = 0.0;
		double result;
		for(i = 0;i<n;i++){
			//累加
			total += seftRandom(r);
		}
		//得到的随机数
		result = u+t*((total-n/2.0)/Math.sqrt(n/12));
		return result;
	}
	public double getNext()
	{
		/*double[] r = {5.0};
		double n = 12.0;
		return randZT(this.miu, this.sigma, r, n);*/
		double n = 12;
		double x = 0, temp = n;
		do {
			x = 0;
			for (int i = 0; i < n; i++)
				x += Math.random();
			x = (x - temp / 2) / Math.sqrt(temp / 12);
			x = miu + x * Math.sqrt(sigma);
		} while (x <= 0); 
		
		return x;
	}
	public double getMiu() {
		return miu;
	}
	public void setMiu(double miu) {
		this.miu = miu;
	}
	public double getSigma() {
		return sigma;
	}
	public void setSigma(double sigma) {
		this.sigma = sigma;
	}
	public static void main(String[] args) {
		
		//循环调用
		//for(i = 0;i<10;i++){
			//System.out.printf("%10.5f\n",randZT(u,t,r,n));
		//}
		System.out.println();
		System.out.println(new NormalDistribution(50,200).getNext());
		System.out.println(new NormalDistribution(100,300).getNext());
		System.out.println(new NormalDistribution(19,145).getNext());
		System.out.println(new NormalDistribution(154,558).getNext());

	}
}
