package cn.tcmp.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * appoIntegerment  generated at 2019-06-26 10:30:13 by: eric
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//预约信息表
public class Appointment{
	//hj
	private Integer appointmentid;
	private Client client;
	private Item_sheet item_sheet;
	private double appoinm;
	private double appoinyear;
	private double subscriptionf;
	private double subscriptiont;
	private Date appoindate;
	private Date lineupsu;
	private Integer appois;
	private Date appoied;
	private Integer businesstype;
	private Integer arrivals;
	private Integer contractstate;
	private Date actualdate;
	private Integer rrstate;


}
