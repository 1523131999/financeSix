package cn.tcmp.entity;

import lombok.Data;

/**
 * channel_list  generated at 2019-06-27 15:55:25 by: eric
 */

@Data

/**
 * 公司表 & 渠道表
 * */
public class Channel_list{
	private int ID;
	private Channel_Type ChanneltypeID;//渠道类型ID
	private String Corporatename;
	private String introduce;
	private String ContactName;
	private String Contacttelephone;
	private String ContactEmail;
	private String Documenttype;
	private String IdentificationNumber;
	private String Enclosure;



}
