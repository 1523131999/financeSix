package cn.tcmp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * contacts  generated at 2019-06-26 10:30:13 by: eric
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//联系人表
public class Contacts{
	private int contactid;
	private String contactname;
	private int clienttype;
	private int Lcerttype;
	private String certnumber;
	private int contactstype;
	private String contactsphone;
	private String remarks;


}
