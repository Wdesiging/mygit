package Data;

public class Parameters {
	//正态分布
	private double p_map_num_miu;
	private double p_map_dura_miu;
	private double p_map_num_sig;
	private double p_map_dura_sig;
	
	private double p_reduce_num_miu;
	private double p_reduce_dura_miu;
	private double p_reduce_num_sig;
	private double p_reduce_dura_sig;
	//均匀分布
	private double p_task_num_low;
	private double p_map_dura_low;
	private double p_task_num_high;
	private double p_map_dura_high;
    //用于进行截止期时间的分配划分
	private double p_job_EstimatedFinishTime;//预计截止时间
	private double p_job_ActualStartTime;//实际开始时间
	private double p_job_ActualFinishTime;//实际完成时间
	private double p_job_TimeDifference;//划分的截止时间与实际完成时间的差值
	private double p_job_UnitTimeCost;//单位时间超时成本
	private double P_job_ActualProcessTime;//任务处理时间
	private double p_workflow_UnitAnticipatedIncome;//按时完成单个工作流的收益
	private double p_workflow_AnticipatedIncome;//完成整个工作流的收益
	
	
	private int p_node;//任务节点数量
	private int p_map_slot;//结点map slot数量
	private int p_reduce_slot;//结点reduce slot数量
	
	private int p_jobs;//已处理的任务
	
	private double p_omega;
	public double getP_map_dura_miu() {
		return p_map_dura_miu;
	}

	public void setP_map_dura_miu(double p_map_dura_miu) {
		this.p_map_dura_miu = p_map_dura_miu;
	}


	public double getP_map_dura_sig() {
		return p_map_dura_sig;
	}

	public void setP_map_dura_sig(double p_map_dura_sig) {
		this.p_map_dura_sig = p_map_dura_sig;
	}
	public double getP_task_num_low() {
		return p_task_num_low;
	}

	public void setP_task_num_low(double p_task_num_low) {
		this.p_task_num_low = p_task_num_low;
	}

	public double getP_map_dura_low() {
		return p_map_dura_low;
	}

	public void setP_map_dura_low(double p_map_dura_low) {
		this.p_map_dura_low = p_map_dura_low;
	}

	public double getP_task_num_high() {
		return p_task_num_high;
	}

	public void setP_task_num_high(double p_task_num_high) {
		this.p_task_num_high = p_task_num_high;
	}

	public double getP_map_dura_high() {
		return p_map_dura_high;
	}

	public void setP_map_dura_high(double p_map_dura_high) {
		this.p_map_dura_high = p_map_dura_high;
	}
	public double getp_job_EstimatedFinishTime() {
		return p_job_EstimatedFinishTime;
	}

	public void setp_job_EstimatedFinishTime(double p_job_EstimatedFinishTime) {
		this.p_job_EstimatedFinishTime = p_job_EstimatedFinishTime;
	}
	public double getp_job_ActualStartTime() {
		return p_job_ActualStartTime;
	}

	public void setp_job_ActualStartTime(double p_job_ActualStartTime) {
		this.p_job_ActualStartTime = p_job_ActualStartTime;
	}
	public double getp_job_ActualFinishTime() {
		return p_job_ActualFinishTime;
	}

	public void setp_job_ActualFinishTime(double p_job_ActualFinishTime) {
		this.p_job_ActualFinishTime = p_job_ActualFinishTime;
	}
	public double getp_job_TimeDifference() {
		return p_job_TimeDifference;
	}

	public void setp_job_TimeDifference(double p_job_TimeDifference) {
		this.p_job_TimeDifference = p_job_TimeDifference;
	}
	public double getp_job_UnitTimeCost() {
		return p_job_UnitTimeCost;
	}

	public void setp_job_UnitTimeCost(double p_job_UnitTimeCost) {
		this.p_job_UnitTimeCost = p_job_UnitTimeCost;
	}
	public double getP_job_ActualProcessTime() {
		return P_job_ActualProcessTime;
	}

	public void P_job_ActualProcessTime(double P_job_ActualProcessTime) {
		this.P_job_ActualProcessTime = P_job_ActualProcessTime;
	}
	
	public double getp_workflow_UnitAnticipatedIncome() {
		return p_workflow_UnitAnticipatedIncome;
	}

	public void setp_workflow_UnitAnticipatedIncome(double p_workflow_UnitAnticipatedIncome) {
		this.p_workflow_UnitAnticipatedIncome = p_workflow_UnitAnticipatedIncome;
	}
	public double getp_workflow_AnticipatedIncome() {
		return p_workflow_AnticipatedIncome;
	}

	public void setp_workflow_AnticipatedIncome(double p_workflow_AnticipatedIncome) {
		this.p_workflow_AnticipatedIncome = p_workflow_AnticipatedIncome;
	}
	public double getp_node() {
		return  p_node;
	}

	public void setp_node(int  p_node) {
		this. p_node =  p_node;
	}
	public double getp_map_slot() {
		return  p_map_slot;
	}

	public void setp_map_slot(int p_map_slot) {
		this. p_map_slot =  p_map_slot;
	}
	public double getp_reduce_slot() {
		return  p_reduce_slot;
	}

	public void setp_reduce_slot(int p_reduce_slot) {
		this. p_reduce_slot =  p_reduce_slot;
    }
	public double getp_jobs() {
		return  p_jobs;
	}

	public void setp_jobs(int p_jobs) {
		this. p_jobs =  p_jobs;
    }
	public double getp_omega() {
		return  p_omega;
	}

	public void setp_omega(int p_omega) {
		this. p_omega =  p_omega;
    }
	
}
