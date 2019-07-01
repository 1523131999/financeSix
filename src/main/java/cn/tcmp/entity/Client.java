package cn.tcmp.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * client  generated at 2019-06-26 10:30:13 by: eric
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//客户表
public class Client{
	private Integer clientid;
	private String clientName;
	private Integer clientType;
	private String certnumber;
	private Integer Fmid;
	private Integer Fact;
	private Integer clientstatus;
	private Integer clientlevel;
	private Integer risklevelTE;
	private Integer risklevelFE;
	private String FinanID;
	private Contacts contactsid;//联系人
	private Secondarymanager secondarymanager;
	private Integer assset;
	private Integer gender;
	private Integer certtime;
	private Date birthdateZC;
	private Date birthdateLC;
	private String nationality;
	private Integer marital;
	private String nation;
	private String phone;
	private String address;
	private String eamil;
	private String occpation;
	private String remarks;
	private Integer contactpreference;
	private Integer controller;
	private Integer workingyears;
	private String legalname;
	private Integer Lcerttype;
	private String Lcertnumber;
	private String Lcerttime;
	private String scopebusiness;
	private Integer registermoney;
	private Date creationtime;
	private String newfinancialmanager;
	private Integer blacklist;
	private Integer Finance;
	private Cert certid;//证件id

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public String getCertnumber() {
        return certnumber;
    }

    public void setCertnumber(String certnumber) {
        this.certnumber = certnumber;
    }

    public Integer getFmid() {
        return Fmid;
    }

    public void setFmid(Integer fmid) {
        Fmid = fmid;
    }

    public Integer getFact() {
        return Fact;
    }

    public void setFact(Integer fact) {
        Fact = fact;
    }

    public Integer getClientstatus() {
        return clientstatus;
    }

    public void setClientstatus(Integer clientstatus) {
        this.clientstatus = clientstatus;
    }

    public Integer getClientlevel() {
        return clientlevel;
    }

    public void setClientlevel(Integer clientlevel) {
        this.clientlevel = clientlevel;
    }

    public Integer getRisklevelTE() {
        return risklevelTE;
    }

    public void setRisklevelTE(Integer risklevelTE) {
        this.risklevelTE = risklevelTE;
    }

    public Integer getRisklevelFE() {
        return risklevelFE;
    }

    public void setRisklevelFE(Integer risklevelFE) {
        this.risklevelFE = risklevelFE;
    }

    public String getFinanID() {
        return FinanID;
    }

    public void setFinanID(String finanID) {
        FinanID = finanID;
    }

    public Contacts getContactsid() {
        return contactsid;
    }

    public void setContactsid(Contacts contactsid) {
        this.contactsid = contactsid;
    }

    public Secondarymanager getSecondarymanager() {
        return secondarymanager;
    }

    public void setSecondarymanager(Secondarymanager secondarymanager) {
        this.secondarymanager = secondarymanager;
    }

    public Integer getAssset() {
        return assset;
    }

    public void setAssset(Integer assset) {
        this.assset = assset;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getCerttime() {
        return certtime;
    }

    public void setCerttime(Integer certtime) {
        this.certtime = certtime;
    }

    public Date getBirthdateZC() {
        return birthdateZC;
    }

    public void setBirthdateZC(Date birthdateZC) {
        this.birthdateZC = birthdateZC;
    }

    public Date getBirthdateLC() {
        return birthdateLC;
    }

    public void setBirthdateLC(Date birthdateLC) {
        this.birthdateLC = birthdateLC;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getMarital() {
        return marital;
    }

    public void setMarital(Integer marital) {
        this.marital = marital;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public String getOccpation() {
        return occpation;
    }

    public void setOccpation(String occpation) {
        this.occpation = occpation;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getContactpreference() {
        return contactpreference;
    }

    public void setContactpreference(Integer contactpreference) {
        this.contactpreference = contactpreference;
    }

    public Integer getController() {
        return controller;
    }

    public void setController(Integer controller) {
        this.controller = controller;
    }

    public Integer getWorkingyears() {
        return workingyears;
    }

    public void setWorkingyears(Integer workingyears) {
        this.workingyears = workingyears;
    }

    public String getLegalname() {
        return legalname;
    }

    public void setLegalname(String legalname) {
        this.legalname = legalname;
    }

    public Integer getLcerttype() {
        return Lcerttype;
    }

    public void setLcerttype(Integer lcerttype) {
        Lcerttype = lcerttype;
    }

    public String getLcertnumber() {
        return Lcertnumber;
    }

    public void setLcertnumber(String lcertnumber) {
        Lcertnumber = lcertnumber;
    }

    public String getLcerttime() {
        return Lcerttime;
    }

    public void setLcerttime(String lcerttime) {
        Lcerttime = lcerttime;
    }

    public String getScopebusiness() {
        return scopebusiness;
    }

    public void setScopebusiness(String scopebusiness) {
        this.scopebusiness = scopebusiness;
    }

    public Integer getRegistermoney() {
        return registermoney;
    }

    public void setRegistermoney(Integer registermoney) {
        this.registermoney = registermoney;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public String getNewfinancialmanager() {
        return newfinancialmanager;
    }

    public void setNewfinancialmanager(String newfinancialmanager) {
        this.newfinancialmanager = newfinancialmanager;
    }

    public Integer getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(Integer blacklist) {
        this.blacklist = blacklist;
    }

    public Integer getFinance() {
        return Finance;
    }

    public void setFinance(Integer finance) {
        Finance = finance;
    }

    public Cert getCertid() {
        return certid;
    }

    public void setCertid(Cert certid) {
        this.certid = certid;
    }
}
