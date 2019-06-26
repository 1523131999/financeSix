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
	private Integer blid;
	private String clientname;
	private Date submissiondate;
	private Integer userid;
	private String Initiator;
	private String examinationlink;
	private Integer examinationstatus;
	private String examinationreason;


}
