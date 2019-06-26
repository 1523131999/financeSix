package cn.tcmp.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * assetsrecord  generated at 2019-06-26 10:30:13 by: eric
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//Assetsrecord
public class Assetsrecord{
	private int samid;
	private Date changedate;
	private int userid;
	private double totalassets;
	private int pruductid;
	private String changeinformation;
	private int changetype;


}
