package cn.tcmp.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * contract  generated at 2019-06-26 10:30:13 by: eric
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//合同信息表
public class Contract{
	private int contractid;
	private String contractnumber;
	private int pruductid;
	private int clientid;
	private double contractmoney;
	private Date contractbd;
	private Date contractjd;

}
