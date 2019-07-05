package cn.tcmp.entity;
import lombok.Data;

import java.sql.*;

/**
 * attached_table  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
public class Attached_table{
	private int AttachedID;
	private String AttachmentName;
	private String AttachmentPath;
	private String AttachmentSize;
	private int CreatorID;//创建人ID
	private Timestamp CreationTime;
	private Item_sheet ProjectID;//项目ID
	private String AnnexDescription;


}
