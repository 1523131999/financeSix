package cn.tcmp.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * enclosure  generated at 2019-06-26 10:30:13 by: eric
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//附件表
public class Enclosure{
	private Integer enclosureid;
	private String filename;
	private double filesize;
	private String founder;
	private Date created;
	private String annexnote;



}
