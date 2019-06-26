package cn.tcmp.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * appointment  generated at 2019-06-26 10:30:13 by: eric
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//预约信息表
public class Appointment{
	//hj
	private int appointmentid;
	private int clientid;
	private int projectid;
	private double appoinm;
	private double appoinyear;
	private double subscriptionf;
	private double subscriptiont;
	private Date appoindate;
	private Date lineupsu;
	private int appois;
	private Date appoied;
	private int businesstype;
	private int arrivals;
	private int contractstate;
	private Date actualdate;
	private int rrstate;


}
