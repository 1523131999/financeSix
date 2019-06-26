package cn.tcmp.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * brokeragerelations  generated at 2019-06-26 10:30:13 by: eric
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//经纪关系变更表
public class Brokeragerelations{
	private int blid;
	private String clientname;
	private Date submissiondate;
	private int userid;
	private String Initiator;
	private String examinationlink;
	private int examinationstatus;
	private String examinationreason;


}
