package com.kota.developer.demo.Model;
import com.kota.developer.demo.Entity.TitleName;
import com.kota.developer.demo.Entity.Typeworking;
import com.kota.developer.demo.Entity.WorkingDate;
import lombok.*;

@Data
public class DataRegister {
    private  String maidName;
    private  String maidAddress;
    private  String maidEmail;
    private  String maidPhone;
    private  String province;
    private  String district;
    private  String canton;

    private Long titlenameId;
    private Long typeworkingId;
    private Long typeworkingDateId;


    public String getMaidName() { return maidName;
    }
    public void setMaidName(String maidName) {
        this.maidName = maidName;
    }

    public String getMaidAddress() {
        return maidAddress;
    }

    public void setMaidAddress(String maidAddress) {
        this.maidAddress = maidAddress;
    }

    public String getMaidEmail() {
        return maidEmail;
    }

    public void setMaidEmail(String maidEmail) {
        this.maidEmail = maidEmail;
    }

    public String getMaidPhone() {
        return maidPhone;
    }

    public void setMaidPhone(String maidPhone) {
        this.maidPhone = maidPhone;
    }

    public String getProvince() { return province; }

    public void setProvince(String province) { this.province = province; }

    public String getDistrict() { return district; }

    public void setDistrict(String district) { this.district = district; }

    public String getCanton() { return canton; }

    public void setCanton(String canton) { this.canton = canton; }

    public Long getTitlenameId() {
        return titlenameId;
    }

    public void setTitlenameId(Long titlenameId) {
        this.titlenameId = titlenameId;
    }

    public Long getTypeworkingId() { return typeworkingId; }

    public void setTypeworkingId(Long typeworkingId) {
        this.typeworkingId = typeworkingId;
    }

    public Long getTypeworkingDateId() {
        return typeworkingDateId;
    }

    public void setTypeworkingDateId(Long typeworkingDateId) {
        this.typeworkingDateId = typeworkingDateId;
    }

    public void setTitleName(TitleName ti) { }

    public void setWorkingDate(WorkingDate workdate) { }

    public void setTypeworking(Typeworking typework) { }
}