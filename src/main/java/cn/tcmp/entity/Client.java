package cn.tcmp.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * client  generated at 2019-06-26 10:30:13 by: eric
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//客户表
public class Client{
	private int clientid;
	private String clientName;
	private int clientType;
	private String certnumber;
	private int Fmid;
	private int Fact;
	private int clientstatus;
	private int clientlevel;
	private int risklevelTE;
	private int risklevelFE;
	private String FinanID;
	private String contacts;
	private int assset;
	private int gender;
	private int certtime;
	private Date birthdateZC;
	private Date birthdateLC;
	private String nationality;
	private int marital;
	private String nation;
	private String phone;
	private String address;
	private String eamil;
	private String occpation;
	private String remarks;
	private int contactpreference;
	private int controller;
	private int workingyears;
	private String legalname;
	private int Lcerttype;
	private String Lcertnumber;
	private String Lcerttime;
	private String scopebusiness;
	private int registermoney;
	private Date creationtime;
	private String newfinancialmanager;
	private int blacklist;
	private int Finance;


}
