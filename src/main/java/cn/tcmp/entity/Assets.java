package cn.tcmp.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * assets  generated at 2019-06-26 10:30:13 by: eric
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//资产信息表
public class Assets{
	private int assetsid;
	private int clientid;
	private String productname;
	private int pruductid;
	private String expected;
	private String contractperiod;
	private Date establlishdate;
	private Date expiredate;
	private int share;
	private int currentshare;
	private int currency;
	private int typeid;



}
