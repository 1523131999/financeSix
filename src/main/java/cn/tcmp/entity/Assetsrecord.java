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
	private Integer samid;
	private Date changedate;
	private Integer userid;
	private double totalassets;
	private Integer pruductid;
	private String changeinformation;
	private Integer changetype;


}
