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
	private Integer assetsid;
	private Client client;

	private Product_list pruduct;
	private String expected;
	private String contractperiod;
	private Date establlishdate;
	private Date expiredate;
	private Integer share;
	private Integer currentshare;
	private Integer currency;
	private Integer typeid;



}
