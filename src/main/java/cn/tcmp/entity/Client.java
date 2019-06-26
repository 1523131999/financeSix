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
	private Integer clientid;
	private String clientName;
	private Integer clientType;
	private String certnumber;
	private Integer Fmid;
	private Integer Fact;
	private Integer clientstatus;
	private Integer clientlevel;
	private Integer risklevelTE;
	private Integer risklevelFE;
	private String FinanID;
	//联系人
	private Secondarymanager secondarymanager;
	private Integer assset;
	private Integer gender;
	private Integer certtime;
	private Date birthdateZC;
	private Date birthdateLC;
	private String nationality;
	private Integer marital;
	private String nation;
	private String phone;
	private String address;
	private String eamil;
	private String occpation;
	private String remarks;
	private Integer contactpreference;
	private Integer controller;
	private Integer workingyears;
	private String legalname;
	private Integer Lcerttype;
	private String Lcertnumber;
	private String Lcerttime;
	private String scopebusiness;
	private Integer registermoney;
	private Date creationtime;
	private String newfinancialmanager;
	private Integer blacklist;
	private Integer Finance;


}
